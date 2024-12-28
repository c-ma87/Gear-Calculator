package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

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
        assertEquals(1.10, testDamageBoost.getMultiplier());
    }

    @Test
    void testSetBoost() {
        assertEquals(10, testDamageBoost.getBoost());

        testDamageBoost.setBoost(15);
        assertEquals(15, testDamageBoost.getBoost());
        assertEquals(1.15, testDamageBoost.getMultiplier());

        testDamageBoost.setBoost(9);
        assertEquals(9, testDamageBoost.getBoost());
        assertEquals(1.09, testDamageBoost.getMultiplier());
    }

    @Test
    void testGetMultiplierNoBoost() {
        testDamageBoost.setBoost(0);
        assertEquals(1.0, testDamageBoost.getMultiplier());
    }

    @Test
    void testGetMultiplierBelowIntersect() {
        testDamageBoost.setBoost(230);
        assertEquals(3.30, testDamageBoost.getMultiplier());
    }

    @Test
    void testGetMultiplierAtIntersect() {
        testDamageBoost.setBoost(235);
        assertEquals(3.35, testDamageBoost.getMultiplier());
    }

    @Test
    void testGetMultiplierJustAboveIntersect() {
        testDamageBoost.setBoost(236);
        assertEquals(3.36, testDamageBoost.getMultiplier(), 0.05);
    }

    @Test
    void testGetMultiplierMuchAboveIntersect() {
        testDamageBoost.setBoost(260);
        assertEquals(3.39, testDamageBoost.getMultiplier(), 0.05);
    }
}
