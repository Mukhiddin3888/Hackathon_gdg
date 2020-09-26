package com.example.hackathon101;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CardView crvAgenda, crdvLocateUs ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialisation of cardViews
        crvAgenda = findViewById(R.id.cdv_agenda);
        crdvLocateUs = findViewById(R.id.cdv_locate_us);

        //set onClickListener
        crvAgenda.setOnClickListener(this);
        crdvLocateUs.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cdv_agenda:{
                Intent i = new Intent(MainActivity.this,ActivityAgenda.class);
                startActivity(i);
                break;
            }
            case R.id.cdv_locate_us:{
                Intent l = new Intent(MainActivity.this,MapActivity.class);
                startActivity(l);
                break;
            }
        }

    }
}