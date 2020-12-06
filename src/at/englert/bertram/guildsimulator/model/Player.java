package at.englert.bertram.guildsimulator.model;

import java.util.ArrayList;
import java.util.List;

public class Player extends ModelBase {
    private long gold = 0;
    private PlayerLevel playerLevel = new PlayerLevel();
    private final List<HeroGroup> heroGroups = new ArrayList<>();

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

    public List<HeroGroup> getHeroGroups() {
        return heroGroups;
    }
}
