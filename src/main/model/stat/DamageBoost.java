package main.model.stat;

// represents a boost to damage stat
public class DamageBoost extends StatBoost {

    // EFFECTS: constructs a damage boost with a boost value and school
    public DamageBoost(int boost, String school) {
        super(boost, school);
    }

    @Override
    public int getMultiplier() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMultiplier'");
    }
}
