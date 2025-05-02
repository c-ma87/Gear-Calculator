package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.simulator.player.PlayerStats;

public class PlayerStatsTest {
    private PlayerStats stats;

    @BeforeEach
    void runBefore() {
        stats = new PlayerStats(0, 0, 0);
    }

    @Test
    void testBasicSettersGetters() {
        stats.setLevel(100);
        stats.setHealth(3000);
        stats.setMana(1000);
        stats.setPowerPip(95);

        assertEquals(100, stats.getLevel());
        assertEquals(3000, stats.getHealth());
        assertEquals(1000, stats.getMana());
        assertEquals(95, stats.getPowerPip());
    }

    @Test
    void testSetDamage() {
        stats.setDamage(100, "life");
        assertEquals(100, stats.getDamage("life"));
        assertEquals(0, stats.getDamage("death"));

        stats.setDamage(20, "life");
        assertEquals(20, stats.getDamage("life"));
        stats.setDamage(30, "death");
        assertEquals(30, stats.getDamage("death"));
    }

    @Test
    void testSetResist() {
        stats.setResist(100, "life");
        assertEquals(100, stats.getResist("life"));
        assertEquals(0, stats.getResist("death"));

        stats.setResist(20, "life");
        assertEquals(20, stats.getResist("life"));
        stats.setResist(30, "death");
        assertEquals(30, stats.getResist("death"));
    }

    @Test
    void testSetCritical() {
        stats.setCritical(100, "life");
        assertEquals(100, stats.getCritical("life"));
        assertEquals(0, stats.getCritical("death"));

        stats.setCritical(20, "life");
        assertEquals(20, stats.getCritical("life"));
        stats.setCritical(30, "death");
        assertEquals(30, stats.getCritical("death"));
    }

    @Test
    void testSetBlock() {
        stats.setBlock(100, "life");
        assertEquals(100, stats.getBlock("life"));
        assertEquals(0, stats.getBlock("death"));

        stats.setBlock(20, "life");
        assertEquals(20, stats.getBlock("life"));
        stats.setBlock(30, "death");
        assertEquals(30, stats.getBlock("death"));
    }

    @Test
    void testSetAccuracy() {
        stats.setAccuracy(100, "life");
        assertEquals(100, stats.getAccuracy("life"));
        assertEquals(0, stats.getAccuracy("death"));

        stats.setAccuracy(20, "life");
        assertEquals(20, stats.getAccuracy("life"));
        stats.setAccuracy(30, "death");
        assertEquals(30, stats.getAccuracy("death"));
    }

    @Test
    void testSetPierce() {
        stats.setPierce(100, "life");
        assertEquals(100, stats.getPierce("life"));
        assertEquals(0, stats.getPierce("death"));

        stats.setPierce(20, "life");
        assertEquals(20, stats.getPierce("life"));
        stats.setPierce(30, "death");
        assertEquals(30, stats.getPierce("death"));
    }
}
