package main.model.setBonus;

import java.util.ArrayList;
import java.util.List;

import main.model.StatBoost;

// represents a set bonus tier with a list of stat boosts
public class Tier {
    private List<StatBoost> statBoosts;

    // EFFECTS: constructs a tier with a list of stat boosts
    public Tier() {
        // TODO
    }

    // REQUIRES: statBoost != null
    // MODIFIES: this
    // EFFECTS: adds statBoost to statBoosts
    public void addStatBoost(StatBoost statBoost) {
        // TODO
    }

    // MODIFIES: this
    // EFFECTS: removes statBoost from statBoosts
    public void removeStatBoost(StatBoost statBoost) {
        // TODO
    }

    public List<StatBoost> getStatBoosts() {
        // TODO
        return new ArrayList<>();
    }
}
