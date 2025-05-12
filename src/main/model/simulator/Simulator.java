package main.model.simulator;

import java.util.ArrayList;
import java.util.HashMap;

import main.model.GearItem;
import main.model.simulator.player.Player;
import main.model.simulator.rater.GearRater;

// Represents a simulator to simulate battles and rank gear items based on effectiveness for
// specific player types
public class Simulator {
    HashMap<String, ArrayList<GearItem>> items;
    Player player;

    // EFFECTS: constructs a simulator with a player and empty items
    public Simulator() {
        // TODO
    }

    // MODIFIES: this
    // EFFECTS: adds item to items
    public void addGearItem(GearItem item) {
        // TODO
    } 

    // REQUIRES: playerType is one of "dealer", "tank"
    // MODIFIES: this
    // EFFECTS: simulates n battles against player's enemies, ranking and sorting each item type in items
    // using rater
    public void simulate(int n, GearRater rater) {
        // TODO
    }

    // EFFECTS: returns true if total accuracy (from spell + player) expressed as
    // percentage < random decimal in range [0, 1], or
    // if total accuracy == 0
    public boolean fizzle(Spell spell) {
        double accuracy = (double) (spell.getAccuracy() + player.getPlayerStats().getStat("accuracy", spell.getSchool()) / 100);
        double randomCast = Math.random();
        return accuracy < randomCast || accuracy == 0;
    }

    // EFFECTS: returns true if player's mana < spell's required mana
    public boolean insufficientMana(Spell spell) {
        return player.getPlayerStats().getStat("mana", null) < spell.getRequiredMana();
    }

    // EFFECTS: returns true if player's pips < spell's required pips
    public boolean insufficientPips(Spell spell) {
        // TODO
        return false;
    }

    public HashMap<String, ArrayList<GearItem>> getItems() {
        return null;
    }

    public Player getPlayer() {
        return null;
    }
}
