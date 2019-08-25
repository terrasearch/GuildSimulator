package at.englert.bertram.guildsimulator.control.config.entry;

public class ConfigEntry<T> implements IConfigEntry<T> {
    private final String key;
    private T value;

    public ConfigEntry(String key, T value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public T getValue() {
        return value;
    }
}
