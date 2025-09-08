package com.example.game;

public class GoldenAura extends CharacterDecorator {
    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public String getSprite() {
        return "Golden_" + super.getSprite();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + 100;
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 100;
    }

    @Override
    public void move() {
        System.out.println("Golden Aura activated");
        System.out.println("Moving with speed " + getSpeed() + " using sprite: " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("Golden Aura activated");
        System.out.println("Attacking with damage " + getDamage() + " using sprite: " + getSprite());
    }
}
