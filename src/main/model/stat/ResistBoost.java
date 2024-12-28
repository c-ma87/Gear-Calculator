package main.model.stat;

// formula for resist multiplier from 
// https://finalbastion.com/wizard101-guides/w101-analysis/damage-resist-and-pierce-spring-2021/

// represents a boost to resist stat (reduction to incoming damage) calculated by linear formula x/100
// for example, if boost = 60, incoming damage will be 0.40 times after the boost is applied
public class ResistBoost extends StatBoost {
    private double multiplier;

    // REQUIRES: school is one of "life", "death", "myth", "ice", "fire",
    // "storm", "balance" && boost >= 0
    // EFFECTS: constructs a resist boost with a boost value, school, and multiplier
    public ResistBoost(int boost, String school) {
        super(boost, school);
    }

    // EFFECTS: returns fraction (resist) multiplier determined by the formula:
    // multiplier = 1 - boost/100
    // if multiplier < 0, returns 0.0
    @Override
    protected double calculateMultiplier() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateMultiplier'");
    }

    // EFFECTS: sets this.boost to boost and re-calculates and sets multiplier
    @Override
    public void setBoost(int boost) {
        super.setBoost(boost);
        // TODO
    }

    public double getMultiplier() {
        return 0.0;
    }
}
