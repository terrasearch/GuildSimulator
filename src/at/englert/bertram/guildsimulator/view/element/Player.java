package at.englert.bertram.guildsimulator.view.element;

import de.gurkenlabs.litiengine.IUpdateable;
import de.gurkenlabs.litiengine.annotation.AnimationInfo;
import de.gurkenlabs.litiengine.annotation.CollisionInfo;
import de.gurkenlabs.litiengine.annotation.EntityInfo;
import de.gurkenlabs.litiengine.annotation.MovementInfo;
import de.gurkenlabs.litiengine.entities.Creature;
import de.gurkenlabs.litiengine.graphics.Camera;
import de.gurkenlabs.litiengine.graphics.PositionLockCamera;
import de.gurkenlabs.litiengine.input.KeyboardEntityController;

@EntityInfo(width = 18, height = 18)
@MovementInfo(velocity = 70)
@CollisionInfo(collisionBoxWidth = 8, collisionBoxHeight = 16, collision = true)
@AnimationInfo(spritePrefix = "guy")
public class Player extends Creature implements IUpdateable {
    public Player() {
        addController(new KeyboardEntityController<>(this));
    }

    public Camera getCamera() {
        final Camera camera = new PositionLockCamera(this);
        camera.setClampToMap(true);
        camera.setZoom(0.3f, 10);
        return camera;
    }

    @Override
    public void update() {

    }
}
