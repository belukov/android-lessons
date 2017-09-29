package ru.belukov.p008_1_viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.myTextView);
        myTextView.setText("Вася бидораз!");

        Button myBtn = (Button) findViewById(R.id.btnTextChange);
        myBtn.setEnabled(false);

        CheckBox myCb = (CheckBox) findViewById(R.id.cbForCHeck);
        myCb.setChecked(true);



    }
}
