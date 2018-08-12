package in.manasojha.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbtn;
        rollbtn =(Button) findViewById(R.id.roll_btn);

        final ImageView leftDice =(ImageView) findViewById(R.id.left_dice);
        final ImageView rightDice = (ImageView) findViewById(R.id.right_dice);
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dice", "button is clicked");
                Random number = new Random();
                int num = number.nextInt(6);

                leftDice.setImageResource(diceArray[num]);

                num = number.nextInt(6);
                rightDice.setImageResource(diceArray[num]);


            }
        });


    }
}
