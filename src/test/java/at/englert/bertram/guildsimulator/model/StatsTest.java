package at.englert.bertram.guildsimulator.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsTest {
    @Test
    void testStats() {
        final int stat1 = 0;
        final int stat2 = 255;
        final Stats testStats = new Stats(stat1, stat1, stat1);
        assertStat(testStats, stat1);

        testStats.setIntelligence(stat2);
        testStats.setStrength(stat2);
        testStats.setVitality(stat2);

        assertStat(testStats, stat2);
    }

    private void assertStat(final Stats testStats, final int stat) {
        assertEquals(testStats.getStrength(), stat);
        assertEquals(testStats.getVitality(), stat);
        assertEquals(testStats.getIntelligence(), stat);
    }
}
