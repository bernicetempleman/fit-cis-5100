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
 * 
 * Example Output:
Circle1 intersects circle2: true
Circle3 intersects circle4: false
Circle1 intersects circle5: true
Circle6: (1, 0, 0)
 * 
 */
public class CircleTest7 {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(40,60,135);
		Circle circle2 = new Circle(30,56,180);
		Circle circle3 = new Circle(40,105,60);
		Circle circle4 = new Circle(30,180,56);
		Circle circle5 = new Circle(40,60,135);
		Circle circle6 = new Circle();
		
		System.out.printf("Circle1 intersects circle2: %b\n",circle1.Cross(circle2));
		System.out.printf("Circle3 intersects circle4: %b\n", circle3.Cross(circle4));
		System.out.printf("Circle1 intersects circle5: %b\n", circle1.Cross(circle5));
		
		System.out.printf("Circle6: (%d, %d, %d)", circle6.getRadius(), circle6.getX(), circle6.getY());
	}
}
