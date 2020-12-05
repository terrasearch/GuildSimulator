package at.englert.bertram.guildsimulator.model.character.stat;

import at.englert.bertram.guildsimulator.model.ModelBase;

public class CharacterResource extends ModelBase {
    private int current;
    private int maximum;

    protected int getCurrent() {
        return current;
    }

    protected void setCurrent(int current) {
        this.current = current;
    }

    protected int getMaximum() {
        return maximum;
    }

    protected void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
