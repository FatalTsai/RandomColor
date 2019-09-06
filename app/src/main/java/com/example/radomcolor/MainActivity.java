package com.example.radomcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TextView tvxR,tvxG,tvxB;
    View colorBlock;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         tvxR = (TextView)findViewById(R.id.tvxR);
         tvxB = (TextView)findViewById(R.id.tvxB);
         tvxG = (TextView)findViewById(R.id.tvxG);
         colorBlock =findViewById(R.id.colorBlock);

    }
    public void changeColor(View v) {


        Random x = new Random();
        int red = x.nextInt(256);
        tvxR.setText("red : " + red);
        tvxR.setTextColor(Color.rgb(red, 0, 0));

        int green = x.nextInt(256);
        tvxG.setText("green : " + green);
        tvxG.setTextColor(Color.rgb(0, green, 0));

        int blue = x.nextInt(256);
        tvxB.setText("blue : " + blue);
        tvxB.setTextColor(Color.rgb(0, 0, blue));

        colorBlock .setBackgroundColor(Color.rgb(red,green,blue));
    }
}
