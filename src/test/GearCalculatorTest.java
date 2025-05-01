package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.GearCalculator;

public class GearCalculatorTest {
    private static final double DELTA = 0.0001;
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

    @Test
    void testCalculateCritDmgMultiplier() {
        assertEquals(2.0, testGearCalculator.calculateCritDmgMultiplier(0, 0));
        assertEquals(2.0, testGearCalculator.calculateCritDmgMultiplier(3, 0));
        assertEquals(1.3025, testGearCalculator.calculateCritDmgMultiplier(1, 1), DELTA);
        assertEquals(1.1394, testGearCalculator.calculateCritDmgMultiplier(1, 2), DELTA);
        assertEquals(1.1394, testGearCalculator.calculateCritDmgMultiplier(15, 30), DELTA);
    }

    @Test
    void testCalculateCritChanceMultiplier() {
        assertEquals(0.0, testGearCalculator.calculateCritChanceMultiplier(0, 0, 0));
        assertEquals(0.0, testGearCalculator.calculateCritChanceMultiplier(0, 5, 10));
        assertEquals(0.95, testGearCalculator.calculateCritChanceMultiplier(1, 0, 95));
        assertEquals(0.95, testGearCalculator.calculateCritChanceMultiplier(100, 0, 96));
        assertEquals(0.95, testGearCalculator.calculateCritChanceMultiplier(100, 0, 96));
        assertEquals(0.60119, testGearCalculator.calculateCritChanceMultiplier(100, 200, 96), DELTA);
        assertEquals(0.60119, testGearCalculator.calculateCritChanceMultiplier(100, 200, 95), DELTA);
        assertEquals(0.30214, testGearCalculator.calculateCritChanceMultiplier(10, 5, 30), DELTA);
    }

    @Test
    void testCalculateAccuracy() {
        assertEquals(0.0, testGearCalculator.calculateAccuracy(0));
        assertEquals(0.9, testGearCalculator.calculateAccuracy(90));
        assertEquals(1.0, testGearCalculator.calculateAccuracy(390));
    }

    @Test
    void testCalculatePowerPipConversionRate() {
        assertEquals(0.0, testGearCalculator.calculatePowerPipConversionRate(0));
        assertEquals(0.9, testGearCalculator.calculatePowerPipConversionRate(90));
        assertEquals(1.0, testGearCalculator.calculatePowerPipConversionRate(240));
    }

    @Test
    void testCalculatePierceMultiplier() {
        assertEquals(1.0, testGearCalculator.calculatePierceMultiplier(0));
        assertEquals(0.0, testGearCalculator.calculatePierceMultiplier(-1000));
        assertEquals(1.9, testGearCalculator.calculatePierceMultiplier(90));
        assertEquals(0.25, testGearCalculator.calculatePierceMultiplier(-75));
    }
}
