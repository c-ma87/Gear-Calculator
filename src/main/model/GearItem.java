package main.model;

import main.model.setBonus.SetBonus;

// represents a gear item with item stats
public class GearItem {
    private String name;
    private String type;
    private int health;
    private int mana;
    private int damage;
    private int resist;
    private int critical;
    private int block;
    private int accuracy;
    private int powerPip;
    private int pierce;
    private SetBonus setBonus;

    // REQUIRES: health, mana, damage, resist, critical, block, accuracy, powerPip, pierce >= 0
    // EFFECTS: constructs a gear item with a name and type, and a health, mana, damage, resist, critical,
    // block, accuracy, power pip, pierce rating, and no set bonus
    public GearItem(int health, int mana, int damage, int resist, int critical, int block, int accuracy, int powerPip, int pierce) {
        // TODO
    }

    // REQUIRES: damage >= 0
    public void setDamage(int damage) {
        // TODO
    }

    // REQUIRES: resist >= 0
    public void setResist(int resist) {
        // TODO
    }

    // REQUIRES: critical >= 0
    public void setCritical(int critical) {
        // TODO
    }

    // REQUIRES: block >= 0
    public void setBlock(int block) {
        // TODO
    }

    // REQUIRES: accuracy >= 0
    public void setAccuracy(int accuracy) {
        // TODO
    }

    // REQUIRES: powerPip >= 0
    public void setPowerPip(int powerPip) {
        // TODO
    }

    // REQUIRES: pierce >= 0
    public void setPierce(int pierce) {
        // TODO
    }

    public void setSetBonus(SetBonus setBonus) {
        // TODO
    }

    // MODIFIES: this
    // EFFECTS: sets setBonus to null
    public void removeSetBonus() {
        // TODO
    }

    public String getName() {
        // TODO
        return "";
    }

    public String getType() {
        // TODO
        return "";
    }

    public int getHealth() {
        // TODO
        return 0;
    }

    public int getMana() {
        // TODO
        return 0;
    }

    public int getDamage() {
        // TODO
        return 0;
    }

    public int getResist() {
        // TODO
        return 0;
    }

    public int getCritical() {
        // TODO
        return 0;
    }

    public int getBlock() {
        // TODO
        return 0;
    }

    public int getAccuracy() {
        // TODO
        return 0;
    }

    public int getPowerPip() {
        // TODO
        return 0;
    }

    public int getPierce() {
        // TODO
        return 0;
    }

    public SetBonus getSetBonus() {
        // TODO
        return null;
    }
}
