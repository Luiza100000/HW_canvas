package com.example.androidpaint;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(new MyDraw(this));
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = (LinearLayout) this.findViewById(R.id.lu);

        MyDraw myDraw = new MyDraw(this);

        linearLayout.addView(myDraw);
    }
}
