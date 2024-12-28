package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.GearCalculator;

public class GearCalculatorTest {
    private GearCalculator testGearCalculator;

    @BeforeEach
    void runBefore() {
        testGearCalculator = new GearCalculator();
    }

    @Test
    void testCalculateDamageMultiplierNoBoost() {
        assertEquals(1.0, testGearCalculator.calculateDamageMultiplier(0));
    }

    @Test
    void testCalculateDamageMultiplierBelowIntersect() {
        assertEquals(3.30, testGearCalculator.calculateDamageMultiplier(230));
    }

    @Test
    void testCalculateDamageMultiplierAtIntersect() {
        assertEquals(3.35, testGearCalculator.calculateDamageMultiplier(235));
    }

    @Test
    void testCalculateDamageMultiplierJustAboveIntersect() {
        assertEquals(3.36, testGearCalculator.calculateDamageMultiplier(236), 0.05);
    }

    @Test
    void testCalculateDamageMultiplierMuchAboveIntersect() {
        assertEquals(3.39, testGearCalculator.calculateDamageMultiplier(260), 0.05);
    }

    @Test
    void testCalculateResistMultiplier() {
        assertEquals(1.0, testGearCalculator.calculateResistMultiplier(0));
        assertEquals(0.90, testGearCalculator.calculateResistMultiplier(10));
        assertEquals(0.0, testGearCalculator.calculateResistMultiplier(100));
        assertEquals(0.0, testGearCalculator.calculateResistMultiplier(110));
    }
}
