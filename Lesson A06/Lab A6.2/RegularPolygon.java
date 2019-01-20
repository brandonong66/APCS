/**
 * class RegularPolygon - class to model any regular polygon
 * 
 * @author Brandon Ong
 * Period #3
 * 
 */

public class RegularPolygon {

	// Your code goes here
	private int myNumSides; // # of sides
	private double mySideLength; // length of a side
	private double myR; // raidus of circumscribed circle
	private double myr; // radius of inscribed circle
	// constructors
/**
 * default constructor
 */
	public RegularPolygon() {
		myNumSides = 3;
		calcr();
		calcR();
	}
/**
 * constructor
 * @param numSides number of sides of the polygon
 * @param sideLength length of sides
 */
	public RegularPolygon(int numSides, double sideLength) {
		myNumSides = numSides;
		mySideLength = sideLength;
		calcr();
		calcR();
	}
/**
 * calculates radius of inscribed circle
 */
	// private methods
	private void calcr() {
		myr = 0.5 * mySideLength * (1d / Math.tan(Math.PI /  myNumSides));
	}
/**
 * calculates radius of circumscribed circle
 */
	private void calcR() {
		myR = 0.5 * mySideLength * (1d / Math.sin(Math.PI /  myNumSides));
	}
/**
 * gets the vertex angle of polygon
 * @return vertex angle
 */
	// public methods
	public double vertexAngle() {
		return (((double) myNumSides - 2) / myNumSides) * 180;
	}
/**
 * gets the perimeter of polygon
 * @return perimeter of polygon
 */
	public double Perimeter() {
	return myNumSides * mySideLength;
	}
/**
 * gets the area of polygon
 * @return area of polygon
 */
	public double Area() {
		calcR();
		return 0.5 * myNumSides * Math.pow(myR, 2) * Math.sin((2 * Math.PI) / myNumSides);
	}
/**
 * gets the number of sides
 * @return number of sides
 */
	public int getNumside() {
		return myNumSides;
	}
/**
 * gets the side length of polygon
 * @return side length
 */
	public double getSideLength() {
		return mySideLength;
	}
/**
 * gets radius of circumscribed circle
 * @return radius of circumscribed circle
 */
	public double getR() {
		return myR;
	}
/**
 * gets radius of inscribed circle
 * @return radius of inscribed circle
 */
	public double getr() {
		return myr;
	}
}



