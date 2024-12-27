package main.model.stat;

// represents a gear stat with an integer boost value and school
public abstract class StatBoost {
    private int boost;
    private String school;

    // REQUIRES: school is one of "life", "death", "myth", "ice", "fire",
    // "storm", "balance"
    // EFFECTS: constructs a stat boost with a boost value and a school
    public StatBoost(int boost, String school) {
        // TODO
    }

    // EFFECTS: returns the multiplier applied as a stat bonus as a percentage, based on boost
    public abstract int getMultiplier();

    public void setBoost() {
        // TODO
    }

    public int getBoost() {
        // TODO
        return 0;
    }
}
