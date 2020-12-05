package at.englert.bertram.guildsimulator.control.config;

import at.englert.bertram.guildsimulator.control.config.entry.IConfigEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileConfig implements IConfig {
    private static final Logger log = LogManager.getLogger(FileConfig.class);
    private final List<IConfigEntry> configEntries = new ArrayList<>();
    private final Path settingsPath;

    public FileConfig(final Path filePath) {
        this.settingsPath = filePath;
    }

    @Override
    public void load() throws IOException, ParseException {
        log.debug("Loaded File");
        final File settingsFile = settingsPath.toFile();
        try (final FileReader reader = new FileReader(settingsFile)) {
            final JSONParser jsonParser = new JSONParser();
            final JSONArray jsonArray = (JSONArray) jsonParser.parse(reader);
        }
    }

    @Override
    public void reload() {

    }

    @Override
    public void save() {
        JSONObject obj = new JSONObject();
    }
}
