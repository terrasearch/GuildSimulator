package at.englert.bertram.guildsimulator.view.screen;

import at.englert.bertram.guildsimulator.control.game.GameManager;
import at.englert.bertram.guildsimulator.view.menu.MainMenu;
import at.englert.bertram.guildsimulator.view.screen.world.GameScreenBase;
import at.englert.bertram.guildsimulator.view.screen.world.PrototypeMap;
import de.gurkenlabs.litiengine.Game;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.*;

public class MainMenuScreen extends GameScreenBase {
    private static final Logger log = LogManager.getLogger(MainMenuScreen.class);
    private MainMenu mainMenu;


    public MainMenuScreen(GameManager gameManager) {
        super(gameManager);
    }

    @Override
    protected void initializeComponents() {
        this.mainMenu = new MainMenu();
        this.mainMenu.onConfirm(this::accept);
        this.getComponents().add(this.mainMenu);
    }

    @Override
    public void prepare() {
        this.mainMenu.setEnabled(true);
        super.prepare();
        Game.window().getRenderComponent().setBackground(Color.BLACK);
        Game.graphics().setBaseRenderScale(6f * Game.window().getResolutionScale());
    }

    private void accept(Integer selectedEntry) {
        //this.manager.switchScreen(new LoadMenu(this.manager));
        //this.manager.switchScreen(new SettingsMenu(this.manager));
        switch (selectedEntry) {
            case MainMenu.MenuEntry.newGame -> {
                log.debug("New Game Pressed");
                gameManager.switchScreen(new PrototypeMap(gameManager));
            }
            case MainMenu.MenuEntry.loadGame -> log.debug("Load Game pressed");
            case MainMenu.MenuEntry.settings -> log.debug("Settings pressed");
            case MainMenu.MenuEntry.quit -> {
                log.debug("Quit pressed");
                this.gameManager.stopGame();
            }
            default -> log.warn("Default method on selected Entry, NOT BOUND");
        }
    }
}
