package main.model.stat;

// formula for damage multiplier derived from https://finalbastion.com/wizard101-guides/w101-analysis/damage-resist-and-pierce-spring-2021/
// and https://www.youtube.com/watch?v=zQbpogGOSgA
// represents a boost to damage stat, calculated by the limit formula L - L / e^(k * boost + n)
public class DamageBoost extends StatBoost {
    private double multiplier;

    // EFFECTS: constructs a damage boost with a boost value, school, and multiplier
    public DamageBoost(int boost, String school) {
        super(boost, school);
        multiplier = calculateMultiplier();
    }

    // EFFECTS: returns multiplier as determined by the piecewise defined formula:
    // if boost <= 235, multiplier = boost/100 + 1
    // if boost > 235, multiplier = 3 - 3 / (e^((1/500) * boost + ln(128) - 237 * (3.008/189))) + 1
    @Override
    protected double calculateMultiplier() {
        if (getBoost() <= 235) {
            return (double) getBoost() / 100.0 + 1.0;
        } else {
            return 3.0 - 3.0 / (Math.exp((1.0/500.0) * (double) getBoost() + Math.log(128.0) - 237.0 * (3.008/189.0))) + 1.0;
        }
    }

    // EFFECTS: sets this.boost to boost and re-calculates and sets multiplier
    @Override
    public void setBoost(int boost) {
        super.setBoost(boost);
        multiplier = calculateMultiplier();
    }

    public double getMultiplier() {
        return multiplier;
    }
}
