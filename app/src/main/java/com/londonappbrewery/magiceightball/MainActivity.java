package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Button;
import android.view.View;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView)findViewById(R.id.image_eightBall);
        final int[] ballArray = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        final Button button = (Button)findViewById(R.id.askButton);
        final Random random = new Random();

        button.setOnClickListener( new View.OnClickListener()
        {
            public void onClick (View v){
                int next = random.nextInt(5);
                ballDisplay.setImageResource(ballArray[next]);

            }
        });

    }
}
