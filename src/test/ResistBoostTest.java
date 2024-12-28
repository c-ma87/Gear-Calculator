package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.stat.ResistBoost;

public class ResistBoostTest {
    private ResistBoost testResistBoost;

    @BeforeEach
    void runBefore() {
        testResistBoost = new ResistBoost(5, "fire");
    }

    @Test
    void testConstructor() {
        assertEquals(5, testResistBoost.getBoost());
        assertEquals("fire", testResistBoost.getSchool());
        assertEquals(0.95, testResistBoost.getMultiplier());
    }

    @Test
    void testSetBoost() {
        assertEquals(5, testResistBoost.getBoost());

        testResistBoost.setBoost(50);
        assertEquals(50, testResistBoost.getBoost());
        assertEquals(0.50, testResistBoost.getMultiplier());

        testResistBoost.setBoost(1);
        assertEquals(1, testResistBoost.getBoost());
        assertEquals(0.99, testResistBoost.getMultiplier());
    }

    @Test
    void testCalculateMultiplier() {
        testResistBoost.setBoost(0);
        assertEquals(1.0, testResistBoost.getMultiplier());

        testResistBoost.setBoost(10);
        assertEquals(0.90, testResistBoost.getMultiplier());

        testResistBoost.setBoost(100);
        assertEquals(0.0, testResistBoost.getMultiplier());

        testResistBoost.setBoost(110);
        assertEquals(0.0, testResistBoost.getMultiplier());
    }
}
