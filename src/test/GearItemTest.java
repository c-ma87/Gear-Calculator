package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
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
        assertEquals(0, testGearItem.getStatBoosts().size());
        assertEquals(null, testGearItem.getSetBonus());
    }

    @Test
    void testAddStatBoost() {
        HashMap<String, ArrayList<StatBoost>> stats = testGearItem.getStatBoosts();
        
        testGearItem.addStatBoost(new StatBoost(3, "myth", "damage"));
        assertEquals(1, stats.size());
        assertEquals(3, stats.get("damage").get(0).getBoost());
        assertEquals("myth", stats.get("damage").get(0).getSchool());
        assertEquals("damage", stats.get("damage").get(0).getType());

        testGearItem.addStatBoost(new StatBoost(5, "balance", "power pip"));
        assertEquals(2, stats.size());
        assertEquals(3, stats.get("damage").get(0).getBoost());
        assertEquals("myth", stats.get("damage").get(0).getSchool());
        assertEquals("damage", stats.get("damage").get(0).getType());
        assertEquals(5, stats.get("power pip").get(0).getBoost());
        assertEquals("balance", stats.get("power pip").get(0).getSchool());
        assertEquals("power pip", stats.get("power pip").get(0).getType());
    }

    @Test
    void testAddStatBoostSameTypeAndSchool() {
        HashMap<String, ArrayList<StatBoost>> stats = testGearItem.getStatBoosts();
        
        testGearItem.addStatBoost(new StatBoost(8, "death", "pierce"));
        testGearItem.addStatBoost(new StatBoost(2, "death", "damage"));
        testGearItem.addStatBoost(new StatBoost(3, "life", "damage"));
        assertEquals(2, stats.size());
        assertEquals(8, stats.get("pierce").get(0).getBoost());
        assertEquals("death", stats.get("pierce").get(0).getSchool());
        assertEquals("pierce", stats.get("pierce").get(0).getType());
        assertEquals(2, stats.get("damage").get(0).getBoost());
        assertEquals("death", stats.get("damage").get(0).getSchool());
        assertEquals("damage", stats.get("damage").get(0).getType());
        assertEquals(3, stats.get("damage").get(1).getBoost());
        assertEquals("life", stats.get("damage").get(1).getSchool());
        assertEquals("damage", stats.get("damage").get(1).getType());

        testGearItem.addStatBoost(new StatBoost(5, "death", "damage"));
        assertEquals(2, stats.size());
        assertEquals(8, stats.get("pierce").get(0).getBoost());
        assertEquals("death", stats.get("pierce").get(0).getSchool());
        assertEquals("pierce", stats.get("pierce").get(0).getType());
        assertEquals(5, stats.get("damage").get(0).getBoost());
        assertEquals("death", stats.get("damage").get(0).getSchool());
        assertEquals("damage", stats.get("damage").get(0).getType());
        assertEquals(3, stats.get("damage").get(1).getBoost());
        assertEquals("life", stats.get("damage").get(1).getSchool());
        assertEquals("damage", stats.get("damage").get(1).getType());
    }

    @Test
    void testRemoveSetBonus() {
        testGearItem.setSetBonus(new SetBonus("set bonus 1"));
        assertEquals("set bonus 1", testGearItem.getSetBonus().getName());

        testGearItem.removeSetBonus();
        assertEquals(null, testGearItem.getSetBonus());
    }
}
