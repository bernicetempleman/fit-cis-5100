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
	
	Example output:
	
circle1 Radius is: 1
circle1 Perimeter is: 6.28
circle1 Area is: 3.14

circle2 Radius is: 2
circle2 Perimeter is: 12.56
circle2 Area is: 12.56

circle3 Radius is: 1
circle3 Perimeter is: 6.28
circle3 Area is: 3.14

 */
public class CircleTest {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(2);
		Circle circle3 = new Circle(0);
		
		System.out.printf("circle1 Radius is: %d\n",circle1.getRadius());
		System.out.printf("circle1 Perimeter is: %.2f\n",circle1.perimeter());
		System.out.printf("circle1 Area is: %.2f\n\n",circle1.area());
		
		System.out.printf("circle2 Radius is: %d\n",circle2.getRadius());
		System.out.printf("circle2 Perimeter is: %.2f\n",circle2.perimeter());
		System.out.printf("circle2 Area is: %.2f\n\n",circle2.area());
		
		System.out.printf("circle3 Radius is: %d\n",circle3.getRadius());
		System.out.printf("circle3 Perimeter is: %.2f\n",circle3.perimeter());
		System.out.printf("circle3 Area is: %.2f",circle3.area());
	}
}
