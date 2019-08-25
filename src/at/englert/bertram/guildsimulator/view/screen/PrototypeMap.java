package at.englert.bertram.guildsimulator.view.screen;

import at.englert.bertram.guildsimulator.control.game.GameManager;
import at.englert.bertram.guildsimulator.view.element.Player;
import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.entities.Spawnpoint;
import de.gurkenlabs.litiengine.environment.Environment;
import de.gurkenlabs.litiengine.graphics.Camera;
import de.gurkenlabs.litiengine.graphics.PositionLockCamera;

public class PrototypeMap extends GameScreenBase {
    private final Player player = new Player();

    public PrototypeMap(final GameManager gameManager) {
        super(gameManager);
        final Environment prototypeMap = new Environment("maps/PrototypeMap1.tmx");
        prototypeMap.add(player);
        Camera camera = new PositionLockCamera(player);
        camera.setClampToMap(true);
        camera.setZoom(0.3f, 10);
        Game.world().setCamera(camera);
        Game.world().setGravity(120);
        Game.world().addLoadedListener(e -> {
            // spawn the player instance on the spawn point with the name "enter"
            Spawnpoint enter = e.getSpawnpoint("enter");
            if (enter != null) {
                enter.spawn(player);
            }
        });
        Game.world().loadEnvironment(prototypeMap);
    }
}
