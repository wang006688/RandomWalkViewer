/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomwalkviewer;

import java.util.Random;

/**
 *
 * @author Joker
 */
public class DrunkardTester {
    public static void  main(String[] args) {
        
        DrunkardTester(new ImPoint(0,0), 1, new ImPoint(5,7));
        DrunkardTester(new ImPoint(100,100), 3, new ImPoint(56,78));
        DrunkardTester(new ImPoint(10,10), 2, new ImPoint(6,8));
        
    }
    
    private static void DrunkardTester(ImPoint ip, int stepS, ImPoint finalLoc) {
        Random random = new Random();
        Drunkard dk = new Drunkard(ip,1);
        System.out.println("Drunkard starts at" + ip + "; step size is " + stepS);
        System.out.println("get starting location [expected:(" + ip.getX() + 
                "," + ip.getY() + ")]: （" + dk.getCurrentLoc().getX() + 
                "," + dk.getCurrentLoc().getY() + ")");
        /**
        for (int i = 0; i < 5; i++) {
            dk.takeStep();
            System.out.println("Current location: " + dk.getCurrentLoc());
        }
        * */
        for(int i = 0; i < 4; i++) {
            if ((finalLoc.getX() - dk.getCurrentLoc().getX()) % stepS == 0 &&
                (finalLoc.getY() - dk.getCurrentLoc().getY()) % stepS == 0) {
            System.out.println("Took step to (" + finalLoc.getX() + "," + 
                finalLoc.getY() + ") SUCCEEDED");
            } else {
            System.out.println("Took step to (" + finalLoc.getX() + "," + 
                finalLoc.getY() + ") FAILED: Not a valid step!");
            }
            finalLoc = new ImPoint(random.nextInt(100),random.nextInt(100));
        }
    }
}
