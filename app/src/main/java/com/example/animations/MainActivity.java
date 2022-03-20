package com.example.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button6);
        btn6=findViewById(R.id.button5);
        btn7=findViewById(R.id.button7);
        btn8=findViewById(R.id.button8);
        btn9=findViewById(R.id.button9);
        tv1=findViewById(R.id.textView);

        btn1.getBackground().setAlpha(65);
        btn2.getBackground().setAlpha(65);
        btn3.getBackground().setAlpha(65);
        btn4.getBackground().setAlpha(65);
        btn5.getBackground().setAlpha(65);
        btn6.getBackground().setAlpha(65);
        btn7.getBackground().setAlpha(65);
        btn8.getBackground().setAlpha(65);
        btn9.getBackground().setAlpha(65);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anm = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                tv1.startAnimation(anm);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anm = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                tv1.startAnimation(anm);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anm = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                tv1.startAnimation(anm);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anm = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                tv1.startAnimation(anm);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anm = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
                tv1.startAnimation(anm);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation  anm = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
                tv1.startAnimation(anm);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation  anm = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
                tv1.startAnimation(anm);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation  anm = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);
                tv1.startAnimation(anm);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.clearAnimation();
                Toast.makeText(MainActivity.this, "Animation Cleared", Toast.LENGTH_SHORT).show();
            }
        });

    }
}