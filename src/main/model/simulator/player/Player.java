package main.model.simulator.player;

import java.util.ArrayList;
import java.util.HashMap;

import main.model.GearCalculator;
import main.model.StatBoost;
import main.model.simulator.Spell;

public class Player {
    private PlayerStats stats;
    private PlayerGear gear;

    private ArrayList<Spell> spells;
    private ArrayList<Spell> currentHand;
    private HashMap<String, ArrayList<Integer>> shields;
    private HashMap<String, ArrayList<StatBoost>> wards;

    private Player enemy;

    private GearCalculator calculator;

    // EFFECTS: constructs a player with empty stats, gear, spells, hand, shields,
    // and wards
    public Player() {
        // TODO
    }

    // MODIFIES: this
    // EFFECTS: adds spell to spells
    public void addSpell(Spell spell) {
        // TODO
    }

    // MODIFIES: this
    // EFFECTS: if currentHand is empty or spell is null, generates a random number
    // of 7 random spells from spells
    // otherwise removes spell from currentHand and replaces it with a new random
    // spell copy from spells
    public void updateHand(Spell spell) {
        // TODO
    }

    // MODIFIES: this
    // EFFECTS: casts a spell from currentHand and updates currentHand
    public void castSpell() {
        // TODO
    }

    public PlayerGear getPlayerGear() {
        return null;
    }

    public PlayerStats getPlayerStats() {
        return null;
    }
}
