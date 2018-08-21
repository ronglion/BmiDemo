package com.rong.democ;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText mHeight;
    private EditText mWeight;
    private Button mCalculation;
    private TextView mAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mHeight = (EditText) findViewById(R.id.height);
        mWeight = (EditText) findViewById(R.id.weight);
        mCalculation = (Button) findViewById(R.id.calculation);
        mCalculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAns.setText(calculationBmi());
            }
        });
        mAns = (TextView) findViewById(R.id.ans);
    }

    private String calculationBmi(){
        double bmi = 0;
        double weight = Double.valueOf(mWeight.getText().toString());
        double height = Double.valueOf(mHeight.getText().toString()) / 100;
        Log.e("", "calculationBmi = " + height);
        bmi = weight / Math.pow(height, 2);
        Log.e("", "calculationBmi = " + Math.pow(height, 2));
        Log.e("", "calculationBmi = " + bmi);
        return String.valueOf(bmi);
    }
}
