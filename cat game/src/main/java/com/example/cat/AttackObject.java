package com.example.cat;

import java.util.List;

public class AttackObject {
    public Cat attacker;
    public Cat victim;
    public double attackerDamage;
    public double healthAfter;
    public List<String> effects;
    public String message;

    public AttackObject(Cat attacker, Cat victim, double attackerDamage, double healthAfter, List<String> effects, String message) {
        this.attacker = attacker;
        this.victim = victim;
        this.attackerDamage = attackerDamage;
        this.healthAfter = healthAfter;
        this.effects = effects;
        this.message = message;
    }
}
