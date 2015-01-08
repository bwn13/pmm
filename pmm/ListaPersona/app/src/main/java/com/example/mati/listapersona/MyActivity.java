package com.example.mati.listapersona;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.TextView;


public class MyActivity extends Activity {
    public ListView Lista;

    private Persona[] datos =
            new Persona[]{
                    new Persona("Nombre1", "Apellido1", 33),
                    new Persona("Nombre2", "Apellido2", 35),
                    new Persona("Nombre3", "Apellido3", 30),
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        AdaptadorPersonas adaptadorPersonas = new AdaptadorPersonas(this);

        Lista = (ListView) findViewById(R.id.LstOpciones);

        Lista.setAdapter(adaptadorPersonas);
        Intent miIntent= new Intent(MyActivity.this, list_persona.class);
        Bundle miBundle=new Bundle();

    }


    class AdaptadorPersonas extends ArrayAdapter<Persona> {

        Activity context;

        AdaptadorPersonas(Activity context) {
            super(context, R.layout.activity_my, datos); // list_persona
            this.context = context;
        }


        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.activity_my, null); // list_persona

            TextView lblNombre = (TextView) item.findViewById(R.id.LblNom);
            lblNombre.setText(datos[position].getNombre());

            TextView lblApellido = (TextView) item.findViewById(R.id.LblApe);
            lblApellido.setText(datos[position].getApellido());

            TextView lblEdad = (TextView) item.findViewById(R.id.LblEdad);
            lblEdad.setText(Integer.toString(datos[position].getEdad()));

            return (item);
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

