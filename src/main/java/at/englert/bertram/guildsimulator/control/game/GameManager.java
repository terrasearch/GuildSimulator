package at.englert.bertram.guildsimulator.control.game;

import at.englert.bertram.guildsimulator.view.screen.MainMenu;
import de.gurkenlabs.litiengine.Game;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GameManager {
    private static final Logger log = LogManager.getLogger();

    public GameManager() {
    }

    public void startGame() {
        log.debug("Game started with version: " + Game.info().getVersion());
        Game.init();
        Game.start();
        Game.screens().display(new MainMenu());
    }
}
