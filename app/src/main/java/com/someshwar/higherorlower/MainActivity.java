package com.someshwar.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber,number;
    Random rand=new Random();
    public void guess(View view) {
        EditText editText=(EditText)findViewById(R.id.numberBox);
        if(editText.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter a  number", Toast.LENGTH_SHORT).show();
        }else {
            Log.i("Info", Integer.toString(randomNumber));
            number = Integer.parseInt(editText.getText().toString());
            if (number > randomNumber) {
                Toast.makeText(this, " greater", Toast.LENGTH_LONG).show();
            } else if (number < randomNumber) {
                Toast.makeText(this, "Smaller", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                randomNumber = rand.nextInt(20) + 1;
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomNumber=rand.nextInt(20)+1;
        //numberBoxText = (EditText) findViewById(R.id.numberBox);
        //number= Integer.parseInt(numberBoxText.toString());
    }

}

