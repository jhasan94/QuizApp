package com.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView textViewQuestion;
    private TextView textViewScore;
    private TextView textViewQuestionCount;
    private TextView textViewCountDown;
    private RadioGroup rbGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private Button buttonConfirmNext;

    private List<Question> questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        textViewQuestion = findViewById(R.id.textView_question_id);
        textViewScore = findViewById(R.id.textView_score_id);
        textViewQuestionCount = findViewById(R.id.textView_Qus_count_id);
        textViewCountDown = findViewById(R.id.textView_countDown_id);
        rbGroup = findViewById(R.id.radio_group_id);
        rb1 = findViewById(R.id.radio_button1_id);
        rb2 = findViewById(R.id.radio_button2_id);
        rb3 = findViewById(R.id.radio_button3_id);
        buttonConfirmNext = findViewById(R.id.button_confirm_next);
        QuizDbHelper dbHelper = new QuizDbHelper(this);
        questionList = dbHelper.getAllQuestions();
    }
}
