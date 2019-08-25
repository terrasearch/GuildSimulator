package at.englert.bertram.guildsimulator.view.screen;

import at.englert.bertram.guildsimulator.control.game.GameManager;
import de.gurkenlabs.litiengine.gui.screens.GameScreen;
import de.gurkenlabs.litiengine.input.Input;

import java.awt.event.KeyEvent;
import java.util.function.Consumer;

public class GameScreenBase extends GameScreen {
    protected final GameManager gameManager;

    public GameScreenBase(final GameManager gameManager, final String mapName) {
        super(mapName);
        this.gameManager = gameManager;
        registerKeyEvent(KeyEvent.VK_ESCAPE, (key -> gameManager.stopGame()));
    }


    public GameScreenBase(final GameManager gameManager) {
        this.gameManager = gameManager;
        registerKeyEvent(KeyEvent.VK_ESCAPE, (key -> gameManager.stopGame()));
    }

    protected void registerKeyEvent(final int keyEvent, final Consumer<KeyEvent> keyEventConsumer) {
        Input.keyboard().onKeyTyped(keyEvent, keyEventConsumer);
    }
}
