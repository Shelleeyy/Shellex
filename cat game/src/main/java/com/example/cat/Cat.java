package com.example.cat;

import com.example.cat.enums.CatRarities;
import com.example.cat.enums.CatTypes;

public abstract class Cat {
    protected String name;
    protected double hp;
    protected double attackPower;
    protected String description;

    protected CatTypes element;
    protected CatRarities rarity;

    
    // IMAGES ============
    protected String profilePath;
    protected String fullartPath;

    public AttackObject takeDamage(Cat attacker) { // Behavior for all cats. Just element check.
        if (attacker.getElement() == getElement()) {
            // this means a water attacked a water, a fire attacked a fire, etc.
            return new AttackObject(attacker, this, 0, hp, null, "The attack was not very effective...");
        }
        this.hp -= attacker.getAttackPower();
        return new AttackObject(attacker, this, attacker.getAttackPower(), this.hp, null, "The attack did " + attacker.getAttackPower() + " damage!");
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

    public CatTypes getElement() {
        return element;
    }

    public CatRarities getRarity() {
        return rarity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Cat[name=%s, hp=%.1f, attackPower=%.1f, description=%s, profilePath=%s, fullartPath=%s]",
                name, hp, attackPower, description, profilePath, fullartPath);
    }
}
