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

public class Tech extends AppCompatActivity {

    private int ctr=0;
    private ImageView image;
    private int[] imageArray= { R.drawable.a1, R.drawable.a2,
            R.drawable.a3, R.drawable.a4,
            R.drawable.a5, R.drawable.a9,
            R.drawable.a6, R.drawable.a10,
            R.drawable.a7, R.drawable.a11,
            R.drawable.a8, R.drawable.a12,
            R.drawable.a13, R.drawable.a18,
            R.drawable.a14, R.drawable.a17,
            R.drawable.a15, R.drawable.a16, R.drawable.a19};
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);

        image = (ImageView)findViewById(R.id.imageTech);

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
