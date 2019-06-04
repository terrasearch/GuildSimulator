package at.englert.bertram.guildsimulator.model;

public class Stats {
    private int strength;
    private int intelligence;
    private int vitality;

    public Stats(int strength, int intelligence, int vitality) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.vitality = vitality;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }
}
