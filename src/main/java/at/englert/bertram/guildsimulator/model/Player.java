package at.englert.bertram.guildsimulator.model;

public class Player {
    private final Stats stats;

    public Player(Stats stats) {
        this.stats = stats;
    }

    public Stats getStats(){
        return stats;
    }
}
