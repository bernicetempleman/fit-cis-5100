import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 10/10/2015
//Course		: CIS 5100
//Homework  	: 
//Exercise		: 8.4
//Description   : Test Class Rectangle

/* Sample Output:
 * 
Rectangle 1: 
The length is : 1.000000
The width is : 1.000000
The perimeter is : 4.000000
The area is : 1.000000

Rectangle 2: 
The length is : 2.000000
The width is : 1.000000
The perimeter is : 6.000000
The area is : 2.000000

Rectangle 3: 
The length is : 2.000000
The width is : 2.000000
The perimeter is : 8.000000
The area is : 4.000000

Enter the length: .001

Enter the width: .001


Rectangle 4: 
The length is : 0.001000
The width is : 0.001000
The perimeter is : 0.004000
The area is : 0.000001

Do you want to test an invalid length (1 for yes, 2 for no): 2


Do you want to test an invalid width(1 for yes, 2 for no): 1
testing: Rectangle r6 = new Rectangle(2,0); 
Exception in thread "main" java.lang.IllegalArgumentException: Width must be greater than 0.0 and less than 20.0
	at Rectangle.<init>(Rectangle.java:36)
	at RectangleTest.main(RectangleTest.java:91)

 */

public class RectangleTest {

	public static void main(String[] args) {
		
		double length;
		double width;
		
		// test no-arg
		Rectangle r1 = new Rectangle();
		
		System.out.printf("\n\nRectangle 1: ");
		System.out.printf("\nThe length is : %f", r1.getLength());
		System.out.printf("\nThe width is : %f", r1.getWidth());
		System.out.printf("\nThe perimeter is : %f", r1.perimeter());
		System.out.printf("\nThe area is : %f", r1.area());
		
		
		// test 1 arg
		Rectangle r2 = new Rectangle(2);
		
		System.out.printf("\n\nRectangle 2: ");
		System.out.printf("\nThe length is : %f", r2.getLength());
		System.out.printf("\nThe width is : %f", r2.getWidth());
		System.out.printf("\nThe perimeter is : %f", r2.perimeter());
		System.out.printf("\nThe area is : %f", r2.area());
		
		
		// test 2 args
		Rectangle r3 = new Rectangle(2,2);
		
		System.out.printf("\n\nRectangle 3: ");
		System.out.printf("\nThe length is : %f", r3.getLength());
		System.out.printf("\nThe width is : %f", r3.getWidth());
		System.out.printf("\nThe perimeter is : %f", r3.perimeter());
		System.out.printf("\nThe area is : %f", r3.area());
		
		// test user input
		
		Scanner input = new Scanner(System.in);
		
		// ask user for the length
		System.out.printf("\n\nEnter the length: ");
		length = input.nextDouble(); 
		
		// ask user for the length
		System.out.printf("\nEnter the width: ");
		width = input.nextDouble();
		
		Rectangle r4 = new Rectangle(length,width);
		
		System.out.printf("\n\nRectangle 4: ");
		System.out.printf("\nThe length is : %f", r4.getLength());
		System.out.printf("\nThe width is : %f", r4.getWidth());
		System.out.printf("\nThe perimeter is : %f", r4.perimeter());
		System.out.printf("\nThe area is : %f", r4.area());

		//ask user if they want to test an invalid length:
		System.out.printf("\n\nDo you want to test an invalid length (1 for yes, 2 for no): ");
		int test = input.nextInt(); 
	
		if(test == 1)
		{
			// test invalid length
			System.out.printf("testing: Rectangle r5 = new Rectangle(0,2); \n");
			Rectangle r5 = new Rectangle(0,2);
		
			System.out.printf("\n\nRectangle 5: ");
			System.out.printf("\nThe length is : %f", r5.getLength());
			System.out.printf("\nThe width is : %f", r5.getWidth());
			System.out.printf("\nThe perimeter is : %f", r5.perimeter());
			System.out.printf("\nThe area is : %f", r5.area());
		}
		
		//ask user if they want to test an invalid length:
		System.out.printf("\n\nDo you want to test an invalid width(1 for yes, 2 for no): ");
		test = input.nextInt(); 
	
		if(test == 1)
		{
			// test invalid width
			System.out.printf("testing: Rectangle r6 = new Rectangle(2,0); \n");
			Rectangle r6 = new Rectangle(2,0);
		
			System.out.printf("\n\nRectangle 6: ");
			System.out.printf("\nThe length is : %f", r6.getLength());
			System.out.printf("\nThe width is : %f", r6.getWidth());
			System.out.printf("\nThe perimeter is : %f", r6.perimeter());
			System.out.printf("\nThe area is : %f", r6.area());
		}

	}

}
