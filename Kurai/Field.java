import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Field extends World
{
    private static boolean turn1 = true;
    private static boolean phaseD = false;
    private static boolean phaseS = false;
    private static boolean phaseA = false;
    private static boolean start1 = true;
    private static boolean start2 = false;
    private static boolean finish = false;
    Player p1 = new Player(30,0);
    Player p2 = new Player(30,1);
    private static int hand1 = 0;
    private static int hand2 = 0;
    
    //Temp values
    private static boolean a = true;
    private static boolean b = true;
    private static boolean c = true;
    private static boolean d = true;
    
    //Card positions
    private Boolean[] hand1Pos = new Boolean[5];
    private Boolean[] hand2Pos = new Boolean[5];
    //Field positions
    private Boolean[] field1Pos = new Boolean[5];
    private Boolean[] field2Pos = new Boolean[5];
    
    private static int freePosition = 0;
    private static boolean positionSetup = true;
    public Field()
    {    
        super(1500, 850, 1);
    }
    public void act() {
        if (positionSetup == true) {
            for (int i = 0; i < 5; i++) {
               hand1Pos[i] = true;
               hand2Pos[i] = true;
               field1Pos[i] = true;
               field2Pos[i] = true;
            }
            positionSetup = false;
        }
        if (start1 == true) {
            addObject(p1, 1400, 100);
            addObject(p2, 100, 600);
            for (int i = 1; i < 3; i++) {
                pickCard(i);
                hand1Pos[i - 1] = false;
            }
            start1 = false;
        }
        if (turn1 == true) {
            if (hand1 != 5) {
                    phaseS = true;
                }
                    else {
                    phaseD = true;
                } 
            if (phaseD == true) {
                phaseD();
            }
            if (phaseS == true) {
                for (int i = 0; i < 5; i++) {
                    if (hand1Pos[i] == true) {
                        freePosition = i;
                    }
                    break;
                }
                phaseS(freePosition);
            }
            if (phaseA == true) {
                phaseA();
            }
        }
    }
    public void pickCard(int pos) {
        int x = (pos * 200) + 300;
        Card card = new Card();
        addObject(card, 0, 800);
        for (int i = 1; i <= x; i += 20) {
            card.move(20);
            Greenfoot.delay(1);
        }
    }
    public void phaseD() {
        if (a == true) {
            addObject(new NextButton(), 1200, 760 / 2);
            a = false;
            }
    }
    public void phaseS(int n) {
        if (b == true) {
            addObject(new NextButton(), 1350, 760 / 2);
            pickCard(n);
            b = false;
            }
    }
    public void phaseA() {
        if (c == true) {
            addObject(new NextButton(), 1350, 760 / 2);
            c = false;
        }
    }
    public static void setPhaseD(boolean t) {
        phaseD = t;
    }
    public static void setPhaseS(boolean t) {
        phaseS = t;
    }
    public static void setPhaseA(boolean t) {
        phaseA = t;
    }
    public static void setFinish(boolean t) {
        finish = t;
    }
    public static void setTurn(boolean t) {
        turn1 = t;
    }
    public static boolean getPhaseD() {
        return phaseD;
    }
    public static boolean getPhaseS() {
        return phaseS;
    }
    public static boolean getPhaseA() {
        return phaseA;
    }
    public static boolean getFinish() {
        return finish;
    }
}