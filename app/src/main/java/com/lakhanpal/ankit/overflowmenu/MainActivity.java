package com.lakhanpal.ankit.overflowmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {  //calls automatically when u select from overView menu
        //this will be called when user selects overView option

        RelativeLayout main_view = (RelativeLayout) findViewById(R.id.mainView);
        TextView Text1=(TextView)findViewById(R.id.textView);

        switch (item.getItemId()) {
            case R.id.Menu1:

                if (item.isChecked())          //checks if the item is checked in overview menu
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.RED);
                Text1.setText("Go Fuck Yourself");
                return true;   //to tell we done this event

            case R.id.Menu2:

                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.GREEN);
                Text1.setText("Thats a fucking nice choice");
                return true;   //to tell we done this event

            case R.id.Menu3:

                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.YELLOW);
                Text1.setText("Looks like shit");
                return true;   //to tell we done this event

            case R.id.Menu4:
            if (item.isChecked())
                item.setChecked(false);
            else
                item.setChecked(true);
            main_view.setBackgroundColor(Color.MAGENTA);
                Text1.setText("Thats the classic baby");
            return true;   //to tell we done this event

            default:super.onOptionsItemSelected(item);//if none of all selected then we return this
                //so that no problem uccers
        }
    return true;
    }

}