package at.englert.bertram.guildsimulator.viewmodel;

import at.englert.bertram.guildsimulator.model.HeroGroup;
import at.englert.bertram.guildsimulator.model.Player;

import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class PlayerViewModel extends ViewModelBase<Player> {
    private final Timer goldTick = new Timer();
    public final static String groupSize = "groupSize";

    public PlayerViewModel() {
        super(new Player());
        goldTick.schedule(new TimerTask() {
            @Override
            public void run() {
                setGold(getGold() + getGoldGain());
            }
        }, 1000, 1000);
    }

    public long getGold() {
        return getModel().getGold();
    }

    public void setGold(long gold) {
        getModel().setGold(gold);
        propertyChanged();
    }

    public long getLevel() {
        return getModel().getPlayerLevel().getLevel();
    }

    public long getGoldNeededForLevelUp() {
        return getModel().getPlayerLevel().getGoldNeededForUpgrade();
    }

    public boolean canUpgradeLevel() {
        return getGoldNeededForLevelUp() <= getGold();
    }

    public void upgradeLevel() {
        if (canUpgradeLevel()) {
            setGold(getGold() - getGoldNeededForLevelUp());
            getModel().getPlayerLevel().setLevel(getLevel() + 1);
        }
        propertyChanged();
    }

    public void addGroup() {
        if (canAddGroup()) {
            setGold(getGold() - getAddGroupCost());
            getModel().getHeroGroups().add(new HeroGroup());
        }
        propertyChanged();
        propertyChanged(groupSize);
    }

    public long getAddGroupCost() {
        return (long) (Math.pow(getModel().getHeroGroups().size(), 3) * 100);
    }

    public boolean canAddGroup() {
        return getGold() >= getAddGroupCost();
    }

    //TODO: Wrap HeroGroup in ViewModel
    public List<HeroGroup> getHeroGroups() {
        return getModel().getHeroGroups();
    }

    public int getHeroGroupsGoldGain() {
        return getHeroGroups().stream()
                .flatMap(group -> Arrays.stream(group.getHeroes()))
                .mapToInt(hero -> hero.getStats().getRarity())
                .sum();
    }

    public long getGoldGain() {
        return getLevel() + getHeroGroupsGoldGain();
    }
}