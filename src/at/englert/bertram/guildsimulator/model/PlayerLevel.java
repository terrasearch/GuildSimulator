package at.englert.bertram.guildsimulator.model;

public class PlayerLevel extends ModelBase implements ILevel {
    private long level;

    @Override
    public long getLevel() {
        return level;
    }

    @Override
    public void setLevel(long level) {
        this.level = level;
    }
}
