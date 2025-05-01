package main.model;

import main.model.setBonus.SetBonus;

import java.util.ArrayList;
import java.util.HashMap;

// represents a gear item with item stats
public class GearItem {
    private String name;
    private String type;
    // dictionary of stat boosts of mapped as stat type : list of stats of said type
    private HashMap<String, ArrayList<StatBoost>> statBoosts;
    private SetBonus setBonus;

    // EFFECTS: constructs a gear item with a name and type, and an empty list of
    // stat boosts
    public GearItem(String name, String type) {
        this.name = name;
        this.type = type;
        statBoosts = new HashMap<>();
        setBonus = null;
    }

    // MODIFIES: this
    // EFFECTS: if statBoost with the same type and school is not already in stats,
    // adds statBoost to stats
    // if stat boost with same type and school is already in stats, replace existing
    // stat boost with new statBoost
    public void addStatBoost(StatBoost statBoost) {
        if (!statBoosts.containsKey(statBoost.getType())) {
            ArrayList<StatBoost> stats = new ArrayList<>();
            stats.add(statBoost);
            statBoosts.put(statBoost.getType(), stats);
        } else {
            ArrayList<StatBoost> stats = statBoosts.get(statBoost.getType());
            if (!stats.contains(statBoost)) {
                stats.add(statBoost);
            } else {
                replaceStatBoost(statBoost);
            }
        }
    }

    // MODIFIES: this
    // EFFECTS: replaces stat boost in stats with the same school
    // and type as statBoost
    private void replaceStatBoost(StatBoost statBoost) {
        if (statBoosts.containsKey(statBoost.getType())) {
            ArrayList<StatBoost> stats = statBoosts.get(statBoost.getType());
            for (int index = 0; index < stats.size(); index++) {
                if (stats.get(index).equals(statBoost)) {
                    stats.remove(index);
                    stats.add(index, statBoost);
                }
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

    public HashMap<String, ArrayList<StatBoost>> getStatBoosts() {
        return statBoosts;
    }

    public SetBonus getSetBonus() {
        return setBonus;
    }
}
