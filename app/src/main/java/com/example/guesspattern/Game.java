package com.example.guesspattern;

/**
 * Yes/No question game. It presents a sequence of questions to a user. The sequence changes
 * depending on the user's answers to the previous questions.
 */
public class Game {

    /**
     * Use GameContext to interact with the UI. For example, to display a question or exit the game.
     */
    private final GameContext context;

    public Game(GameContext context) {
        this.context = context;
    }

    /**
     * It's called when a user is ready to play the game.
     * Handles the game setup, such as showing the initial question.
     */
    public void start() {
        context.showQuestion("Welcome to the game! " +
            "Think of a design pattern and answer these following yes/no questions. " +
            "Ready?");
    }

    /**
     * It's called when a user answers YES to a question.
     * Handles the transition to the next question or exits the game.
     */
    public void answerYes() {
        context.showQuestion("You answered YES. Continue?");
    }

    /**
     * It's called when a user answers NO to a question.
     * Handles the transition to the next question or exits the game.
     */
    public void answerNo() {
        context.endGame();
    }
}
