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

/**
   Drunkard class
       Represents a "drunkard" doing a random walk on a grid.
*/
public class Drunkard {
    /**
       Creates drunkard with given starting location and distance
       to move in a single step.
       @param startLoc starting location of drunkard
       @param theStepSize size of one step in the random walk
    */
    
    private ImPoint startLoc;
    private int theStepSize;
    
    private ImPoint currentLoc;
    
    Random random = new Random();
    
    public Drunkard(ImPoint startLoc, int theStepSize) {
        this.startLoc = startLoc;
        this.theStepSize = theStepSize;
        currentLoc = startLoc;
    }
    

    /**
       Takes a step of length step-size (see constructor) in one of
       the four compass directions.  Changes the current location of the
       drunkard.
    */
    public void takeStep() {
        int step = random.nextInt(40);
        if (step >=0 && step <10) {
            currentLoc = currentLoc.translate(0, theStepSize);
        } else if (step >= 10 && step < 20) {
            currentLoc = currentLoc.translate(0, -theStepSize);
        } else if (step >= 20 && step < 30) {
            currentLoc = currentLoc.translate(theStepSize, 0);
        } else if (step >= 30 && step < 40){
            currentLoc = currentLoc.translate(-theStepSize, 0);
        }
    }


    /**
       gets the current location of the drunkard.
       @return an ImPoint object representing drunkard's current location
    */
    public ImPoint getCurrentLoc() {
	return currentLoc;  // REMOVE this line -- dummy code to get it to compile
    }
}
