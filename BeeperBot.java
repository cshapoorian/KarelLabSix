
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    //instance variable to store beeper count
    int[] beeperList = new int[13];
    int tempCount = 0;
    int x;
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAndCountBeepers() {
        for(int i = 0; i < 13; i++) {
            checkrow();
        }
    }
    
    public void checkrow() {
        if (nextToABeeper()) {
            turnLeft();
            while (nextToABeeper()) {
                pickBeeper();
                move();
                x++;
            }
            flip();
            for(int i = x; i > 0; i--) {
                move();
            }
            x = 0;
            turnRight();
            move();
        }
     
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void flip() {
        turnLeft();
        turnLeft();
    }
    
    public int[] getBeeperList() {
            //This will be used to print the beepers found.  No need to modify.
            return beeperList;
    }
   
}

