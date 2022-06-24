package com.moringaschool.rove.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;
import com.moringaschool.rove.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.proceed) MaterialButton proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        proceed.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == proceed){
            Intent intent = new Intent(MainActivity.this, TravelActivity.class);
            startActivity(intent);
        }

    }
}