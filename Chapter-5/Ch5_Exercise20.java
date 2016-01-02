import java.math.BigDecimal;
import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 09/22/2015
//Course		: CIS 5100
//Homework  	: 5
//Exercise		: 5.20
//Description   : Pi
// 				: Pi = 4-4/3+4/5-4/7+4/9-4/11+...
// 				: print a table first 200000 terms of series
// 				: how many terms do you have to use before 3.14159?

public class Ch5_Exercise20 {

	public static void main(String[] args) {
		
		int i = 1;			// initialize counter to 1
		double pi = 4.0/i; 	// initialize pi to first value
		int terms = 0;		// initialize number of terms to 0
		int max;			// max number of terms
		
		Scanner input = new Scanner(System.in);
		
		// display menu
		System.out.println("  PI MENU  ");
		System.out.println("\n1. Pi Table with  first 200000 terms ");
		System.out.println("2. Pi Table with  first 10 terms    ");
		System.out.println("3. Pi Table with first 136122 terms");
		System.out.println("Enter 1, 2 or 3: ");
		
		// get choice
		int choice = input.nextInt();
		
		// set max
		if (choice == 1)
			max = 200000;
		else if ( choice == 2)
			max = 10;
		else 
			max = 136122;
		
		// print headings
		System.out.println("N\tPi\t\tPi( 16 digits)");
				
		// print first 
		System.out.printf("\n%d\t%f\t%.16f", i-1, pi,pi);
		
		// loop to calculate and print  2 through max
		for(i=2; i <= max; i++)
		{
			// if even
			if(i % 2 == 0)
			{
				pi = pi-(4.0/(i+i-1));
				System.out.printf("\n%d\t%f\t%.16f", i-1, pi, pi);
			}
			else //odd
			{
				pi = pi +(4.0/(i+i-1.0));
				System.out.printf("\n%d\t%f\t%.16f", i-1, pi, pi);
			}
			
			// check if term found
			if (terms == 0)
			{				
				if(pi >3.1415900000000000 && pi < 3.14159999999999999 )
					terms = i-1;
			}
		}
		
		// display term or message
		if (choice != 2)
		{	
			if (terms > 0)
				System.out.printf("\n\nFirst term in table with a value beginning with 3.14159: %d", terms);
			else
				System.out.printf("\n\n No value found");
		}
		else
			System.out.printf("\n\nSelect option 1 or 3 to see first value beginning with 3.14159.");
	}
}
