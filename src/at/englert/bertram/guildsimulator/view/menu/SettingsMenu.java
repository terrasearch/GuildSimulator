package at.englert.bertram.guildsimulator.view.menu;

import at.englert.bertram.guildsimulator.control.game.GameManager;
import at.englert.bertram.guildsimulator.view.screen.world.GameScreenBase;

public class SettingsMenu extends GameScreenBase {
    private static final String mapName = "settingsScreen";

    public SettingsMenu(GameManager manager) {
        super(manager, mapName);
    }
}
