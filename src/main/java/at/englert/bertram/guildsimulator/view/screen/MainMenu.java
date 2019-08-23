package at.englert.bertram.guildsimulator.view.screen;

import de.gurkenlabs.litiengine.graphics.ShapeRenderer;
import de.gurkenlabs.litiengine.graphics.TextRenderer;
import de.gurkenlabs.litiengine.gui.screens.GameScreen;

import java.awt.*;
import java.awt.event.MouseWheelEvent;

public class MainMenu extends GameScreen {
    private int entry = 1;

    public MainMenu() {
    }

    @Override
    public void render(Graphics2D g) {
        super.render(g);

        g.setColor(Color.RED);
        TextRenderer.render(g, "New Game", 100, 100);
        TextRenderer.render(g, "Load Game", 100, 200);
        TextRenderer.render(g, "Settings", 100, 300);
        TextRenderer.render(g, "Quit", 100, 400);
        ShapeRenderer.render(g, new Polygon(new int[]{60, 80, 60}, new int[]{100 * entry, 10 + 100 * entry, 20 + 100 * entry}, 3));
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        super.mouseWheelMoved(e);
        if (e.getScrollAmount() > 0) {
            if (entry < 4) {
                entry++;
            } else {
                entry = 1;
            }
        }
    }
}
