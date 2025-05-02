package main.model.simulator.player;

import java.util.HashMap;

public class PlayerStats {
    private int level;
    private int health;
    private int mana;
    private int powerPip;
    private HashMap<String, Integer> damage;
    private HashMap<String, Integer> resist;
    private HashMap<String, Integer> critical;
    private HashMap<String, Integer> block;
    private HashMap<String, Integer> accuracy;
    private HashMap<String, Integer> pierce;

    public PlayerStats(int level, int health, int mana, int damage, int resist, int critical, int block, int accuracy,
            int powerPip, int pierce) {
        // TODO
    }

    public void setLevel(int level) {
        // TODO
    }

    public void setHealth(int health) {
        // TODO
    }

    public void setMana(int mana) {
        // TODO
    }

    public void setPowerPip(int powerPip) {
        // TODO
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: sets damage stat with associated school to damage
    public void setDamage(int damage, String school) {
        // TODO
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: sets resist stat with associated school to resist
    public void setResist(int resist, String school) {
        // TODO
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: sets critical stat with associated school to critical
    public void setCritical(int critical, String school) {
        // TODO
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: sets block stat with associated school to block
    public void setBlock(int block, String school) {
        // TODO
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: sets accuracy stat with associated school to accuracy
    public void setAccuracy(int accuracy, String school) {
        // TODO
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: sets pierce stat with associated school to pierce
    public void setPierce(int pierce, String school) {
        // TODO
    }

    public int getLevel() {
        return 0;
    }

    public int getHealth() {
        return 0;
    }

    public int getMana() {
        return 0;
    }

    public int getPowerPip() {
        return 0;
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: if damage stat with associated school exists, returns the stat value
    // otherwise returns 0
    public int getDamage(String school) {
        return 0;
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: if resist stat with associated school exists, returns the stat value
    // otherwise returns 0
    public int getResist(String school) {
        return 0;
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: if critical stat with associated school exists, returns the stat value
    // otherwise returns 0
    public int getCritical(String school) {
        return 0;
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: if block stat with associated school exists, returns the stat value
    // otherwise returns 0
    public int getBlock(String school) {
        return 0;
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: if accuracy stat with associated school exists, returns the stat value
    // otherwise returns 0
    public int getAccuracy(String school) {
        return 0;
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: if pierce stat with associated school exists, returns the stat value
    // otherwise returns 0
    public int getPierce(String school) {
        return 0;
    }
}
