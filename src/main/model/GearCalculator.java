package main.model;

// represents a calculator to calculate total stat boosts from gear
public class GearCalculator {

    // EFFECTS: constructs a gear calculator with stat calculation formulas
    public GearCalculator() {
    }

    // REQUIRES: damage >= 0
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

    // REQUIRES: resist >= 0
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

    // REQUIRES: playerCrit, enemyBlock >= 0
    // EFFECTS: returns damage multiplier as determined by the piecewise formula:
    // if enemyBlock = 0: multiplier = 2.0,
    // else (enemyBlock > 0):
    // multiplier = 1.52 * (playerCrit / enemyBlock) / ((playerCrit / enemyBlock) +
    // 0.167)
    public double calculateCritDmgMultiplier(int playerCrit, int enemyBlock) {
        if (enemyBlock == 0) {
            return 2.0;
        } else {
            return 1.52 * ((double) playerCrit / (double) enemyBlock)
                    / (((double) playerCrit / (double) enemyBlock) + 0.167);
        }
    }

    // REQUIRES: playerCrit, enemyBlock, playerLevel >= 0
    // EFFECTS: if playerCrit > 0, returns critical strike chance as determined by
    // the piecewise formula:
    // if enemyBlock == 0: chance = max(playerLevel / 100, 0.95)
    // if enemyBlock > 0:
    // chance = (1.01 * critBlockRatio/(critBlockRatio + 0.34)) *
    // (1 - max(0.95 - playerLevel/100, 0.0))
    // where critBlockRatio = playerCrit/enemyBlock
    // otherwise returns 0.0
    public double calculateCritChanceMultiplier(int playerCrit, int enemyBlock, int playerLevel) {
        if (playerCrit > 0) {
            if (enemyBlock == 0) {
                return Math.max(playerLevel / 100, 0.95);
            } else if (enemyBlock > 0) {
                double critBlockRatio = (double) playerCrit / (double) enemyBlock;
                return (1.01 * critBlockRatio / (critBlockRatio + 0.34))
                        * (1 - Math.max(0.95 - (double) playerLevel / 100, 0.0));
            }
        }

        return 0.0;
    }

    // REQUIRES: accuracy >= 0
    // EFFECTS: returns boosted accuracy as determined by:
    // boosted accuracy = min(accuracy / 100, 1.0)
    public double calculateAccuracy(int accuracy) {
        return Math.min((double) accuracy / 100, 1.0);
    }

    // REQUIRES: powerPip >= 0
    // EFFECTS: returns power pip conversion rate as determined by:
    // power pip conversion = min(powerPip / 100, 1.0)
    public double calculatePowerPipConversionRate(int powerPip) {
        return Math.min((double) powerPip / 100, 1.0);
    }

    // REQUIRES: pierceResistShieldDifference >= 0
    // EFFECTS: returns pierce damage multiplier as determined by:
    // multiplier = pierceResistShieldDifference / 100
    // (pierceResistShieldDifference is attackerPierce - enemyResist - enemyShield)
    public double calculatePierceMultiplier(int pierceResistShieldDifference) {
        return (double) pierceResistShieldDifference / 100;
    }
}
