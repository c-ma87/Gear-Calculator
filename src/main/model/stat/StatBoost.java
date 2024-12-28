package main.model.stat;

// represents a gear stat with an integer boost value and school
public abstract class StatBoost {
    private int boost;
    private String school;

    // REQUIRES: school is one of "life", "death", "myth", "ice", "fire",
    // "storm", "balance" && boost >= 0
    // EFFECTS: constructs a stat boost with a boost value and a school
    public StatBoost(int boost, String school) {
        this.boost = boost;
        this.school = school;
    }

    // EFFECTS: returns the multiplier applied as a stat bonus as a multiplier, based on boost
    protected abstract double calculateMultiplier();

    // REQUIRES: boost >= 0
    public void setBoost(int boost) {
        this.boost = boost;
    }

    public int getBoost() {
        return boost;
    }

    public String getSchool() {
        return school;
    }
}
