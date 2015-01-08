package com.example.mati.micanvas;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MiDibujo(this));
    }

    class MiDibujo extends View {
        public MiDibujo(Context c){

            super(c);
        }

        protected void onDraw(Canvas lienzo){


            Paint miPincel= new Paint();
            miPincel.setColor(Color.RED);
            miPincel.setStyle(Paint.Style.STROKE);
            lienzo.drawCircle(350,500,300,miPincel);
            lienzo.drawCircle(350,500,150,miPincel);
            lienzo.drawCircle(350,500,75,miPincel);

            miPincel.setTextSize(60);
            lienzo.drawText("MI CIRCULO",300,900,miPincel);

        }
    }

}