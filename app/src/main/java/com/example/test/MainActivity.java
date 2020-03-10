package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button pressButton;
    TextView funFactText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        pressButton = findViewById(R.id.pressButton);
        funFactText = findViewById(R.id.funFactText);

        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomAction();
            }
        });
    }

    public void randomAction(){
    final String[] fatArray = {"We need Soda.",
            "I am tired.",
            "i need to sell you.",
            "what's your number",
            "can i give you something",
            "were is that place",
            "the best food is at tony's",
            "what time is it today",
            "i need to write a book",
            "don't get sick"};

     Random random = new Random();
     int randomFact = random.nextInt(fatArray.length);

     funFactText.setText(fatArray[randomFact]);
    }
}


