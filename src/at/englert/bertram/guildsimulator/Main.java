package at.englert.bertram.guildsimulator;

import at.englert.bertram.guildsimulator.control.game.GameManager;
import at.englert.bertram.guildsimulator.view.screen.MainMenuScreen;

/**
 * Entry Point of the Application
 */
public class Main {
    public static void main(final String[] args) {
        final GameManager gameManager = new GameManager();
        gameManager.startGame(args);
        gameManager.switchScreen(new MainMenuScreen(gameManager));
    }
}
