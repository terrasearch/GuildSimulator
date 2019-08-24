package at.englert.bertram.guildsimulator.control.game;

import at.englert.bertram.guildsimulator.view.element.Player;
import at.englert.bertram.guildsimulator.view.screen.MainMenu;
import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.environment.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GameManager {
    private static final Logger log = LogManager.getLogger(GameManager.class);

    public void startGame(final String[] args) {
        Game.setInfo(new GuildSimulatorInfo().getGameInfo());
        Game.init(args);
        log.debug("Game initialized with version: " + Game.info().getVersion());
        startToMainMenu();
    }

    private void startToMainMenu() {
        Game.start();
        final Environment prototypeMap = new Environment("maps/PrototypeMap1.tmx");
        Game.world().loadEnvironment(prototypeMap);
        prototypeMap.add(new Player());
        Game.screens().display(new MainMenu(this));
    }

    public void stopGame() {
        log.debug("Game stopped");
        System.exit(ExitCodes.SUCCESS.getCodeValue());
    }
}
