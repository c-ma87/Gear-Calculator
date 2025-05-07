package main.model.simulator.player;

import main.model.GearItem;
import main.model.StatBoost;

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

    private Player player;

    // EFFECTS: constructs empty PlayerGear
    public PlayerGear(Player player) {
        this.player = player;
    }

    // MODIFIES: this
    // EFFECTS: updates stats for all stat boosts in item
    private void updateStats(GearItem item) {
        PlayerStats stats = player.getPlayerStats();
        for (StatBoost boost : item.getStatBoosts()) {
            stats.updateStats(boost.getType(), boost.getSchool(), boost.getBoost());
        }
    }

    // MODIFIES: this
    // EFFECTS: sets hat to hat and updates stats
    public void setHat(GearItem hat) {
        this.hat = hat;
        updateStats(hat);
    }

    // MODIFIES: this
    // EFFECTS: sets hat to hat and updates stats
    public void setRobe(GearItem robe) {
        this.robe = robe;
        updateStats(robe);
    }

    // MODIFIES: this
    // EFFECTS: sets hat to hat and updates stats
    public void setBoots(GearItem boots) {
        this.boots = boots;
        updateStats(boots);
    }

    // MODIFIES: this
    // EFFECTS: sets hat to hat and updates stats
    public void setWand(GearItem wand) {
        this.wand = wand;
        updateStats(wand);
    }

    // MODIFIES: this
    // EFFECTS: sets hat to hat and updates stats
    public void setAthame(GearItem athame) {
        this.athame = athame;
        updateStats(athame);
    }

    // MODIFIES: this
    // EFFECTS: sets hat to hat and updates stats
    public void setAmulet(GearItem amulet) {
        this.amulet = amulet;
        updateStats(amulet);
    }

    // MODIFIES: this
    // EFFECTS: sets hat to hat and updates stats
    public void setRing(GearItem ring) {
        this.ring = ring;
        updateStats(ring);
    }

    // MODIFIES: this
    // EFFECTS: sets hat to hat and updates stats
    public void setDeck(GearItem deck) {
        this.deck = deck;
        updateStats(deck);
    }

    // MODIFIES: this
    // EFFECTS: sets hat to hat and updates stats
    public void setPet(GearItem pet) {
        this.pet = pet;
        updateStats(pet);
    }

    // MODIFIES: this
    // EFFECTS: sets hat to hat and updates stats
    public void setMount(GearItem mount) {
        this.mount = mount;
        updateStats(mount);
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
