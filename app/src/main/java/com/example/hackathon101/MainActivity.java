package com.example.hackathon101;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CardView crvAgenda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crvAgenda = findViewById(R.id.cdv_agenda);
        crvAgenda.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cdv_agenda:{
                Intent i = new Intent(MainActivity.this,ActivityAgenda.class);
                startActivity(i);
                break;
            }
        }

    }
}