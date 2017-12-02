package com.example.workstation.firstandthings;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by workstation on 2/12/17.
 */

public class Me extends AppCompatActivity{
    private int ctr=0;
    private ImageView image;
    private int[] imageArray= {R.drawable.b1, R.drawable.b2,
            R.drawable.b3, R.drawable.b4,
            R.drawable.b5, R.drawable.b6,
            R.drawable.b7, R.drawable.b8,
            R.drawable.b9, R.drawable.b10,
            R.drawable.b11, R.drawable.b12, R.drawable.b13};

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);

        image = (ImageView)findViewById(R.id.imageMe);

        handler = new Handler();
        Runnable runnable = new Runnable() {
            int i = 0;

            public void run() {
                image.setImageResource(imageArray[i]);
                i++;
                if (i > imageArray.length - 1) {
                    i = 0;
                }
                handler.postDelayed(this, 2000);
            }
        };
        handler.postDelayed(runnable, 2000);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(getBaseContext(),HomeActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
