package com.nikhilsinha.GuessTheNumber;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class GuessTheNumber extends Activity {

    final int _randomNumber = new Random().nextInt(100) + 1;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final EditText tb1 = (EditText)findViewById(R.id.editText);
        final TextView tv1 = (TextView)findViewById(R.id.textView);
                ((Button) findViewById(R.id.button)).setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String numAsStr = tb1.getText().toString();
                        int num = Integer.parseInt(numAsStr);
                        if(num > _randomNumber){
                            tv1.setText("Too High");
                        }
                        else if(num < _randomNumber){
                            tv1.setText("Too Low");
                        }
                        else {
                            tv1.setText("Correct");
                        }
                    }
                });
    }
}
