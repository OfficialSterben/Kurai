import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int health;
    private int mana;
    public Player(int health, int mana) {
        GreenfootImage image = getImage();
        image.scale(150,150);
        this.health = health;
        this.mana = mana;
    }
    public void act() {
        //Change costume when damaged
    }
    public void addMana() {
        ++this.mana;
    }
    public void removeMana(int n) {
        this.mana -= n;
    }
    public int getMana() {
        return this.mana;
    }
    public void removeHealth(int n) {
        this.health -= n;
    }
    public int getHealth() {
        return this.health;
    }
}