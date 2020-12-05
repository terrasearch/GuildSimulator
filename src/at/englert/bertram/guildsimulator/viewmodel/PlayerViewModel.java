package at.englert.bertram.guildsimulator.viewmodel;

import at.englert.bertram.guildsimulator.model.Player;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerViewModel extends ViewModelBase<Player> {
    private final Timer goldTick = new Timer();

    public PlayerViewModel() {
        super(new Player());
        goldTick.schedule(new TimerTask() {
            @Override
            public void run() {
                setGold(getGold() + 1);
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
}