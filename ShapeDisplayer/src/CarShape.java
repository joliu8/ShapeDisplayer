/**
	@author - Chapter 4 of Object Oriented Design (Third Edition) by Cay S. Horstmann 
*/

import java.awt.*;
import java.awt.geom.*;

/** A Car made up of Graphics2D Shapes
 */
public class CarShape implements CompositeShape{
	
	private int x;
	private int y;
	private int width;
	private GeneralPath path;
	
	/** Constructs a car item
	 * @param x - the left of the bounding rectangle
	 * @param y - the top of the bounding rectangle
	 * @param width - the width of the bounding rectangle
	 */
	public CarShape(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.path = new GeneralPath();
	}
	
	/**
	 * Draws a Graphics2D object to a surface
	 * @param g2 - the Graphics2D object to be drawn
	 */
	public void draw(Graphics2D g2) {
		Rectangle2D.Double body = new Rectangle2D.Double(x, y+width/6, width-1, width/6);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(x+width/6, y+width/3, width/6, width/6);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(x+width * 2/3, y+width/3, width/6, width/6);
		
		//The bottom of the front windshield
		Point2D.Double r1 = new Point2D.Double(x+width/6, y+width/6);
		
		//The front of the roof
		Point2D.Double r2 = new Point2D.Double(x+width/3, y);
		
		//The rear of the roof
		Point2D.Double r3 = new Point2D.Double(x+width * 2/3, y);
		
		//The bottom of the rear windshield
		Point2D.Double r4 = new Point2D.Double(x+width * 5/6, y+width/6);
		
		Line2D.Double frontWindshield = new Line2D.Double(r1,r2);
		
		Line2D.Double roofTop = new Line2D.Double(r2,r3);
		
		Line2D.Double rearWindshield = new Line2D.Double(r3,r4);
		
		
		path.append(body, false);
		path.append(frontTire, false);
		path.append(rearTire, false);
		path.append(frontWindshield, false);
		path.append(roofTop, false);
		path.append(rearWindshield, false);
		g2.draw(path);
		
	}

	
}
