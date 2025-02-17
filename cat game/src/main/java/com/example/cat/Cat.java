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
        switch (attacker.getElement()) {
            case FIRE:
                if (this.getElement() == CatTypes.WATER) {
                    this.hp -= attacker.getAttackPower() * 0.5;
                    return new AttackObject(attacker, this, attacker.getAttackPower() * 0.5, this.hp, null, "Attack did nothing. " + this.name + " put out the fire.");
                } else if (this.getElement() == CatTypes.GRASS) {
                    this.hp -= attacker.getAttackPower() * 2;
                    return new AttackObject(attacker, this, attacker.getAttackPower() * 2, this.hp, null, "This attack was super effective! " + this.name + " was burned.");
                }
                break;
            case WATER:
                if (this.getElement() == CatTypes.FIRE) {
                    this.hp -= attacker.getAttackPower() * 2;
                    return new AttackObject(attacker, this, attacker.getAttackPower() * 2, this.hp, null, "This attack was super effective! " + this.name + " was drenched.");
                } else if (this.getElement() == CatTypes.GRASS) {
                    this.hp -= attacker.getAttackPower() * 0.5;
                    return new AttackObject(attacker, this, attacker.getAttackPower() * 0.5, this.hp, null, "Attack did nothing. " + this.name + " absorbed the water.");
                }
                break;
            case GRASS:
                if (this.getElement() == CatTypes.FIRE) {
                    this.hp -= attacker.getAttackPower() * 0.5;
                    return new AttackObject(attacker, this, attacker.getAttackPower() * 0.5, this.hp, null, "Attack did nothing. " + this.name + " resisted the burn.");
                } else if (this.getElement() == CatTypes.WATER) {
                    this.hp -= attacker.getAttackPower() * 2;
                    return new AttackObject(attacker, this, attacker.getAttackPower() * 2, this.hp, null, "This attack was super effective! " + this.name + " was overgrown.");
                }
                break;
            default:
                break;
        }


        this.hp -= attacker.getAttackPower();
        return new AttackObject(attacker, this, attacker.getAttackPower(), this.hp, null, "The attack did " + attacker.getAttackPower() + " damage!");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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
        return "Cat[\nname=" + name + 
               ",\nhp=" + hp + 
               ",\nattackPower=" + attackPower + 
               ",\ndescription=" + description + 
               ",\nprofilePath=" + profilePath + 
               ",\nfullartPath=" + fullartPath + 
               ",\nelement=" + element + 
               ",\nrarity=" + rarity + "\n]";
    }
}
