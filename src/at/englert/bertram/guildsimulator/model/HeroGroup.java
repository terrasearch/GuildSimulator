package at.englert.bertram.guildsimulator.model;

import at.englert.bertram.guildsimulator.model.character.Hero;

import java.util.ArrayList;
import java.util.List;

public class HeroGroup extends ModelBase {
    private final List<Hero> heroes = new ArrayList<>();

    public HeroGroup() {
        addHero(new Hero());
        addHero(new Hero());
        addHero(new Hero());
    }

    private void addHero(Hero hero) {
        heroes.add(hero);
    }

    public Hero[] getHeroes() {
        return heroes.toArray(new Hero[0]);
    }
}
