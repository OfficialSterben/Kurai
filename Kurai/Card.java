import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    private int health;
    private int mana;
    private int damage;
    private int position;
    public void act()
    {
        
    }
    public Card() {
        GreenfootImage image = getImage();
        image.scale(250,320);
        if (Greenfoot.getRandomNumber(101) < 80) {
            this.health = Greenfoot.getRandomNumber(4) + 1;
            this.mana = Greenfoot.getRandomNumber(4) + 1;
            this.damage = Greenfoot.getRandomNumber(4) + 1;
        }
        else {
            this.health = Greenfoot.getRandomNumber(4) + 4;
            this.mana = Greenfoot.getRandomNumber(4) + 4;
            this.damage = Greenfoot.getRandomNumber(4) + 4;
        }
    }
}
