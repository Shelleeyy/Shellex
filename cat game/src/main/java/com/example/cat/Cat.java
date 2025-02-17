package com.example.cat;

public abstract class Cat {
    protected String name;
    protected double hp;
    protected double attackPower;
    protected String description;
    
    // IMAGES ============
    protected String profilePath;
    protected String fullartPath;

    public String takeDamage(Cat attacker) { // Behavior for all cats. Just element check.
        if (attacker.getElement() == getElement()) {
            // this means a water attacked a water, a fire attacked a fire, etc.
            return 
        }
    }

    public double getAttackPower() {
        return attackPower;
    }

    public double getHp() {
        return hp;
    }

    public String getProfilePath() {
        return profilePath;
    }

    public String getFullartPath() {
        return fullartPath;
    }

    public CatElements getElement() {
        return 
    }

    @Override
    public String toString() {
        return String.format("Cat[name=%s, hp=%.1f, attackPower=%.1f, description=%s, profilePath=%s, fullartPath=%s]",
                name, hp, attackPower, description, profilePath, fullartPath);
    }
}
