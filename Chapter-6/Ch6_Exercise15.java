import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 09/29/2015
//Course		: CIS 5100
//Homework  	: 6
//Exercise		: 6.15
//Description   : method double hypotenuse(double side1, double side2)
//
public class Ch6_Exercise15 {

	public static void main(String[] args) {
		
		// print table of  triangles from Ch6 exercise 15
		
		System.out.printf("\nTriangle\tSide 1\tSide 2\tHypotenuse ");
		
		System.out.printf("\n1\t\t3.0\t4.0\t%f", hypotenuse(3.0,4.0));
		
		System.out.printf("\n2\t\t5.0\t12.0\t%f", hypotenuse(5.0,12.0));
		
		System.out.printf("\n3\t\t8.0\t15.0\t%f", hypotenuse(8.0,15.0));
		
		// ask user if they want to see both results
		Scanner input = new Scanner(System.in);
		System.out.print("\n\nDo you wnat to see the results of both the hypotenuse method and Math,hypot? ");
		System.out.print("\nEnter 1 for yes or 2 for no: ");
		int choice = input.nextInt();
		
		if (choice == 1)
		{
			// display both results ftom hypotenuse method and Math.hypot
			System.out.printf("\nTriangle\tSide 1\tSide 2\tHypotenuse Method\tMath.hypot");
		
			System.out.printf("\n1\t\t3.0\t4.0\t%f\t\t%f", hypotenuse(3.0,4.0),Math.hypot(3.0,4.0));
		
			System.out.printf("\n2\t\t5.0\t12.0\t%f\t\t%f", hypotenuse(5.0,12.0),Math.hypot(5.0,12.0));
		
			System.out.printf("\n3\t\t8.0\t15.0\t%f\t\t%f", hypotenuse(8.0,15.0),Math.hypot(8.0,15.0));
		}
		
	}
	
	// returns the hypotenuse of right triangle given 2 sides
	public static double hypotenuse(double side1, double side2)
	{
		double h;
		
		//determine hypotenuse using Math.sqrt and Math.pow
		h = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		
		return h;
	}
}
