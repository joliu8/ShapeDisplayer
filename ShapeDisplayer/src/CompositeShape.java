/**
* Fall 2024 CS 151 Assignment #4
* @author Joyce Liu
* @version 1.0 11/15/24 
* */

import java.awt.Graphics2D;



/**
 * CompositeShape is an interface that defines a number of operations
 * that the shapes must carry out
 */
public interface CompositeShape{
	/**
	 * 	/**
	 * Draws a Graphics2D object to a surface
	 * @param g2 - the Graphics2D object to be drawn
	 */
	void draw(Graphics2D g2);

}
