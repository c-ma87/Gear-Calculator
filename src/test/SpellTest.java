package test;

import static org.junit.Assert.assertEquals;
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
        spell = new Spell(300, 100, 10, 50, true);
    }

    @Test
    void testConstructor() {
        assertEquals(300, spell.getDamage());
        assertEquals(100, spell.getHealing());
        assertEquals(10, spell.getShield());
        assertEquals(50, spell.getWard());
        assertTrue(spell.getAoe());
    }

    @Test
    void testSetters() {
        spell.setDamage(10);
        spell.setHealing(50);
        spell.setShield(100);
        spell.setWard(20);
        spell.setAoe(false);

        assertEquals(10, spell.getDamage());
        assertEquals(50, spell.getHealing());
        assertEquals(100, spell.getShield());
        assertEquals(20, spell.getWard());
        assertFalse(spell.getAoe());
    }
}
