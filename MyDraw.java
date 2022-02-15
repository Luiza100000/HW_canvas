package com.example.androidpaint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class MyDraw extends View {

    private Context context;
//    private Bitmap bitmap;

    public MyDraw(Context context) {
        super(context);
        this.context = context;

//        bitmap = BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher);
    }

    @Override
    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        Paint paint1 = new Paint();
        Paint paint2 = new Paint();
        Paint paint3 = new Paint();
        Paint paint4 = new Paint();
        paint.setColor(Color.RED);
        paint1.setColor(Color.YELLOW);
        paint2.setColor(Color.GREEN);
        paint3.setColor(Color.DKGRAY);
        paint4.setColor(Color.LTGRAY);

        for (float i = 1; i <= 15; i++) {
            canvas.drawLine(0.0f, 0.0f*i, 300.0f, 50.0f*i, paint1);
        }
//        paint.setTextSize(70.0f);
//        canvas.drawText("Hello", 100, 100, paint);
        canvas.drawCircle(60.0f, 60.0f, 100, paint1);
        canvas.drawLine(0.0f, 1800.0f, 1200.0f,1800.0f, paint1);
        canvas.drawRect(0.0f, 1800.0f, 1800f, 2600.0f, paint2);
        canvas.drawRect(200.0f, 1600.0f, 700f, 2000.0f, paint3);
        canvas.drawLine(200.0f, 1600.0f, 450.0f,1250.0f, paint3);
        canvas.drawLine(450.0f,1250.0f,700.0f,1600.0f, paint3);
        canvas.drawCircle(450.0f,1500.0f,70, paint4);
        canvas.drawRect(850.0f, 1820.0f, 900.0f, 2030.0f, paint4);

        RectF oval = new RectF(750, 1250, 1000, 1850);
        canvas.drawOval(oval, paint);

        canvas.drawRect(220.0f, 1730.0f, 350f, 1880.0f, paint1);
        canvas.drawRect(500.0f, 1720.0f, 630.0f, 2000.0f, paint4);
//        canvas.drawRect(0.0f, 1800.0f, 1800f, 2600.0f, paint2);
        for (float i = 1; i <= 15; i++) {
            canvas.drawLine(220.0f, 10.0f*i, 350.0f, 1880.0f*i, paint1);
        }
    }


//        canvas.drawBitmap(bitmap,350.0f, 350.0f, paint);

}
