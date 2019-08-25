package at.englert.bertram.guildsimulator.control.config;

import de.gurkenlabs.litiengine.pathfinding.Path;

public interface IConfig {
    void load(Path filePath);

    void reload();
}
