package at.englert.bertram.guildsimulator.view.element;

import de.gurkenlabs.litiengine.IUpdateable;
import de.gurkenlabs.litiengine.annotation.AnimationInfo;
import de.gurkenlabs.litiengine.annotation.CollisionInfo;
import de.gurkenlabs.litiengine.annotation.EntityInfo;
import de.gurkenlabs.litiengine.annotation.MovementInfo;
import de.gurkenlabs.litiengine.entities.Creature;
import de.gurkenlabs.litiengine.input.PlatformingMovementController;

@EntityInfo(width = 18, height = 18)
@MovementInfo(velocity = 70)
@CollisionInfo(collisionBoxWidth = 8, collisionBoxHeight = 16, collision = true)
@AnimationInfo(spritePrefix = "gurknukem")
public class Player extends Creature implements IUpdateable {
    public Player() {
        addController(new PlatformingMovementController<>(this));

    }

    @Override
    public void update() {

    }
}
