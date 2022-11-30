import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends Actor
{
    public Screen() {
        turn(90);
        GreenfootImage image = getImage();
        image.scale(2000,1500);
        setImage(image);
    }
}
