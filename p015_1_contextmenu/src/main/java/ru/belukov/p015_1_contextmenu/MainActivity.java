package ru.belukov.p015_1_contextmenu;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvColor, tvSize;

    /*
    final int MENU_COLOR_RED = 1;
    final int MENU_COLOR_GREEN = 2;
    final int MENU_COLOR_BLUE = 3;
    final int MENU_COLOR_YELLOW = 4;
    */

    final int MENU_SIZE_22 = 4;
    final int MENU_SIZE_26 = 5;
    final int MENU_SIZE_30 = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvColor = (TextView) findViewById(R.id.tvColor);
        tvSize = (TextView) findViewById(R.id.tvSize);

        //registerForContextMenu(tvColor);
        tvColor.setOnCreateContextMenuListener(new ContextMenuTvColor(this));
        registerForContextMenu(tvSize);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        switch(v.getId()) {
            /*
            case R.id.tvColor:
                menu.add(0, MENU_COLOR_RED, 0, "Red");
                menu.add(0, MENU_COLOR_GREEN, 0, "green");
                menu.add(0, MENU_COLOR_BLUE, 0, "Blue");
                break;
            */
            case R.id.tvSize:
                menu.add(0, MENU_SIZE_22, 0, "22");
                menu.add(0, MENU_SIZE_26, 0, "26");
                menu.add(0, MENU_SIZE_30, 0, "30");
                break;

        }
    }

    public boolean onContextItemSelected(MenuItem item) {
        // TODO Auto-generated method stub

        boolean res = true;
        switch (item.getGroupId()) {

            case ContextMenuTvColor.CONEXT_MENU_GROUP:
                res = ContextMenuTvColor.onContextItemSelected(item, tvColor);
                break;

            default:
                switch (item.getItemId()) {

                    // пункты меню для tvSize
                    case MENU_SIZE_22:
                        tvSize.setTextSize(22);
                        tvSize.setText("Text size = 22");
                        break;
                    case MENU_SIZE_26:
                        tvSize.setTextSize(26);
                        tvSize.setText("Text size = 26");
                        break;
                    case MENU_SIZE_30:
                        tvSize.setTextSize(30);
                        tvSize.setText("Text size = 30");
                        break;
                }
                break;
        }

        return res && super.onContextItemSelected(item);
    }
}

class ContextMenuTvColor implements View.OnCreateContextMenuListener {


    public static final int MENU_COLOR_RED = 1;
    public static final int MENU_COLOR_GREEN = 2;
    public static final int MENU_COLOR_BLUE = 3;
    public static final int MENU_COLOR_YELLOW = 4;

    public static final int CONEXT_MENU_GROUP = 1;

    Activity activity;
    public ContextMenuTvColor(Activity _act) {
        super();
        activity = _act;
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        menu.add(ContextMenuTvColor.CONEXT_MENU_GROUP, MENU_COLOR_RED, 0, "Red");
        menu.add(ContextMenuTvColor.CONEXT_MENU_GROUP, MENU_COLOR_GREEN, 0, "green");
        menu.add(ContextMenuTvColor.CONEXT_MENU_GROUP, MENU_COLOR_BLUE, 0, "Blue");
        menu.add(ContextMenuTvColor.CONEXT_MENU_GROUP, MENU_COLOR_YELLOW, 0, "Yellow");

        /*
        // не получается задать groupId через XML
        activity.getMenuInflater().inflate(R.menu.tv_color_context, menu);
        */
    }

    public static boolean onContextItemSelected(MenuItem item, TextView tvColor) {
        // TODO Auto-generated method stub
        switch (item.getItemId()) {
            // пункты меню для tvColor
            case ContextMenuTvColor.MENU_COLOR_RED:
                tvColor.setTextColor(Color.RED);
                tvColor.setText("Text color = red");
                break;
            case ContextMenuTvColor.MENU_COLOR_GREEN:
                tvColor.setTextColor(Color.GREEN);
                tvColor.setText("Text color = green");
                break;
            case ContextMenuTvColor.MENU_COLOR_BLUE:
                tvColor.setTextColor(Color.BLUE);
                tvColor.setText("Text color = blue");
                break;
            case ContextMenuTvColor.MENU_COLOR_YELLOW:
                tvColor.setTextColor(Color.YELLOW);
                tvColor.setText("Text color = yellow");
                break;
        }
        return true;
    }
}
