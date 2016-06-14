package com.calculator.cmpe277.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.commons.jexl3.*;


public class MainActivity extends AppCompatActivity {


    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mButton0;
    private Button mButtonDivide;
    private Button mButtonMult;
    private Button mButtonPlus;
    private Button mButtonMinus;
    private Button mButtonClear;
    private Button mButtonPoint;
    private Button mButtonEqual;
    private TextView resultText;
    private String resultExpr="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton0 = (Button) findViewById(R.id.button0);
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton5 = (Button) findViewById(R.id.button5);
        mButton6 = (Button) findViewById(R.id.button6);
        mButton7 = (Button) findViewById(R.id.button7);
        mButton8 = (Button) findViewById(R.id.button8);
        mButton9 = (Button) findViewById(R.id.button9);
        mButtonEqual = (Button) findViewById(R.id.buttonEqual);
        mButtonDivide = (Button) findViewById(R.id.buttonDivide);
        mButtonMult = (Button) findViewById(R.id.buttonMult);
        mButtonPlus = (Button) findViewById(R.id.buttonPlus);
        mButtonMinus = (Button) findViewById(R.id.buttonMinus);
        mButtonClear  = (Button) findViewById(R.id.buttonClear);
        mButtonPoint =  (Button) findViewById(R.id.buttonPoint);
        resultText = (TextView) findViewById(R.id.result);
        if(savedInstanceState!=null){
            resultText.setText(savedInstanceState.getString("res"));
        }
        mButton0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("0");
            }
        });

        mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("1");
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("2");
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("3");
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("4");
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("5");
            }
        });

        mButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("6");
            }
        });

        mButton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("7");
            }
        });

        mButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("8");
            }
        });

        mButton9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("9");
            }
        });

        mButtonPoint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append(".");
            }
        });

        mButtonPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("+");
            }
        });

        mButtonMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("*");
            }
        });

        mButtonDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("/");
            }
        });

        mButtonMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.append("-");
            }
        });

        mButtonClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultText.setText("");
            }
        });

        mButtonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                JexlEngine jexl = new JexlBuilder().create();
                Log.d("befString",String.valueOf(resultText.getText()));
                JexlExpression func = jexl.createExpression(stringToFloat(String.valueOf(resultText.getText())));
                JexlContext context = new MapContext();
                resultText.setText( func.evaluate(context).toString());

                Log.d("result", func.evaluate(context)+"");
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("res",resultText.getText().toString());
    }

    public String stringToFloat(String s){
        Log.d("message","in string to float"+s);
        String k="";
        String returnRes ="";
        for(char c : s.toCharArray()){
            Log.d("valueOfC",String.valueOf(c));
//             if(c!='-'||c!='/'||c!='*'||c!='+') {
//                 Log.d("kvalue", k);
//                 k.concat(String.valueOf(c));
//             }
//            else{
//                 Log.d("message from daffy",k);
//                 returnRes.concat(String.valueOf(Float.parseFloat(k)+c));
//                 k="";
//             }
            if(c!='-'&& c!='/'&&c!='*'&&c!='+'){
                Log.d("numb",String.valueOf(c));
                k=k+c;
                Log.d("numb", k);
            }
            else{
                Log.d("numb","In else"+k);
                returnRes = returnRes+Float.parseFloat(k) + c;
                k="";
            }
        }
        if(k!="")
        returnRes= returnRes + Float.parseFloat(k);
        Log.d("covString",returnRes);
        return returnRes;
    }
}
