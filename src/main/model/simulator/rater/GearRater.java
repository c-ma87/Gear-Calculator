package main.model.simulator.rater;

import main.model.GearItem;

public abstract class GearRater {

    // EFFECTS: constructs a gear rater
    public GearRater() {
        // TODO
    }

    // EFFECTS: sets item's rating based on scoring criteria
    abstract void rateItem(GearItem item);
}
