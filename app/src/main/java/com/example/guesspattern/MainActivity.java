package com.example.guesspattern;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements GameContext {

    private TextView questionText;
    private MaterialButton yesButton;
    private MaterialButton noButton;

    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionText = findViewById(R.id.questionText);
        yesButton = findViewById(R.id.yesButton);
        noButton = findViewById(R.id.noButton);

        yesButton.setOnClickListener(v -> onYesClicked());
        noButton.setOnClickListener(v -> onNoClicked());

        game = new Game(this);
        game.start();
    }

    private void onYesClicked() {
        game.answerYes();
    }

    private void onNoClicked() {
        game.answerNo();
    }

    @Override
    public void showQuestion(String question) {
        questionText.setText(question);
    }

    @Override
    public void endGame() {
        finishAndRemoveTask();
    }

    @Override
    protected void onDestroy() {
        game = null;
        super.onDestroy();
    }
}