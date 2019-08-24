package at.englert.bertram.guildsimulator.view.element;

import de.gurkenlabs.litiengine.IUpdateable;
import de.gurkenlabs.litiengine.annotation.CollisionInfo;
import de.gurkenlabs.litiengine.annotation.EntityInfo;
import de.gurkenlabs.litiengine.annotation.MovementInfo;
import de.gurkenlabs.litiengine.entities.Creature;

@EntityInfo(width = 18, height = 18)
@MovementInfo(velocity = 70)
@CollisionInfo(collisionBoxWidth = 8, collisionBoxHeight = 16, collision = true)
public class Player extends Creature implements IUpdateable {
    @Override
    public void update() {

    }
}
