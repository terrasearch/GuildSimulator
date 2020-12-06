package at.englert.bertram.guildsimulator.model.character.stat;

import at.englert.bertram.guildsimulator.model.ModelBase;

public class CharacterMainStats extends ModelBase {
    private final int rarity;

    private final CharacterLevel level = new CharacterLevel();

    private final CharacterResource hp = new CharacterResource();
    private final CharacterResource mana = new CharacterResource();

    private final CharacterStat attack = new CharacterStat();
    private final CharacterStat defense = new CharacterStat();
    private final CharacterStat heal = new CharacterStat();

    public CharacterMainStats(int rarity) {
        this.rarity = rarity;
    }

    public void gainXp(int xpGained) {
        level.setCurrentXp(level.getCurrentXp() + xpGained);
        while (level.getCurrentXp() > level.remainingXpUntilLevelUp()) {
            levelUp();
        }
    }

    private void levelUp() {
        final long newLevel = level.getLevel() + 1;
        level.setLevel(newLevel);
        hp.setMaximum((int) Math.round(newLevel * (LevelUpScaling.HP_FLAT + rarity * LevelUpScaling.HP_RARITY)));
        mana.setMaximum((int) Math.round(newLevel * (LevelUpScaling.MANA_FLAT + rarity * LevelUpScaling.MANA_RARITY)));
        attack.setBaseStat((int) Math.round(newLevel * (LevelUpScaling.ATTACK_FLAT + rarity * LevelUpScaling.ATTACK_RARITY)));
        defense.setBaseStat((int) Math.round(newLevel * (LevelUpScaling.DEFENSE_FLAT + rarity * LevelUpScaling.DEFENSE_RARITY)));
        heal.setBaseStat((int) Math.round(newLevel * (LevelUpScaling.HEAL_FLAT + rarity * LevelUpScaling.HEAL_RARITY)));
    }

    // Getter and Setter

    public CharacterLevel getLevel() {
        return level;
    }

    public CharacterResource getHp() {
        return hp;
    }

    public CharacterResource getMana() {
        return mana;
    }

    public CharacterStat getAttack() {
        return attack;
    }

    public CharacterStat getDefense() {
        return defense;
    }

    public CharacterStat getHeal() {
        return heal;
    }

    public int getRarity() {
        return rarity;
    }
}
