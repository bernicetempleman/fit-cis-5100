//Programmer	: Bernice Templeman
//Date			: 11/25/2015
//Course		: CIS 5100
//Exam 			: Final
//Exercise		: 7
/*
 * Create a class of Circle 
 * with attributes radius, X and Y 
 * that represent the Cartesian coordinates of the center point. 
 * Radius default value is 1, it must be positive for every circle. 
 * Provide a member method Cross that returns true if two circles cross each other.  
 * Otherwise it returns false.  
 * Cross has a Circle object input parameter.
 */
public class Circle {
	private int radius;
	private int X;
	private int Y;
	
	public static final double PI = 3.14;
	
	public Circle() {
		this(1,0,0);		
	}
	
	public Circle(int radius, int x, int y) {
		if(radius >0)
			this.radius = radius;
		else
			this.radius = 1;
		this.X = x;
		this.Y = y;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double perimeter() {
		return 2*radius*PI;
	}
	
	public double area() {
		return radius*radius*PI;
	}	

	public boolean Cross(Circle Second)
	{
		Circle First = this;
		
		int radiusSum = First.radius + Second.radius;
		int xDiff = First.X - Second.X;
		int yDiff = First.Y - Second.Y;
		double centerDistance = Math.sqrt(xDiff*xDiff + yDiff*yDiff );
		
		if (centerDistance <= radiusSum)
			return true;
		else
			return false;
	}
}
