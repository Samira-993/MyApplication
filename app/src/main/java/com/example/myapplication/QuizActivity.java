package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView tvQuestion;
    private Button btnOption1, btnOption2, btnOption3, btnOption4;
    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tvQuestion = findViewById(R.id.tvQuestion);
        btnOption1 = findViewById(R.id.btnOption1);
        btnOption2 = findViewById(R.id.btnOption2);
        btnOption3 = findViewById(R.id.btnOption3);
        btnOption4 = findViewById(R.id.btnOption4);

        questions = QuestionRepository.getQuestions();
        displayQuestion();

        // Обработчики нажатий на кнопки
        btnOption1.setOnClickListener(v -> checkAnswer(0));
        btnOption2.setOnClickListener(v -> checkAnswer(1));
        btnOption3.setOnClickListener(v -> checkAnswer(2));
        btnOption4.setOnClickListener(v -> checkAnswer(3));
    }

    private void displayQuestion() {
        if (currentQuestionIndex < questions.size()) {
            Question currentQuestion = questions.get(currentQuestionIndex);
            tvQuestion.setText(currentQuestion.getQuestion());

            List<String> options = currentQuestion.getOptions();
            btnOption1.setText(options.get(0));
            btnOption2.setText(options.get(1));
            btnOption3.setText(options.get(2));
            btnOption4.setText(options.get(3));
        } else {
            // Викторина закончена
            Toast.makeText(this, "Викторина завершена! Ваш счет: " + score, Toast.LENGTH_LONG).show();
            finish();
        }
    }

    private void checkAnswer(int selectedOptionIndex) {
        Question currentQuestion = questions.get(currentQuestionIndex);
        if (selectedOptionIndex == currentQuestion.getCorrectAnswerIndex()) {
            score++;
            Toast.makeText(this, "Правильно!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();
        }
        currentQuestionIndex++;
        displayQuestion();
    }
}