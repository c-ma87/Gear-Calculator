package main.model;

// represents a gear stat with an integer boost value, school, and name
public class StatBoost {
    private int boost;
    private String school;
    private String name;

    // REQUIRES: school is one of "life", "death", "myth", "ice", "fire",
    // "storm", "balance" && boost >= 0
    // EFFECTS: constructs a stat boost with a boost value, school, and name
    public StatBoost(int boost, String school, String name) {
        this.boost = boost;
        this.school = school;
        this.name = name;
    }

    // REQUIRES: boost >= 0
    // MODIFIES: this
    // EFFECTS: sets this.boost to boost
    public void setBoost(int boost) {
        this.boost = boost;
    }

    public int getBoost() {
        return boost;
    }

    public String getSchool() {
        return school;
    }

    public String getName() {
        return name;
    }
}
