package at.englert.bertram.guildsimulator.model;

public class Player extends ModelBase {
    private long gold = 0;
    private PlayerLevel playerLevel = new PlayerLevel();

    public long getGold() {
        return gold;
    }

    public void setGold(long gold) {
        this.gold = gold;
    }

    public PlayerLevel getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
    }
}
