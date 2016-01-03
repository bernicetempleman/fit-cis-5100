//Programmer	: Bernice Templeman
//Date			: 11/25/2015
//Course		: CIS 5100
//Exam 			: Final
//Exercise		: 4.A
/*
 * A (10 points) Create a class of Circles 
 * with attribute radius that defaults to 1.  
 * (It must be positive for every circle.) 
 * Provide member methods that calculate the perimeter and the area of the circle. 
 * Also, provide set and get methods for the radius attribute.  
	(Hint: 
	perimeter = 2*radius*pi; and 
	area = radius*radius*pi
	pi is a constant, can be set to 3.14 here.)

 */
public class Circle {
	
	private int radius;
	
	public static final double PI = 3.14;
	
	public Circle() {
		this(1);
		
	}

	public Circle(int radius) {
		if(radius >0)
			this.radius = radius;
		else
			this.radius = 1;
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

}
