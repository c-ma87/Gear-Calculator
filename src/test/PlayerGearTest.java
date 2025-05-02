package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.GearItem;
import main.model.simulator.player.PlayerGear;

public class PlayerGearTest {
    private PlayerGear gear;
    private GearItem hat;
    private GearItem robe;
    private GearItem boots;
    private GearItem wand;
    private GearItem athame;
    private GearItem amulet;
    private GearItem ring;
    private GearItem deck;
    private GearItem pet;
    private GearItem mount;

    @BeforeEach
    void runBefore() {
        hat = new GearItem("abyssmal warrior's mask", "hat");
        robe = new GearItem("abyssmal warrior's suit", "robe");
        boots = new GearItem("abyssmal warrior's boots", "boots");
        wand = new GearItem("abyssmal eel whip", "wand");
        athame = new GearItem("hierarch's ancient one athame", "athame");
        amulet = new GearItem("4th age balance talisman", "amulet");
        ring = new GearItem("cool fairy kei ring", "ring");
        deck = new GearItem("alphoi aethyrium hand", "deck");
        pet = new GearItem("storm hound", "pet");
        mount = new GearItem("reindeer sleigh", "mount");

        gear = new PlayerGear(null, null, null, null, null, null, null, null, null, null);
    }

    @Test
    void testSettersGetters() {
        gear.setHat(hat);
        gear.setRobe(robe);
        gear.setBoots(boots);
        gear.setWand(wand);
        gear.setAthame(athame);
        gear.setAmulet(amulet);
        gear.setRing(ring);
        gear.setDeck(deck);
        gear.setPet(pet);
        gear.setMount(mount);

        assertEquals(hat, gear.getHat());
        assertEquals(robe, gear.getRobe());
        assertEquals(boots, gear.getBoots());
        assertEquals(wand, gear.getWand());
        assertEquals(athame, gear.getAthame());
        assertEquals(amulet, gear.getAmulet());
        assertEquals(ring, gear.getRing());
        assertEquals(deck, gear.getDeck());
        assertEquals(pet, gear.getPet());
        assertEquals(mount, gear.getMount());
    }
}
