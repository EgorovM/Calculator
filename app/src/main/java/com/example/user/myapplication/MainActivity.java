package com.example.user.myapplication;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.hardware.camera2.params.BlackLevelPattern;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText num1_txt;
    private EditText num2_txt;
    private TextView result;
    private Button sum_btn, min_btn, pr_btn, deg_btn;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,C,getRes,clear,point;
    private boolean fl = false, getted = false, getA = false;
    private int method;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton() ;
    }
    public void numberClick(char num){
        if(getted==true && getA!=true) {
            num1_txt.setText("");
            num2_txt.setText("");
            result.setText("");
            getted = false;
            getA=false;
        }

        if(fl == false) {
            if (!num1_txt.getText().toString().equals("0"))
                num1_txt.setText(num1_txt.getText().toString() + num);
        }
        else {
            if (!num2_txt.getText().toString().equals("0"))
                num2_txt.setText(num2_txt.getText().toString() + num);
        }
    }

    public void addListenerOnButton (){
        sum_btn  = (Button) findViewById(R.id.sum_btn);
        min_btn  = (Button) findViewById(R.id.min_btn);
        pr_btn   = (Button) findViewById(R.id.pr_btn);
        deg_btn  = (Button) findViewById(R.id.deg_btn);
        b1       = (Button) findViewById(R.id.b1);
        b2       = (Button) findViewById(R.id.b2);
        b3       = (Button) findViewById(R.id.b3);
        b4       = (Button) findViewById(R.id.b4);
        b5       = (Button) findViewById(R.id.b5);
        b6       = (Button) findViewById(R.id.b6);
        b7       = (Button) findViewById(R.id.b7);
        b8       = (Button) findViewById(R.id.b8);
        b9       = (Button) findViewById(R.id.b9);
        b0       = (Button) findViewById(R.id.b0);
        C        = (Button) findViewById(R.id.C);
        clear    = (Button) findViewById(R.id.clear);
        point    = (Button) findViewById(R.id.point);
        getRes   = (Button) findViewById(R.id.getResult);
        result   = (TextView) findViewById(R.id.result);
        num1_txt = (EditText) findViewById(R.id.num1_txt);
        num2_txt = (EditText) findViewById(R.id.num2_txt);

        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numberClick('1');
                    }
                }
        );

        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numberClick('2');
                    }
                }
        );

        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numberClick('3');
                    }
                }
        );

        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numberClick('4');
                    }
                }
        );

        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numberClick('5');
                    }
                }
        );

        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numberClick('6');
                    }
                }
        );

        b7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numberClick('7');
                    }
                }
        );

        b8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numberClick('8');
                    }
                }
        );

        b9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numberClick('9');
                    }
                }
        );

        b0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numberClick('0');
                    }
                }
        );

        clear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(fl==false){
                            if (num1_txt.getText().toString().length() != 0 && getted!=true)
                                num1_txt.setText(num1_txt.getText().toString().substring(0,num1_txt.getText().toString().length()-1));
                        }
                        else{
                            if (num2_txt.getText().toString().length() != 0)
                                num2_txt.setText(num2_txt.getText().toString().substring(0,num2_txt.getText().toString().length()-1));
                        }
                    }
                }
        );

        point.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(fl==false) {
                            if (num1_txt.getText().toString().length() != 0 && !num1_txt.getText().toString().contains("."))
                                num1_txt.setText(num1_txt.getText().toString() + ".");
                        }
                        else {
                            if (num2_txt.getText().toString().length() != 0 && !num2_txt.getText().toString().contains("."))
                                num2_txt.setText(num2_txt.getText().toString() + ".");
                        }
                    }
                }
        );
        C.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sum_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                        min_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                        pr_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                        deg_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                        fl = false;
                        getted=false;
                        getA=false;
                        num1_txt.setText("");
                        num2_txt.setText("");
                        result.setText("");
                    }
                }
        );

        getRes.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!num1_txt.getText().toString().equals("") && !num2_txt.getText().toString().equals("")){
                            float num1 = Float.parseFloat(num1_txt.getText().toString());
                            float num2 = Float.parseFloat(num2_txt.getText().toString());
                            sum_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            min_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            pr_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            deg_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            fl = false;
                            getted = true;
                            getA=false;
                            if(method == 1)
                                result.setText(Float.toString(num1+num2));
                            else if(method == 2)
                                result.setText(Float.toString(num1-num2));
                            else if(method == 3)
                                result.setText(Float.toString(num1*num2));
                            else if(method == 4)
                                result.setText(Float.toString(num1/num2));
                        }
                    }
                }
        );


        sum_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (num1_txt.getText().toString().length() != 0) {
                            if(getted==true){
                                num1_txt.setText(result.getText().toString());
                                num2_txt.setText("");
                                fl = true;
                                result.setText("");
                                getted = false;
                                getA   = true;
                            }
                            sum_btn.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                            min_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            pr_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            deg_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            fl = true;
                            method = 1;
                        }
                    }
                }
        );

        min_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (num1_txt.getText().toString().length() != 0) {
                            if(getted==true){
                                num1_txt.setText(result.getText().toString());
                                num2_txt.setText("");
                                result.setText("");
                                fl = true;
                                getted = false;
                                getA   = true;
                            }
                            min_btn.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                            sum_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            pr_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            deg_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            fl = true;
                            method = 2;
                        }
                    }
                }
        );

        pr_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (num1_txt.getText().toString().length() != 0) {
                            if(getted==true){
                                num1_txt.setText(result.getText().toString());
                                num2_txt.setText("");
                                result.setText("");
                                getted = false;
                                fl = true;
                                getA   = true;
                            }
                            pr_btn.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                            sum_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            min_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            deg_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            fl = true;
                            method = 3;
                        }
                    }
                }
        );

        deg_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (num1_txt.getText().toString().length() != 0) {
                            if(getted==true){
                                num1_txt.setText(result.getText().toString());
                                num2_txt.setText("");
                                result.setText("");
                                getted = false;
                                fl = true;
                                getA   = true;
                            }
                            deg_btn.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                            sum_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            min_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            pr_btn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                            fl = true;
                            method = 4;
                        }
                    }
                }
        );

    }

}
