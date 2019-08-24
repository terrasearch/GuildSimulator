package at.englert.bertram.guildsimulator.control.game;

import at.englert.bertram.guildsimulator.view.screen.MainMenu;
import de.gurkenlabs.litiengine.Game;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GameManager {
    private static final Logger log = LogManager.getLogger(GameManager.class);

    public void startGame() {
        Game.setInfo(new GuildSimulatorInfo().getGameInfo());
        log.debug("Game started with version: " + Game.info().getVersion());
        startToMainMenu();
    }

    private void startToMainMenu() {
        Game.init();
        Game.start();
        Game.screens().display(new MainMenu(this));
    }

    public void stopGame() {
        log.debug("Game stopped");
        System.exit(ExitCodes.SUCCESS.getCodeValue());
    }
}
