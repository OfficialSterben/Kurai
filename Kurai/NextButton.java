import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextButton extends Actor
{
    public NextButton() {
        GreenfootImage image = getImage();
        image.scale(200, 70);
    }
    public void act()
    {
        boolean phaseS = Field.getPhaseS();
        boolean phaseD = Field.getPhaseD();
        boolean phaseA = Field.getPhaseA();
        boolean finish = Field.getFinish();
        if (phaseD == true && Greenfoot.mouseClicked(this)) {
            getWorld().removeObject(this);
            Field.setPhaseS(true);
            Field.setPhaseD(false);
        }
        
        if (phaseS == true && Greenfoot.mouseClicked(this)) {
            getWorld().removeObject(this);
            Field.setPhaseA(true);
            Field.setPhaseS(false);
        }
        
        if (phaseA == true && Greenfoot.mouseClicked(this)) {
            getWorld().removeObject(this);
            Field.setFinish(true);
            Field.setPhaseA(false);
        }
        
        if (finish == true && Greenfoot.mouseClicked(this)) {
            getWorld().removeObject(this);
            Field.setFinish(false);
            Field.setTurn(false);
        }
    }
}
