package at.englert.bertram.guildsimulator.control.game;

import at.englert.bertram.guildsimulator.view.screen.world.GameScreenBase;
import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.resources.Resources;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GameManager {
    private static final Logger log = LogManager.getLogger(GameManager.class);
    private GameScreenBase currentScreen;

    public void startGame(final String[] args) {
        Game.setInfo(new GuildSimulatorInfo().getGameInfo());
        Game.init(args);
        Resources.load("game.litidata");
        log.debug("Game initialized with version: " + Game.info().getVersion());
        Game.start();
    }

    public void stopGame() {
        log.debug("Game stopped");
        System.exit(ExitCodes.SUCCESS.getCodeValue());
    }

    public void switchScreen(GameScreenBase screen) {
        if (currentScreen != null) {
            currentScreen.unload();
        }
        Game.screens().display(screen);
        currentScreen = screen;
    }
}
