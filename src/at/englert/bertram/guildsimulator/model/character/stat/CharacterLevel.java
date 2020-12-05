package at.englert.bertram.guildsimulator.model.character.stat;

import at.englert.bertram.guildsimulator.model.ILevel;
import at.englert.bertram.guildsimulator.model.ModelBase;

public class CharacterLevel extends ModelBase implements ILevel {
    private long level = 1;
    private int currentXp = 0;

    public int remainingXpUntilLevelUp() {
        return (int) Math.pow(level * 10, 3);
    }

    @Override
    public long getLevel() {
        return level;
    }

    @Override
    public void setLevel(long level) {
        this.level = level;
    }

    public int getCurrentXp() {
        return currentXp;
    }

    public void setCurrentXp(int currentXp) {
        this.currentXp = currentXp;
    }
}
