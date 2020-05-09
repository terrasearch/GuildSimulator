package at.englert.bertram.guildsimulator.view.screen.world;

import at.englert.bertram.guildsimulator.control.game.GameManager;
import at.englert.bertram.guildsimulator.view.element.Player;
import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.entities.Spawnpoint;
import de.gurkenlabs.litiengine.environment.Environment;

public class PrototypeMap extends GameScreenBase {
    private static final String mapName = "PrototypeMap1";
    private final Player player = new Player();

    public PrototypeMap(final GameManager gameManager) {
        super(gameManager, mapName);
        Game.world().addLoadedListener(this::loaded);
        loadMap();
    }

    private void loaded(Environment e) {
        setCamera(player.getCamera());
        Spawnpoint enter = e.getSpawnpoint("spawn");
        if (enter != null) {
            enter.spawn(player);
        }
    }
}
