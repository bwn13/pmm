package com.example.mati.appuno;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by mati on 16/10/14.
 */
public class ClaseTabla extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
}
    public void cmdCerrarClick (View v) {
        finish();
    }

}