/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomwalkviewer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 *
 * @author Joker
 */
public class RandomWalkComponent extends JComponent{
    private final int steps;
    private ImPoint oldLoc;
    
    
    public RandomWalkComponent(int steps) {
        this.steps = steps;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        Drunkard drunkard = new Drunkard(new ImPoint(200,200), 10);
        for (int i = 0; i < steps; i++) {
            oldLoc = drunkard.getCurrentLoc();
            drunkard.takeStep();
            Line2D.Double walk = new Line2D.Double(oldLoc.getPoint2D(), 
                    drunkard.getCurrentLoc().getPoint2D());
            
            g2.draw(walk);
            }
        
    }
    
    public int getSteps() {
        return steps;
    }
    public void setSteps() {
        
    }
}
