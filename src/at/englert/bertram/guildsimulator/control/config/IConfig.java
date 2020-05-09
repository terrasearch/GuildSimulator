package at.englert.bertram.guildsimulator.control.config;

import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * @IConfig is an list of entries, which is configurable, and also saveable.
 */
public interface IConfig {
    void load() throws IOException, ParseException;

    void reload();

    void save();
}
