import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 11/25/2015
//Course		: CIS 5100
//Exam 			: Final
//Exercise		: 1.A
/*
 * 1.	A (5 points)	Write a Java program that:
		Asks for an integer value n;
		Then asks for n number(s) from the user;
		Finally displays the average of all the numbers typed in by the user.
Example Output:
Enter integer value n: 2

Enter number: 1

Enter number: 2
The Average of the numbers is: 1.50
 */
public class CIS5100_FINAL_1A {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("\nEnter integer value n: ");
		int n = input.nextInt(); 
		
		int total  = 0;
		double average = 0;
			
		for (int i = 0; i < n; i++)
		{
			System.out.printf("\nEnter number: ");
			int number = input.nextInt(); 
			total += number;
		}
		
		if( n > 0)
		{
			average = (double)total / n ;
			System.out.printf("The Average of the numbers is: %.2f" , average);
		}
		else
			System.out.println("n is not valid.");
	}
}
