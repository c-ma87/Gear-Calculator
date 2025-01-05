package main.model;

import main.model.setBonus.SetBonus;

import java.util.List;
import java.util.ArrayList;

// represents a gear item with item stats
public class GearItem {
    private String name;
    private String type;
    private List<StatBoost> stats;
    private SetBonus setBonus;

    // EFFECTS: constructs a gear item with a name and type, and an empty list of stat boosts
    public GearItem(String name, String type) {
        // TODO
    }

    // MODIFIES: this
    // EFFECTS: if statBoost with the same type is not already in stats, adds statBoost to stats,
    // otherwise replaces statBoost in stats with the same type 
    public void addStatBoost(StatBoost statBoost) {
        // TODO
    }

    public void setSetBonus(SetBonus setBonus) {
        // TODO
    }

    // MODIFIES: this
    // EFFECTS: sets setBonus to null
    public void removeSetBonus() {
        // TODO
    }

    public String getName() {
        // TODO
        return "";
    }

    public String getType() {
        // TODO
        return "";
    }

    public List<StatBoost> getStats() {
        // TODO
        return new ArrayList<>();
    }

    public SetBonus getSetBonus() {
        // TODO
        return null;
    }
}
