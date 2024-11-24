/**
* Fall 2024 CS 151 Assignment #4
* @author Joyce Liu
* @version 1.0 11/15/24 
* */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;

/**
 * A ShapeIcon takes a CompositeShape and turns it into an Icon for the buttons
 */
public class ShapeIcon implements Icon {
	
	private int size;
	private CompositeShape shape;
	
	/**
	 * Constucts a ShapeIcon using a CompositeShape
	 * @param shape - the look of the icon using a CompositeShape
	 */
	public ShapeIcon(CompositeShape shape) {
		this.shape = shape;
		size = -1;
		
	}
	
	/**
	 * Paints the icon made of Graphic2D objects
	 * @param g - the object to be drawn
	 */
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g;
		
		shape.draw(g2d);
		
	}

	/**
	 * Returns the width of the icon
	 */
	@Override
	public int getIconWidth() {
		return size;
	}

	/**
	 * Returns the height of the icon
	 */
	@Override
	public int getIconHeight() {
		return size;
	}

}
