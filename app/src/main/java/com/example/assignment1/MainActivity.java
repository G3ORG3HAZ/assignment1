package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity{


    private ImageView flagImageView;
    private Button[] answerButtons;
    private Button submitButton;
    private Country[] data;


    int score;
    int totalQuestion;
    int currentQuestionIndex = 0;
    String selectedAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flagImageView = findViewById(R.id.imageVFlag);

        submitButton = findViewById(R.id.submitButton);

        answerButtons = new Button[] {
                findViewById(R.id.button1),
                findViewById(R.id.button2),
                findViewById(R.id.button3),
                findViewById(R.id.button4),
        };

        data = CountryData.getMockupData();
        totalQuestion = data.length;

        loadNewQuestion();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedAnswer.equals((CountryData.correctAnswers[currentQuestionIndex]))) {
                    score++;
                    Toast toast = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT);
                    toast.show();
                }
                currentQuestionIndex++;
                loadNewQuestion();
            }
        });

        answerButtons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnswer = answerButtons[0].getText().toString();
                answerButtons[0].setBackgroundColor(Color.BLUE);
                answerButtons[1].setBackgroundColor(Color.WHITE);
                answerButtons[2].setBackgroundColor(Color.WHITE);
                answerButtons[3].setBackgroundColor(Color.WHITE);
            }
        });


        answerButtons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnswer = answerButtons[1].getText().toString();
                answerButtons[1].setBackgroundColor(Color.BLUE);
                answerButtons[0].setBackgroundColor(Color.WHITE);
                answerButtons[2].setBackgroundColor(Color.WHITE);
                answerButtons[3].setBackgroundColor(Color.WHITE);

            }
        });
        answerButtons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnswer = answerButtons[2].getText().toString();
                answerButtons[2].setBackgroundColor(Color.BLUE);
                answerButtons[1].setBackgroundColor(Color.WHITE);
                answerButtons[0].setBackgroundColor(Color.WHITE);
                answerButtons[3].setBackgroundColor(Color.WHITE);
            }
        });
        answerButtons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnswer = answerButtons[3].getText().toString();
                answerButtons[3].setBackgroundColor(Color.BLUE);
                answerButtons[1].setBackgroundColor(Color.WHITE);
                answerButtons[2].setBackgroundColor(Color.WHITE);
                answerButtons[0].setBackgroundColor(Color.WHITE);
            }
        });





    }

    private void loadNewQuestion() {


        if(currentQuestionIndex == data.length){
            score = 0;
            currentQuestionIndex = 0;
            loadNewQuestion();
        }


        flagImageView.setImageResource(data[currentQuestionIndex].getFlagImageResourceId());
        answerButtons[0].setText(CountryData.choices[currentQuestionIndex][0]);
        answerButtons[1].setText(CountryData.choices[currentQuestionIndex][1]);
        answerButtons[2].setText(CountryData.choices[currentQuestionIndex][2]);
        answerButtons[3].setText(CountryData.choices[currentQuestionIndex][3]);



        answerButtons[0].setBackgroundColor(Color.WHITE);
        answerButtons[1].setBackgroundColor(Color.WHITE);
        answerButtons[2].setBackgroundColor(Color.WHITE);
        answerButtons[3].setBackgroundColor(Color.WHITE);
    }

    }


