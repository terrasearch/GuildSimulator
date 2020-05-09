package at.englert.bertram.guildsimulator.view.menu;

import de.gurkenlabs.litiengine.Game;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainMenu extends KeyboardMenu {
    private static final Logger log = LogManager.getLogger(MainMenu.class);
    private static final double buttonWidth = 450;

    public MainMenu() {
        super(Game.window().getResolution().getWidth() / 2.0 - buttonWidth / 2, Game.window().getResolution().getHeight() * 1 / 2 * 1.3,
                buttonWidth, Game.window().getResolution().getHeight() * 1 / 2 / 2,
                "New Game", "Load Game", "Settings", "Exit");
        log.debug("Creating the Main Menu");
    }

    public static class MenuEntry {
        public final static int newGame = 0;
        public final static int loadGame = 1;
        public final static int settings = 2;
        public final static int quit = 3;
    }
}
