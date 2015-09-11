/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomwalkviewer;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Joker
 */
public class RandomWalkViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("RandomWalk");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        System.out.print("Enter number of steps: ");
        int steps = in.nextInt();
        while (steps < 1) {
            System.out.println("ERROR: Number entered must be greater than 0.");
            System.out.print("Enter number of steps: ");
            steps = in.nextInt();
        } 
        RandomWalkComponent component = new RandomWalkComponent(steps);
        
        frame.add(component);
        
        frame.setVisible(true);
    }
    
}
