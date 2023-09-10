package imun.hacktiv8.assessment2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView poinct;
    private Button countBtn;
    private EditText textcnt;
    private int scoretcnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        poinct = findViewById(R.id.pointcount);
        countBtn = findViewById(R.id.btncount);
        textcnt = findViewById(R.id.textcount);

        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tambahkan satu poin setiap kali tombol diklik
                scoretcnt++;
                poinct.setText(String.valueOf(scoretcnt));
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoretcnt", scoretcnt);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            scoretcnt = savedInstanceState.getInt("scoretcnt");
            poinct.setText(String.valueOf(scoretcnt));
        }
    }
}
