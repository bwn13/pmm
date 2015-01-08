package com.example.mati.figurasaleatorias;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by mati on 27/11/14.
 */
public class DrawShapes1 extends Activity {
    private RandomShapeView mDrawingArea;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_shapes1);
        mDrawingArea = (RandomShapeView) findViewById(R.id.drawing_area);
    }

    public void redraw(View clickedButton) {
        mDrawingArea.invalidate();
    }
}