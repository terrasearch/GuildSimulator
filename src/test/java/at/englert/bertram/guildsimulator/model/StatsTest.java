package at.englert.bertram.guildsimulator.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsTest {
    @Test
    void testStats() {
        final int stat1 = 0;
        final int stat2 = 255;
        final Stats testPlayer = new Stats(stat1, stat1, stat1);
        assertStat(testPlayer, stat1);

        testPlayer.setIntelligence(stat2);
        testPlayer.setStrength(stat2);
        testPlayer.setVitality(stat2);

        assertStat(testPlayer, stat2);
    }

    private void assertStat(final Stats testPlayer, final int stat) {
        assertEquals(testPlayer.getStrength(), stat);
        assertEquals(testPlayer.getVitality(), stat);
        assertEquals(testPlayer.getIntelligence(), stat);
    }
}
