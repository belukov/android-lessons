package ru.belukov.p010_1_listeners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init views
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
    }

    public void onBtnClick(View v) {


        switch (v.getId()) {

            case R.id.btnOk:
                tvOut.setText("окаюшки");
                break;
            case R.id.btnCancel:
                tvOut.setText("нифигашечки");
                break;
        }
    }
}
