package main.model.simulator.rater;

import main.model.GearItem;

public class TankGearRater extends GearRater {

    // REQUIRES: item is not null
    // EFFECTS: gives item a score based on damage dealt, number of rounds played, and whether the player won
    // - higher rating for less damage taken
    // - higher rating for more health
    // - higher rating for player win: if player wins, add points equal to combined total of enemy health
    // total score is player health / damage taken + enemy health if player wins or
    // player health / damage taken if player loses
    @Override
    void rateItem(GearItem item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rateItem'");
    }

}
