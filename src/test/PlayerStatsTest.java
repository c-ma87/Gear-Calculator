package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.simulator.player.PlayerStats;

public class PlayerStatsTest {
    private PlayerStats stats;

    @BeforeEach
    void runBefore() {
        stats = new PlayerStats(0, 0);
    }

    @Test
    void testUpdateStatsHealth() {
        assertEquals(0, stats.getStat("health", "abc"));
        stats.updateStats("health", "def", 100);
        assertEquals(100, stats.getStat("health", "abc"));
        stats.updateStats("health", "def", 300);
        assertEquals(400, stats.getStat("health", "abc"));
    }

    @Test
    void testUpdateStatsMana() {
        assertEquals(0, stats.getStat("mana", "abc"));
        stats.updateStats("mana", "def", 150);
        assertEquals(150, stats.getStat("mana", "abc"));
        stats.updateStats("mana", "def", 100);
        assertEquals(250, stats.getStat("mana", "abc"));
    }

    @Test
    void testUpdateStatsPowerPip() {
        assertEquals(0, stats.getStat("power pip", "abc"));
        stats.updateStats("power pip", "def", 150);
        assertEquals(150, stats.getStat("power pip", "abc"));
        stats.updateStats("power pip", "def", 150);
        assertEquals(300, stats.getStat("power pip", "abc"));
    }

    @Test
    void testUpdateStatsNewStat() {
        assertEquals(0, stats.getStat("damage", "life"));
        stats.updateStats("damage", "life", 300);
        assertEquals(300, stats.getStat("damage", "life"));

        assertEquals(0, stats.getStat("damage", "fire"));
        stats.updateStats("damage", "fire", 10);
        assertEquals(10, stats.getStat("damage", "fire"));

        assertEquals(300, stats.getStat("damage", "life"));
        stats.updateStats("damage", "life", -50);
        assertEquals(250, stats.getStat("damage", "life"));

        assertEquals(0, stats.getStat("pierce", "life"));
        stats.updateStats("pierce", "life", 24);
        assertEquals(24, stats.getStat("pierce", "life"));
    }
}
