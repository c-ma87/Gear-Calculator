package main.model.stat;

// formula for resist multiplier from 
// https://finalbastion.com/wizard101-guides/w101-analysis/damage-resist-and-pierce-spring-2021/
// represents a boost to resist stat calculated by linear formula x/100
public class ResistBoost extends StatBoost {
    private double multiplier;

    // EFFECTS: constructs a resist boost with a boost value, school, and multiplier
    public ResistBoost(int boost, String school) {
        super(boost, school);
    }

    // EFFECTS: returns multiplier as determined by the formula:
    // multiplier = boost/100 + 1
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
