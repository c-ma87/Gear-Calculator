package main.model.simulator;

import main.model.simulator.player.Player;

public class Simulator {

    // EFFECTS: returns true if total accuracy (from spell + player) expressed as
    // percentage < random decimal in range [0, 1], or
    // if total accuracy == 0
    public boolean fizzle(Player player, Spell spell) {
        double accuracy = (double) (spell.getAccuracy() + player.getPlayerStats().getStat("accuracy", spell.getSchool()) / 100);
        double randomCast = Math.random();
        return accuracy < randomCast || accuracy == 0;
    }

    // EFFECTS: returns true if player's mana < spell's required mana
    private boolean insufficientMana(Player player, Spell spell) {
        return player.getPlayerStats().getStat("mana", null) < spell.getRequiredMana();
    }

    // EFFECTS: returns false if player's pips < spell's required pips
    private boolean insufficientPips() {
        // TODO
        return false;
    }
}
