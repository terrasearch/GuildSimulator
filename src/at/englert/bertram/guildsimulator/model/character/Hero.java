package at.englert.bertram.guildsimulator.model.character;

import at.englert.bertram.guildsimulator.model.ModelBase;
import at.englert.bertram.guildsimulator.model.character.stat.CharacterMainStats;

public class Hero extends ModelBase {
    private final CharacterMainStats stats = new CharacterMainStats((int) (Math.random() * 5) + 1);

    public CharacterMainStats getStats() {
        return stats;
    }
}
