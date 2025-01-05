package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.GearItem;
import main.model.StatBoost;
import main.model.setBonus.SetBonus;

public class GearItemTest {
    private GearItem testGearItem;

    @BeforeEach
    void runBefore() {
        testGearItem = new GearItem("cool robe", "robe");
    }

    @Test
    void testConstructor() {
        assertEquals("cool robe", testGearItem.getName());
        assertEquals("robe", testGearItem.getType());
        assertEquals(0, testGearItem.getStats().size());
        assertEquals(null, testGearItem.getSetBonus());
    }

    @Test
    void testAddStatBoost() {
        List<StatBoost> stats = testGearItem.getStats();
        
        testGearItem.addStatBoost(new StatBoost(3, "myth", "damage"));
        assertEquals(1, stats.size());
        assertEquals(3, stats.get(0).getBoost());
        assertEquals("myth", stats.get(0).getSchool());
        assertEquals("damage", stats.get(0).getType());

        testGearItem.addStatBoost(new StatBoost(5, "balance", "power pip"));
        assertEquals(2, stats.size());
        assertEquals(3, stats.get(0).getBoost());
        assertEquals("myth", stats.get(0).getSchool());
        assertEquals("damage", stats.get(0).getType());
        assertEquals(5, stats.get(1).getBoost());
        assertEquals("balance", stats.get(1).getSchool());
        assertEquals("power pip", stats.get(1).getType());
    }

    @Test
    void testAddStatBoostSameType() {
        List<StatBoost> stats = testGearItem.getStats();
        
        testGearItem.addStatBoost(new StatBoost(2, "death", "damage"));
        assertEquals(2, stats.size());
        assertEquals(3, stats.get(0).getBoost());
        assertEquals("death", stats.get(0).getSchool());
        assertEquals("damage", stats.get(0).getType());

        testGearItem.addStatBoost(new StatBoost(5, "balance", "damage"));
        assertEquals(1, stats.size());
        assertEquals(5, stats.get(0).getBoost());
        assertEquals("balance", stats.get(0).getSchool());
        assertEquals("damage", stats.get(0).getType());
    }

    @Test
    void testRemoveSetBonus() {
        testGearItem.setSetBonus(new SetBonus("set bonus 1"));
        assertEquals("set bonus 1", testGearItem.getSetBonus().getName());

        testGearItem.removeSetBonus();
        assertEquals(null, testGearItem.getSetBonus());
    }
}
