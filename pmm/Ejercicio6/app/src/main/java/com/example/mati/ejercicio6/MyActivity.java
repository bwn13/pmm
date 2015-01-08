package com.example.mati.ejercicio6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MyActivity extends Activity {

    public static int COD_RESPUESTA = 0;
    public static int REQUEST_CODE = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        final Button b1 = (Button) findViewById(R.id.button);
        final Button b2 = (Button) findViewById(R.id.button2);

     //   if (savedInstanceState != null) {
       //     final String mensajePasado = savedInstanceState.getString("Vuelvo de actividad 2");
         //   final String mensajePasado2 = savedInstanceState.getString("Vuelvo de actividad 3");

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent miIntent = new Intent(MyActivity.this, actividad2.class);
                    startActivity(miIntent);
                    //Bundle miBundle = new Bundle();
                    //miBundle.putString("Vuelvo de actividad 2", mensajePasado);
                    //miIntent.putExtras(miBundle);
                    startActivityForResult(miIntent, COD_RESPUESTA);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent miIntent = new Intent(MyActivity.this, actividad3.class);
                    startActivity(miIntent);
                    //Bundle miBundle = new Bundle();
                    //miBundle.putString("Vuelvo de actividad 3", mensajePasado2);
                    //miIntent.putExtras(miBundle);
                    startActivityForResult(miIntent, COD_RESPUESTA);
                }
            });

        }

    //}

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            // cogemos el valor devuelto por la otra actividad
            String result = data.getStringExtra("result");
            // enseñamos al usuario el resultado
            Toast.makeText(this, "ParametrosActivity devolvió: " + result, Toast.LENGTH_LONG).show();
        }
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

