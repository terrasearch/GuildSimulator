package at.englert.bertram.guildsimulator.model;

public class PlayerLevel extends ModelBase implements ILevel {
    private long level = 1;

    @Override
    public long getLevel() {
        return level;
    }

    @Override
    public void setLevel(long level) {
        this.level = level;
    }

    public long getGoldNeededForUpgrade() {
        return (long) (Math.pow(level, 2) * 10);
    }
}
