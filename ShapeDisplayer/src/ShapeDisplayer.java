/**
* Fall 2024 CS 151 Assignment #4
* @author Joyce Liu
* @version 1.0 11/15/24 
* */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * The main application that layouts all the components
 */
public class ShapeDisplayer {
	 private static JButton selectedButton = null;
	 
	 /**
	  * Creates a frame with buttons and that change the selected shape
	  * @param args - for command line arguments (not used)
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Shape Displayer");
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		
		
		JButton buttonS = new JButton();
		ShapeIcon snowman = new ShapeIcon(new SnowMan(25,10,25));
		buttonS.setIcon(snowman);
		buttonS.setPreferredSize(new Dimension(75,75));
		buttonS.setBackground(Color.WHITE);
		
		JButton buttonC = new JButton();
		ShapeIcon car = new ShapeIcon(new CarShape(10,20,60));
		buttonC.setIcon(car);
		buttonC.setPreferredSize(new Dimension(75,75));
		buttonC.setBackground(Color.WHITE);
		
		
		JButton buttonF = new JButton();
		ShapeIcon face = new ShapeIcon(new SmileyFace(10,10,50));
		buttonF.setIcon(face);
		buttonF.setPreferredSize(new Dimension(75,75));
		buttonF.setBackground(Color.WHITE);
		
		
		JPanel buttonBar = new JPanel();
		buttonBar.add(buttonS);
		buttonBar.add(buttonC);
		buttonBar.add(buttonF);
		frame.add(buttonBar);
		
		ShapePanel panel = new ShapePanel();
		frame.add(panel);
		
		
		
		buttonS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
//				System.out.println("snowing");
				panel.setSelectedShape("snowman");
				updateButtonSelection(buttonS);
				
			}
		});
		
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
//				System.out.println("vroooom");
				panel.setSelectedShape("car");	
				updateButtonSelection(buttonC);
			}
		});
		
		buttonF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
//				System.out.println("bruhh");
				panel.setSelectedShape("face");	
				updateButtonSelection(buttonF);
			}
		});
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		

		
		
	}
	
    // Helper method to update the selected button's border
    private static void updateButtonSelection(JButton button) {
        if (selectedButton != null) {
            // Reset the border of the previously selected button
            selectedButton.setBorder(BorderFactory.createEmptyBorder());
        }

        // Set the new selected button's border
        selectedButton = button;
        selectedButton.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
    }

}
