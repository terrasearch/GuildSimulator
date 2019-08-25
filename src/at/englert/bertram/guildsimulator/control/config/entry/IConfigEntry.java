package at.englert.bertram.guildsimulator.control.config.entry;

public interface IConfigEntry<T> {
    String getKey();

    T getValue();
}
