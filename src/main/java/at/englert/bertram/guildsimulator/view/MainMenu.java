package at.englert.bertram.guildsimulator.view;

import de.gurkenlabs.litiengine.graphics.TextRenderer;
import de.gurkenlabs.litiengine.gui.screens.GameScreen;

import java.awt.*;

public class MainMenu extends GameScreen {
    public MainMenu() {
        super("Main Menu");
    }

    @Override
    public void render(Graphics2D g) {
        super.render(g);

        //g.setFont(Resources.fonts().get("truetype.ttf", 32f));
        g.setColor(Color.RED);
        TextRenderer.render(g, "Main Menu", 100, 100);
    }
}
