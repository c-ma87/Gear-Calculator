package main.model.simulator;

public class Spell {
    String name;
    String school;
    int damage;
    int healing;
    int shield;
    int ward;
    int requiredPips;
    int requiredMana;
    int accuracy;
    boolean aoe;

    // EFFECTS: creates a spell with a name and stats
    public Spell(String name, String school, int damage, int healing, int shield, int ward, int requiredPips,
            int requiredMana, int accuracy, boolean aoe) {
        this.school = school;
        this.name = name;
        this.damage = damage;
        this.healing = healing;
        this.shield = shield;
        this.ward = ward;
        this.requiredPips = requiredPips;
        this.requiredMana = requiredMana;
        this.accuracy = accuracy;
        this.aoe = aoe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(String school) {
        this.school = school;
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

    public void setRequiredPips(int requiredPips) {
        this.requiredPips = requiredPips;
    }

    public void setRequiredMana(int requiredMana) {
        this.requiredMana = requiredMana;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setAoe(boolean aoe) {
        this.aoe = aoe;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
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

    public int getRequiredPips() {
        return requiredPips;
    }

    public int getRequiredMana() {
        return requiredMana;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public boolean getAoe() {
        return aoe;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + damage;
        result = prime * result + healing;
        result = prime * result + shield;
        result = prime * result + ward;
        result = prime * result + requiredPips;
        result = prime * result + (aoe ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Spell other = (Spell) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (damage != other.damage)
            return false;
        if (healing != other.healing)
            return false;
        if (shield != other.shield)
            return false;
        if (ward != other.ward)
            return false;
        if (requiredPips != other.requiredPips)
            return false;
        if (aoe != other.aoe)
            return false;
        return true;
    }
}
