package com.kundan.imagechanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeImage=findViewById(R.id.button);
        final ImageView leftImage=findViewById(R.id.left_image);
        final ImageView rightImage=findViewById(R.id.right_image);
        final int[] animalArray={R.drawable.panda,R.drawable.pork,R.drawable.rat,R.drawable.images};

        changeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator=new Random();
                Random randomGenerator2=new Random();
                int number=randomGenerator.nextInt(4);
                int number2=randomGenerator2.nextInt(4);

                leftImage.setImageResource(animalArray[number]);
                rightImage.setImageResource(animalArray[number2]);


            }
        });



    }
}
