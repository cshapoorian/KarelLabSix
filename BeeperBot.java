
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    //instance variable to store beeper count
    int[] beeperList = new int[9];
    int x;
    int y;
    int z;
    int a;
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void sortBeepers() {
        for (int index = 0; index < beeperList.length; index++) {
                    checkrow();
        }
        System.out.println("");
        for (int i = 0; i < beeperList.length; i++) {
            System.out.print(beeperList[i] + ", ");
        }
        reposition();
        System.out.println("");
        for (int i = 0; i < beeperList.length; i++) {
            System.out.print(beeperList[i] + ", ");
        }
        rearrange();
    }
    
    public void checkrow() {
        if (nextToABeeper()) {
            turnLeft();
            while (nextToABeeper()) {
                pickBeeper();
                beeperList[y] = beeperList[y] + 1;
                move();
                x++;
            }
            flip();
            for(int i = x; i > 0; i--) {
                move();
            }
            x = 0;
            turnLeft();
            move();
            a++;
        }
        y++;
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
        
    public void reposition() {
        flip();
        for (int i = a; i > 0; i--) {
            move();
        }
        flip();
        a = 0;
    }
    
    public void rearrange() {
        for (int i = 0; i < 10; i++) {
        if (beeperList [0] > beeperList [1]) {
            a = beeperList[0];
            beeperList[0] = beeperList [1];
            beeperList[1] = a;
        }
        if (beeperList [1] > beeperList [2]) {
            a = beeperList[1];
            beeperList[1] = beeperList [2];
            beeperList[2] = a;
        }
        if (beeperList [2] > beeperList [3]) {
            a = beeperList[2];
            beeperList[2] = beeperList [3];
            beeperList[3] = a;
        }
        if (beeperList [3] > beeperList [4]) {
            a = beeperList[3];
            beeperList[3] = beeperList [4];
            beeperList[4] = a;
        }
        if (beeperList [4] > beeperList [5]) {
            a = beeperList[4];
            beeperList[4] = beeperList [5];
            beeperList[5] = a;
        }
        if (beeperList [5] > beeperList [6]) {
            a = beeperList[5];
            beeperList[5] = beeperList [6];
            beeperList[6] = a;
        }
        if (beeperList [6] > beeperList [7]) {
            a = beeperList[6];
            beeperList[6] = beeperList [7];
            beeperList[7] = a;
        }
        if (beeperList [7] > beeperList [8]) {
            a = beeperList[7];
            beeperList[7] = beeperList [8];
            beeperList[8] = a;
        }
      }
    }
    
    public int[] getBeeperList() {
            //This will be used to print the beepers found.  No need to modify.
            return beeperList;
    }
   
}

