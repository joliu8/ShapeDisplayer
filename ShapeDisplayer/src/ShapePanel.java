/**
* Fall 2024 CS 151 Assignment #4
* @author Joyce Liu
* @version 1.0 11/15/24 
* */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * A ShapePanel is a JPanel that stores a list of CompositeShapes and the mousePoint 
 * of a user when they click
 */
public class ShapePanel extends JPanel {
	//list of shapes that have to be displayed
	private ArrayList<CompositeShape> shapes;
	//where the user clicked
	private Point mousePoint;
	//listener to listen for clicks
	public MouseListeners listeners;
	//string to keep track of which button icon is selected
	private String selectedShape;

	/**
	 * Constructs a ShapePanel with a list of all the CompositeShapes that
	 * should be displayed and a MouseListener
	 */
	public ShapePanel() {

		shapes = new ArrayList<CompositeShape>();
		listeners = new MouseListeners();
		addMouseListener(listeners);
		setPreferredSize(new Dimension(500,500));

	}
	
	/**
	 * Assigns the selected shape to be a particular shape
	 * @param shape - the newly selected shape
	 */
	public void setSelectedShape(String shape) {
		selectedShape = shape;
		
		
		
	}
	
	/**
	 * Adds a shape to the scene.
	 * @param s - the shape to add
	 */
	public void add(CompositeShape s) {
		shapes.add(s);
		repaint();
		}
	
    
	/**
	 * Paints the CompositeShapes made out of Graphics
	 * @param g - Graphics object to be drawn
	 */
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  
        Graphics2D g2 = (Graphics2D) g;
        for (CompositeShape s : shapes) {
            s.draw(g2);
        }
    }
	
	
	/**
	 * MouseListener class extends MouseAdapater and selectively overrides only the
	 * MousePressed method
	 * 
	 */
	protected class MouseListeners extends MouseAdapter {
		
		/**
		 * Grabs the coordinates of the spot where a user clicks and adds
		 * the selected shape to that spot
		 * 
		 * @param event - an user action where the user clicks their mouse
		 */
		public void mousePressed(MouseEvent event) {
			mousePoint = event.getPoint();
//			System.out.println(mousePoint.toString());
			
			if(selectedShape.equals("snowman")) {
				add(new SnowMan((int)mousePoint.getX(), (int)mousePoint.getY(), 25));
			}
			else if(selectedShape.equals("car")) {
				add(new CarShape((int)mousePoint.getX(), (int)mousePoint.getY(), 60));
			}
			else if(selectedShape.equals("face")) {
				add(new SmileyFace((int)mousePoint.getX(), (int)mousePoint.getY(), 50));
			}
			
			repaint();
		}


	}
}
