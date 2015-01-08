package com.example.mati.ejercicio1_t3;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
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


            Paint miPincel_C= new Paint();
            miPincel_C.setColor(Color.MAGENTA);
            miPincel_C.setStyle(Paint.Style.STROKE);
            miPincel_C.setStrokeWidth(10);

            Paint miPincel_P= new Paint();
            miPincel_P.setColor(Color.CYAN);
            miPincel_P.setStyle(Paint.Style.STROKE);
            miPincel_P.setStrokeWidth(10);

            Paint miPincel_R= new Paint();









            lienzo.drawCircle(350, 500, 150, miPincel_C);
            lienzo.drawPoint(lienzo.getWidth()/2,lienzo.getHeight()/2,miPincel_P);

            miPincel_R.setColor(Color.RED);
            miPincel_R.setStrokeWidth(100);
            lienzo.drawPoint(10,0,miPincel_R);
            miPincel_R.setColor(Color.YELLOW);
            miPincel_R.setStrokeWidth(100);
            lienzo.drawPoint(800,300,miPincel_R);
            miPincel_R.setColor(Color.GRAY);
            miPincel_R.setStrokeWidth(100);
            lienzo.drawPoint(800,0,miPincel_R);
            miPincel_R.setColor(Color.GREEN);
            miPincel_R.setStrokeWidth(100);
            lienzo.drawPoint(10,800,miPincel_R);




            //lienzo.drawRect(this.getWidth()+10, 500,this.getHeight()-5,600, miPincel_R);
             //lienzo.drawRect(0, 0, getWidth()-400, getHeight() -600, miPincel_R);
             //lienzo.drawRect(700, 0, this.getWidth()-500, this.getHeight()-750, miPincel_R2);




        }
    }

}