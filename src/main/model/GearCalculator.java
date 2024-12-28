package main.model;

// represents a calculator to calculate total stat boosts from gear
public class GearCalculator {

    // EFFECTS: constructs a gear calculator with stat calculation formulas
    public GearCalculator() {
        // TODO
    }

    // EFFECTS: returns multiplier as determined by the piecewise defined formula:
    // if boost <= 235, multiplier = boost/100 + 1
    // if boost > 235,
    // multiplier = 3 - 3 / (e^((1/500) * boost + ln(128) - 237 * (3.008/189))) + 1
    public double calculateDamageMultiplier(int damage) {
        if (damage <= 235) {
            return (double) damage / 100.0 + 1.0;
        } else {
            return 3.0
                    - 3.0 / (Math.exp((1.0 / 500.0) * (double) damage + Math.log(128.0) - 237.0 * (3.008 / 189.0)))
                    + 1.0;
        }
    }

    // EFFECTS: returns fraction (resist) multiplier determined by the formula:
    // multiplier = 1 - boost/100
    // if multiplier < 0, returns 0.0
    public double calculateResistMultiplier(int resist) {
        double multiplier = 1.0 - (double) resist / 100;
        if (multiplier < 0) {
            return 0.0;
        } else {
            return multiplier;
        }
    }
}
