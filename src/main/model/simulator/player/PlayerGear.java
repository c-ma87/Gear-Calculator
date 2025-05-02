package main.model.simulator.player;

import main.model.GearItem;

public class PlayerGear {
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

    public PlayerGear(GearItem hat, GearItem robe, GearItem boots, GearItem wand, GearItem athame,
            GearItem amulet, GearItem ring, GearItem deck, GearItem pet, GearItem mount) {
        this.hat = hat;
        this.robe = robe;
        this.boots = boots;
        this.wand = wand;
        this.athame = athame;
        this.amulet = amulet;
        this.ring = ring;
        this.deck = deck;
        this.pet = pet;
        this.mount = mount;
    }

    public void setHat(GearItem hat) {
        this.hat = hat;
    }

    public void setRobe(GearItem robe) {
        this.robe = robe;
    }

    public void setBoots(GearItem boots) {
        this.boots = boots;
    }

    public void setWand(GearItem wand) {
        this.wand = wand;
    }

    public void setAthame(GearItem athame) {
        this.athame = athame;
    }

    public void setAmulet(GearItem amulet) {
        this.amulet = amulet;
    }

    public void setRing(GearItem ring) {
        this.ring = ring;
    }

    public void setDeck(GearItem deck) {
        this.deck = deck;
    }

    public void setPet(GearItem pet) {
        this.pet = pet;
    }

    public void setMount(GearItem mount) {
        this.mount = mount;
    }

    public GearItem getHat() {
        return hat;
    }

    public GearItem getRobe() {
        return robe;
    }

    public GearItem getBoots() {
        return boots;
    }

    public GearItem getWand() {
        return wand;
    }

    public GearItem getAthame() {
        return athame;
    }

    public GearItem getAmulet() {
        return amulet;
    }

    public GearItem getRing() {
        return ring;
    }

    public GearItem getDeck() {
        return deck;
    }

    public GearItem getPet() {
        return pet;
    }

    public GearItem getMount() {
        return mount;
    }
}
