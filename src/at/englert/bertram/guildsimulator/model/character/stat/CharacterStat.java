package at.englert.bertram.guildsimulator.model.character.stat;

import at.englert.bertram.guildsimulator.model.ModelBase;

public class CharacterStat extends ModelBase {
    private int baseStat;
    private int bonusFlat;
    private double bonusPercentage;

    public int getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(int baseStat) {
        this.baseStat = baseStat;
    }

    public int getBonusFlat() {
        return bonusFlat;
    }

    public void setBonusFlat(int bonusFlat) {
        this.bonusFlat = bonusFlat;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public long getStat() {
        return Math.round((baseStat + bonusFlat) * bonusPercentage);
    }
}
