package ru.belukov.p011_1_resvalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout llBottom;
    private static final String TAG = "DEBUG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llBottom = (LinearLayout) findViewById(R.id.llBottom);
        TextView tvBottom = (TextView) findViewById(R.id.tvBottom);
        Button btnBottom = (Button) findViewById(R.id.btnBottom);

        llBottom.setBackgroundResource(R.color.llBottomColor);
        //llBottom.setBackgroundColor(R.color.llBottomColor);
        tvBottom.setText(R.string.tvBottomText);
        btnBottom.setText(R.string.btnBottomText);
    }

    public void btnTopClick (View v) {

        Log.d(TAG, "Нажата верхняя кнопка");
        //llBottom.setBackgroundResource(R.color.llTopColor);
        Toast.makeText(this, "Нажата верхняя кнопка", Toast.LENGTH_SHORT).show();
    }
}
