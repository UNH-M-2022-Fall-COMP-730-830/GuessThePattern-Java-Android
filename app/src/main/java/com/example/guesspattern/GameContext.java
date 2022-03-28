package com.example.guesspattern;

/**
 * Responsible for handling interaction with the game UI.
 */
public interface GameContext {
    /**
     * Displays the question to a user.
     * @param question line ot be shown
     */
    void showQuestion(String question);

    /**
     * Exits the game.
     */
    void endGame();
}
