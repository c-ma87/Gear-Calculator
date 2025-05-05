package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.GearItem;
import main.model.StatBoost;
import main.model.simulator.Spell;
import main.model.simulator.player.Player;

public class PlayerTest {
    private Player player;
    private Player enemy1;
    private Player enemy2;
    private Spell spell1;
    private Spell spell2;
    private GearItem hat1;
    private GearItem hat2;

    @BeforeEach
    void runBefore() {
        player = new Player(100, 4000, 1000);
        enemy1 = new Player(100, 3000, 1500);
        enemy2 = new Player(90, 2000, 1000);
        spell1 = new Spell("spell1", "life", 300, 100, 70, 50, 5, true);
        spell2 = new Spell("spell2", "death", 1000, 0, 0, 65, 7, false);
        
        hat1 = new GearItem("hat1", "hat");
        hat1.addStatBoost(new StatBoost(10, "life", "resist"));
        
        hat2 = new GearItem("hat2", "hat");
        hat1.addStatBoost(new StatBoost(50, "life", "pierce"));
    }

    @Test
    void testAddSpell() {
        player.addSpell(spell1);
        assertEquals(1, player.getSpells().size());
        assertEquals(spell1, player.getSpells().get(0));

        player.addSpell(spell2);
        assertEquals(2, player.getSpells().size());
        assertEquals(spell1, player.getSpells().get(0));
        assertEquals(spell2, player.getSpells().get(1));
    }

    @Test
    void testUpdateHandNoSpells() {
        assertEquals(0, player.getCurrentHand().size());
        player.updateHand(spell1);
        player.updateHand(spell2);
        assertEquals(0, player.getCurrentHand().size());
    }

    @Test
    void testUpdateHandNullSpell() {
        player.addSpell(spell1);
        player.addSpell(spell2);
        assertEquals(0, player.getCurrentHand().size());

        player.updateHand(null);
        assertEquals(7, player.getCurrentHand().size());

        for (Spell spell : player.getCurrentHand()) {
            assertTrue(player.getSpells().contains(spell));
        }
    }

    @Test
    void testUpdateHandEmptyHand() {
        player.addSpell(spell1);
        player.addSpell(spell2);
        assertEquals(0, player.getCurrentHand().size());

        player.updateHand(spell1);
        assertEquals(7, player.getCurrentHand().size());

        for (Spell spell : player.getCurrentHand()) {
            assertTrue(player.getSpells().contains(spell));
        }
    }

    @Test
    void testUpdateHandNewSpell() {
        player.addSpell(spell1);
        player.addSpell(spell2);
        assertEquals(0, player.getCurrentHand().size());

        player.updateHand(spell1);
        assertEquals(7, player.getCurrentHand().size());

        for (Spell spell : player.getCurrentHand()) {
            assertTrue(player.getSpells().contains(spell));
        }

        Spell newSpell = new Spell("new spell", "ice", 800, 0, 0, 0, 5, false);
        player.removeSpell(spell1);
        player.removeSpell(spell2);
        player.addSpell(newSpell);
        player.updateHand(player.getCurrentHand().get(0));
        assertTrue(player.getSpells().contains(newSpell));
    }

    @Test
    void testCastSpellOneEnemyNoAoe() {
        enemy1.getPlayerGear().setHat(hat1);
        player.getPlayerGear().setHat(hat2);

        player.addEnemy(enemy1);
        player.addSpell(spell1);

        for (int i = 0; i < 10; i++) {
            player.addPip();
        }
        assertEquals(10, player.getPips());
        player.updateHand(null);
        player.castSpell(spell1);

        HashMap<String, ArrayList<Integer>> shields = player.getShields();
        HashMap<String, ArrayList<Integer>> wards = player.getWards();

        assertEquals(2580, enemy1.getPlayerStats().getStat("health", null));

        assertEquals(4100, player.getPlayerStats().getStat("health", null));

        assertTrue(shields.containsKey("life"));
        assertEquals(1, shields.get("life").size());
        assertEquals(70, shields.get("life").get(0));

        assertTrue(wards.containsKey("life"));
        assertEquals(1, wards.get("life").size());
        assertEquals(50, wards.get("life").get(0));

        assertEquals(5, player.getPips());
    }
}
