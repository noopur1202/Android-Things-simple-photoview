package com.example.workstation.firstandthings;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    private ImageView techImage,meImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        techImage = (ImageView)findViewById(R.id.techImage);
        meImage = (ImageView)findViewById(R.id.meImage);

        techImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent techIntent = new Intent(getBaseContext(),Tech.class);
                startActivity(techIntent);
            }
        });

        meImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mentent = new Intent(getBaseContext(),Me.class);
                startActivity(mentent);
            }
        });
    }
}
