package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.simulator.Spell;

public class SpellTest {
    private Spell spell;

    @BeforeEach
    void runBefore() {
        spell = new Spell("spell", "storm", 300, 100, 10, 50, 5, 20, 75, true);
    }

    @Test
    void testConstructor() {
        assertEquals("spell", spell.getName());
        assertEquals("storm", spell.getSchool());
        assertEquals(300, spell.getDamage());
        assertEquals(100, spell.getHealing());
        assertEquals(10, spell.getShield());
        assertEquals(50, spell.getWard());
        assertEquals(5, spell.getRequiredPips());
        assertEquals(20, spell.getRequiredMana());
        assertEquals(75, spell.getAccuracy());
        assertTrue(spell.getAoe());
    }

    @Test
    void testSetters() {
        spell.setName("name");
        spell.setSchool("balance");
        spell.setDamage(10);
        spell.setHealing(50);
        spell.setShield(100);
        spell.setWard(20);
        spell.setRequiredPips(3);
        spell.setRequiredMana(24);
        spell.setAccuracy(0);
        spell.setAoe(false);

        assertEquals("name", spell.getName());
        assertEquals("balance", spell.getSchool());
        assertEquals(10, spell.getDamage());
        assertEquals(50, spell.getHealing());
        assertEquals(100, spell.getShield());
        assertEquals(20, spell.getWard());
        assertEquals(3, spell.getRequiredPips());
        assertEquals(24, spell.getRequiredMana());
        assertEquals(0, spell.getAccuracy());
        assertFalse(spell.getAoe());
    }
}
