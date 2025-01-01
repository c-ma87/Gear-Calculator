package main.model.setBonus;

import java.util.ArrayList;
import java.util.List;

// represents a gear set bonus with tiers of set bonus stat boosts
public class SetBonus {
    private String name;
    private List<Tier> tiers;

    // EFFECTS: constructs a set bonus with a name and no tiers
    public SetBonus() {
        // TODO
    }

    // REQUIRES: tier != null
    // MODIFIES: this
    // EFFECTS: adds tier to tiers
    public void addTier(Tier tier) {
        // TODO
    }

    // MODIFIES: this
    // EFFECTS: removes tier from tiers
    public void removeTier(Tier tier) {
        // TODO
    }

    public List<Tier> getTiers() {
        // TODO
        return new ArrayList<>();
    }
}
