package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button mButton;
private Button dButton;
private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.bt1);
        mButton.setOnClickListener(this);
        dButton = findViewById(R.id.bte);
        dButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt1:
                mText=findViewById(R.id.txt1);
                mText.setText("Hiiiii");
                break;
            case  R.id.bte:
                mText=findViewById(R.id.txt1);
                mText.setText("Hello World");
                break;
        }



    }
}
