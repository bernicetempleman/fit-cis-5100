import java.util.Scanner;

// Programmer	: Bernice Templeman
// Date			: 08/28/2015
// Course		: CIS 5100
// Homework  	: 2
// Exercise		: 2.28
// Description	: Diameter, Circumference and Area of a Circle
//		Input from the user the radius of a circle as an integer
//		Print the diameter, circumference and area using floating point 3.14159
//		Use techniques in 2.7 or MaTH.PI in java.lang
//		Formulas:
//			diameter = 2r
//			circumference = 2*PI*r
//			area = PI * r*r
//		Do not store the results in a variable
//		specify as a value in the printf statement
//		circumference and area are floating poit , %f
//
public class Ch2_Exercise28 {

	//main method begins execution of java application
	public static void main(String[] args) {
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);	
		
		int radius; 	// radius of a circle
		
		System.out.println("Enter radius as an integer: "); //prompt
		radius = input.nextInt(); // read first number from the user
		
		//Display the Diameter, Circumference, & Area
		System.out.printf("Diameter is \t\t%d%n"
				+ "Circumference is \t%f%n"
				+ "Area is \t\t%f%n",  
				2*radius, 2*Math.PI*radius, Math.PI*radius*radius);

	}// end main

}// end class
