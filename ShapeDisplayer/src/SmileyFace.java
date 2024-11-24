/**
* Fall 2024 CS 151 Assignment #4
* @author Joyce Liu
* @version 1.0 11/15/24 
* */

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


/**
 * A SmileyFace is a CompositeShape made of ellipses and a rectangle to form an emoji
 * like graphic
 */
public class SmileyFace implements CompositeShape{
	private int x;
	private int y;
	private int width;
	
	/**
	 * Constructs a SmileyFace of a certain width at an xy coordinate
	 * @param x - integer x coordinate
	 * @param y - integer y coordinate
	 * @param width - integer representing the width of the SmileyFace
	 */
	public SmileyFace(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}
	
	
	/**
	 * Draws a Graphics2D object to a surface
	 * @param g2 - the Graphics2D object to be drawn
	 */
	public void draw(Graphics2D g2) {
		
		Ellipse2D.Double face = new Ellipse2D.Double(x, y, width, width);
		Ellipse2D.Double leftEye = new Ellipse2D.Double(x + width/4, y + width/3,  width/5, width/5);
		Ellipse2D.Double rightEye = new Ellipse2D.Double(x + width * 3/4 - width/5, y + width/3,  width/5, width/5);
//		Arc2D.Double mouth = new Arc2D.Double(x+width/3, y+width * 2/3, x+width* 2/3,  y+width * 2/3, 40, 40, Arc2D.CHORD);
		Rectangle2D.Double mouth = new Rectangle2D.Double(x + width/4, y + width* 2/3, 25, 10);
		
		g2.draw(face);
		g2.draw(leftEye);
		g2.draw(rightEye);
		g2.draw(mouth);
	}



}
