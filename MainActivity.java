package com.example.hinhnen_random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    ArrayList<Integer> arrayImage;
    Button btnrandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnrandom = (Button) findViewById(R.id.Mybutton1);
        linearLayout = (LinearLayout) findViewById(R.id.myLinearlayout);


        btnrandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayImage = new ArrayList<>();
                arrayImage.add(R.drawable.c1_1764659_191004103525);
                arrayImage.add(R.drawable.c2_123);
                arrayImage.add(R.drawable.c4_1234);
                arrayImage.add(R.drawable.c5_1234);

                Random random = new Random();
                int vitri = random.nextInt(arrayImage.size());
                linearLayout.setBackgroundResource(arrayImage.get(vitri));
            }
        });


    }
}