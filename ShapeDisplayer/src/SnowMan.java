/**
* Fall 2024 CS 151 Assignment #4
* @author Joyce Liu
* @version 1.0 11/15/24 
* */

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * A SnowMan is a CompositeShape made of two ellipses stacked on top of each other
 */
public class SnowMan implements CompositeShape{
	private int x;
	private int y;
	private int width;
	
	
	/**
	 * Constructs a SmileyFace of a certain width at an xy coordinate
	 * @param x - integer x coordinate
	 * @param y - integer y coordinate
	 * @param width - integer representing the width of the SnowMan
	 */
	public SnowMan(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
		
	}
	
	/**
	 * Draws a Graphics2D object to a surface
	 * @param g2 - the Graphics2D object to be drawn
	 */
	public void draw(Graphics2D g2) {
		
		Ellipse2D.Double top = new Ellipse2D.Double(x, y, width, width);
		Ellipse2D.Double bottom = new Ellipse2D.Double(x, y+width, width, width);
		
		g2.draw(top);
		g2.draw(bottom);
	}
	
	
	
	}

