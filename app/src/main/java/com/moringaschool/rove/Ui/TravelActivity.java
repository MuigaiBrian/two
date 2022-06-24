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

public class TravelActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.button3)
    MaterialButton goOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
        ButterKnife.bind(this);
       goOn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == goOn){
            Intent intent = new Intent(TravelActivity.this, AccomodationActivity.class);
            startActivity(intent);
        }

    }
}