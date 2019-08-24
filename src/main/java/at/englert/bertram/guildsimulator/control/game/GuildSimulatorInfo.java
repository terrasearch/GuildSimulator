package at.englert.bertram.guildsimulator.control.game;

import de.gurkenlabs.litiengine.GameInfo;

class GuildSimulatorInfo {
    private final GameInfo gameInfo;

    GuildSimulatorInfo() {
        gameInfo = new GameInfo();
        gameInfo.setCompany("Idle Terra");
        gameInfo.setDescription("Govern your own guild");
        gameInfo.setDevelopers("Bertram Englert");
        gameInfo.setName("Guild Simulator");
        gameInfo.setVersion("Alpha");
        gameInfo.setWebsite("https://github.com/terrasearch/GuildSimulator");
    }

    GameInfo getGameInfo() {
        return gameInfo;
    }
}
