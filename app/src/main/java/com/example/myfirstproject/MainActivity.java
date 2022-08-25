package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<textView> extends AppCompatActivity {
    Button button;
    static int count = 0;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        button = findViewById(R.id.clickButton);
        textView = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                count++;
                button.setText(count+"");

                if (count>10&& count<30) {
                    textView.setText("неплохо");
                }
                    if(count> 40 && count<50){
                        textView.setText("Отлично!");
                    }

                textView.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                                    startActivity(intent);

                                                }
                                            }
                );
               if (count == 10){
                Toast.makeText(getApplicationContext(), "вы набрали 10", Toast.LENGTH_LONG).show();


            }}
        });



            }   }