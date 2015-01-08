package com.example.mati.menucontextual;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.ContextMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;


public class MyActivity extends Activity {


    private static final int MNU_OPC1 = 1;
    private static final int MNU_OPC2 = 2;
    private static final int MNU_OPC3 = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView lblMensaje;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //Obtenemos las referencias a los controles
        lblMensaje = (TextView)findViewById(R.id.LblMensaje);

        //Asociamos los menús contextuales a los controles
        registerForContextMenu(lblMensaje);
    }


    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.menu_ctx_etiqueta, menu);
    }

    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.CtxLblOpc1:
                lblMensaje.setText("Etiqueta: Opcion 1 pulsada!");
                return true;
            case R.id.CtxLblOpc2:
                lblMensaje.setText("Etiqueta: Opcion 2 pulsada!");
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }




    // En este evento actuaremos igual que para los ménus básicos, inflando el menú XML que hayamos creado con las distintas opciones,
    // o creando a mano el menú mediante el método add()
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        menu.add(Menu.NONE, MNU_OPC1, Menu.NONE, "Opcion1")
                .setIcon(android.R.drawable.ic_menu_preferences);
        menu.add(Menu.NONE, MNU_OPC2, Menu.NONE, "Opcion2")
                .setIcon(android.R.drawable.ic_menu_compass);
        menu.add(Menu.NONE, MNU_OPC3, Menu.NONE, "Opcion3")
                .setIcon(android.R.drawable.ic_menu_agenda);

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
