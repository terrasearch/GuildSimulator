package at.englert.bertram.guildsimulator.view.screen;

import at.englert.bertram.guildsimulator.control.game.GameManager;
import de.gurkenlabs.litiengine.graphics.ShapeRenderer;
import de.gurkenlabs.litiengine.graphics.TextRenderer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MainMenu extends GameScreenBase {
    private static final Logger log = LogManager.getLogger(MainMenu.class);

    private int selectedMenuEntry = 0;

    public MainMenu(GameManager manager) {
        super(manager);
        log.debug("Creating the Main Menu");

        registerKeyEvent(KeyEvent.VK_DOWN, (key) -> increaseEntry());
        registerKeyEvent(KeyEvent.VK_UP, (key) -> decreaseEntry());
        registerKeyEvent(KeyEvent.VK_ENTER, (key) -> {
            if (selectedMenuEntry == MenuEntry.quit) {
                manager.stopGame();
            }
        });
    }


    @Override
    public void render(Graphics2D g) {
        super.render(g);

        g.setColor(Color.RED);
        TextRenderer.render(g, "New Game", 100, 20);
        TextRenderer.render(g, "Load Game", 100, 120);
        TextRenderer.render(g, "Settings", 100, 220);
        TextRenderer.render(g, "Quit", 100, 320);
        ShapeRenderer.render(g, new Polygon(new int[]{60, 80, 60}, new int[]{10 + 100 * selectedMenuEntry, 20 + 100 * selectedMenuEntry, 30 + 100 * selectedMenuEntry}, 3));
    }

    private void increaseEntry() {
        if (selectedMenuEntry < 3) {
            selectedMenuEntry++;
        } else {
            selectedMenuEntry = 0;
        }
    }

    private void decreaseEntry() {
        if (selectedMenuEntry > 0) {
            selectedMenuEntry--;
        } else {
            selectedMenuEntry = 3;
        }
    }

    private static class MenuEntry {
        private final static int newGame = 0;
        private final static int loadGame = 1;
        private final static int settings = 2;
        private final static int quit = 3;
    }
}
