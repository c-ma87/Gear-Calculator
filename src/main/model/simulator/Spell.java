package main.model.simulator;

public class Spell {
    int damage;
    int healing;
    int shield;
    int ward;
    boolean aoe;

    // EFFECTS: creates a spell with a name and stats
    public Spell(int damage, int healing, int shield, int ward, boolean aoe) {
        this.damage = damage;
        this.healing = healing;
        this.shield = shield;
        this.ward = ward;
        this.aoe = aoe;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public void setWard(int ward) {
        this.ward = ward;
    }

    public void setAoe(boolean aoe) {
        this.aoe = aoe;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealing() {
        return healing;
    }

    public int getShield() {
        return shield;
    }

    public int getWard() {
        return ward;
    }

    public boolean getAoe() {
        return aoe;
    }
}
