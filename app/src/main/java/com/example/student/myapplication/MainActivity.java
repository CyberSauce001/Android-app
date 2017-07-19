package com.example.student.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.button);
        final Button color = (Button) findViewById(R.id.color);


        button.setOnClickListener(new View.OnClickListener() {
            private EditText userinput;

            @Override
            public void onClick(View view) {
                TextView text = (TextView) findViewById(R.id.textView);
                text.setText("You have entered: ");
                button.setText("I been clicked!");
                Toast.makeText(getApplicationContext(), "Welcome to Android", Toast.LENGTH_LONG).show();

                userinput = (EditText) findViewById(R.id.in);
                TextView output = (TextView) findViewById(R.id.out);
                output.setText(userinput.getText());

            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                RelativeLayout background = (RelativeLayout) findViewById(R.id.backgroundId);
                background.setBackgroundColor(color);
            }
        });
    }
}
