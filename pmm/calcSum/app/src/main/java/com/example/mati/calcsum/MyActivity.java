package com.example.mati.calcsum;

import android.app.Activity;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.EditText;
import android.widget.Toast;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        final Button calcular = (Button) findViewById(R.id.button);
        final RadioGroup rg = (RadioGroup) findViewById(R.id.rdg);
        rg.clearCheck();


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){

            rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                if( group.getCheckedRadioButtonId()==R.id.r1)
                    CalcSuma();

                if( group.getCheckedRadioButtonId()==R.id.r2)
                    CalcResta();

                 }
             });


          }
        });



    }

    public void CalcSuma () {
        EditText n1 = (EditText) findViewById(R.id.editText2);
        EditText n2 = (EditText) findViewById(R.id.editText);
        int Numero1 = Integer.parseInt(n1.getText().toString());
        int Numero2 = Integer.parseInt(n2.getText().toString());
        int Total = Numero1+Numero2;
        Toast.makeText(this, "El resultado de la suma es: " +Total, Toast.LENGTH_LONG).show();

    }
    public void CalcResta () {
        EditText n1 = (EditText) findViewById(R.id.editText2);
        EditText n2 = (EditText) findViewById(R.id.editText);
        int Numero1 = Integer.parseInt(n1.getText().toString());
        int Numero2 = Integer.parseInt(n2.getText().toString());
        int Total = Numero1-Numero2;
        Toast.makeText(this, "El resultado de la resta es: " +Total, Toast.LENGTH_LONG).show();

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
