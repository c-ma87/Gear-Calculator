package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.model.stat.DamageBoost;

public class DamageBoostTest {
    private DamageBoost testDamageBoost;

    @BeforeEach
    void runBefore() {
        testDamageBoost = new DamageBoost(10, "life");
    }

    @Test
    void testConstructor() {
        assertEquals(10, testDamageBoost.getBoost());
        assertEquals("life", testDamageBoost.getSchool());
    }

    @Test
    void testSetBoost() {
        assertEquals(10, testDamageBoost.getBoost());

        testDamageBoost.setBoost(15);
        assertEquals(15, testDamageBoost.getBoost());

        testDamageBoost.setBoost(9);
        assertEquals(9, testDamageBoost.getBoost());
    }

    @Test
    void testGetMultiplierNoBoost() {
        testDamageBoost.setBoost(0);
        assertEquals(0, testDamageBoost.getMultiplier());
    }

    @Test
    void testGetMultiplierBelowIntersect() {
        testDamageBoost.setBoost(230);
        assertEquals(230, testDamageBoost.getMultiplier());
    }

    @Test
    void testGetMultiplierAtIntersect() {
        testDamageBoost.setBoost(235);
        assertEquals(235, testDamageBoost.getMultiplier());
    }

    @Test
    void testGetMultiplierJustAboveIntersect() {
        testDamageBoost.setBoost(236);
        assertEquals(236, testDamageBoost.getMultiplier());
    }

    @Test
    void testGetMultiplierMuchAboveIntersect() {
        testDamageBoost.setBoost(260);
        assertEquals(239, testDamageBoost.getMultiplier());
    }
}
