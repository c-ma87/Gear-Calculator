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

    public PlayerStats(int level, int health, int mana) {
        this.level = level;
        this.health = health;
        this.mana = mana;
        damage = new HashMap<>();
        resist = new HashMap<>();
        critical = new HashMap<>();
        block = new HashMap<>();
        accuracy = new HashMap<>();
        pierce = new HashMap<>();
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setPowerPip(int powerPip) {
        this.powerPip = powerPip;
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: sets damage stat with associated school to damage
    public void setDamage(int damage, String school) {
        this.damage.put(school, damage);
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: sets resist stat with associated school to resist
    public void setResist(int resist, String school) {
        this.resist.put(school, resist);
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: sets critical stat with associated school to critical
    public void setCritical(int critical, String school) {
        this.critical.put(school, critical);
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: sets block stat with associated school to block
    public void setBlock(int block, String school) {
        this.block.put(school, block);
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: sets accuracy stat with associated school to accuracy
    public void setAccuracy(int accuracy, String school) {
        this.accuracy.put(school, accuracy);
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: sets pierce stat with associated school to pierce
    public void setPierce(int pierce, String school) {
        this.pierce.put(school, pierce);
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getPowerPip() {
        return powerPip;
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: if damage stat with associated school exists, returns the stat value
    // otherwise returns 0
    public int getDamage(String school) {
        if (damage.containsKey(school)) {
            return damage.get(school);
        } else {
            return 0;
        }
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: if resist stat with associated school exists, returns the stat value
    // otherwise returns 0
    public int getResist(String school) {
        if (resist.containsKey(school)) {
            return resist.get(school);
        } else {
            return 0;
        }
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: if critical stat with associated school exists, returns the stat
    // value
    // otherwise returns 0
    public int getCritical(String school) {
        if (critical.containsKey(school)) {
            return critical.get(school);
        } else {
            return 0;
        }
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: if block stat with associated school exists, returns the stat value
    // otherwise returns 0
    public int getBlock(String school) {
        if (block.containsKey(school)) {
            return block.get(school);
        } else {
            return 0;
        }
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: if accuracy stat with associated school exists, returns the stat
    // value
    // otherwise returns 0
    public int getAccuracy(String school) {
        if (accuracy.containsKey(school)) {
            return accuracy.get(school);
        } else {
            return 0;
        }
    }

    // REQUIRES: school is one of "fire", "ice", "myth", "storm", "life", "death",
    // or "balance"
    // EFFECTS: if pierce stat with associated school exists, returns the stat value
    // otherwise returns 0
    public int getPierce(String school) {
        if (pierce.containsKey(school)) {
            return pierce.get(school);
        } else {
            return 0;
        }
    }
}
