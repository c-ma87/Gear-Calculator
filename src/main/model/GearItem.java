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

    // EFFECTS: constructs a gear item with a name and type, and an empty list of
    // stat boosts
    public GearItem(String name, String type) {
        this.name = name;
        this.type = type;
        stats = new ArrayList<>();
        setBonus = null;
    }

    // MODIFIES: this
    // EFFECTS: if statBoost with the same type and school is not already in stats,
    // adds statBoost to stats, otherwise replaces stat boost in stats with the
    // same type and school with statBoost
    public void addStatBoost(StatBoost statBoost) {
        if (!stats.contains(statBoost)) {
            stats.add(statBoost);
        } else {
            replaceStatBoost(statBoost);
        }
    }

    // MODIFIES: this
    // EFFECTS: replaces stat boost in stats with the same school
    // and type as statBoost
    private void replaceStatBoost(StatBoost statBoost) {
        for (int index = 0; index < stats.size(); index++) {
            if (stats.get(index).equals(statBoost)) {
                stats.remove(index);
                stats.add(index, statBoost);
            }
        }
    }

    public void setSetBonus(SetBonus setBonus) {
        this.setBonus = setBonus;
    }

    // MODIFIES: this
    // EFFECTS: sets setBonus to null
    public void removeSetBonus() {
        setBonus = null;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<StatBoost> getStats() {
        return stats;
    }

    public SetBonus getSetBonus() {
        return setBonus;
    }
}
