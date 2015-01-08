package com.example.mati.tablelayoutcolor;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;



public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        final Button bred = (Button) findViewById(R.id.button);
        final Button byellow = (Button) findViewById(R.id.button2);
        final Button bblue = (Button) findViewById(R.id.button3);
        final Button bclear = (Button) findViewById(R.id.button4);
        final TextView fondocolor = (TextView) findViewById(R.id.textview);


        bred.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
               fondocolor.setBackgroundColor(Color.RED);
            }
        });
        byellow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                fondocolor.setBackgroundColor(Color.YELLOW);
            }
        });
        bblue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                fondocolor.setBackgroundColor(Color.BLUE);
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                fondocolor.setBackgroundColor(Color.WHITE);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
