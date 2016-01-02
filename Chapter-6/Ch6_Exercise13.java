import java.security.SecureRandom;
import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 09/29/2015
//Course		: CIS 5100
//Homework  	: 6
//Exercise		: 6.13
//Description   : Write statements that will display a random number from the sets
//				: a.) 2,4,6,8,10
//				: b.) 3,5,7,9,11
//				: c.) 6,10,14,18,22
//
public class Ch6_Exercise13 {

	public static void main(String[] args) {
		
		// randomNumbers object will produce secure random numbers
		SecureRandom randomNumbers = new SecureRandom();
		
		Scanner input = new Scanner(System.in);
		
		//ask user for max
		System.out.print("\nEnter how many random numbers you want from each set: ");
		int max = input.nextInt();
		
		// a. 2,4,6,8,10
		// print header
		System.out.printf("\na. set (2,4,6,8,10):\n");
		
		// loop to get random numbers and display them
		for (int i = 1; i<max+1; i++)
		{
			// pick random number from set: 2,4,6,8,10
			int face = (1+ randomNumbers.nextInt(5))*2;
			
			System.out.printf("%d ", face);
		}
		System.out.printf("\n");
		
		// b. 3,5,7,9,11
		// print header
		System.out.printf("\nb. set (3,5,7,9,11): \n");
		
		//loop to get random numbers and display them
		for (int i = 1; i<max+1; i++)
		{
			// pick random numbers from the set: 3,5,7,9,11
			int face = (1+ randomNumbers.nextInt(5))*2+1;
			
			System.out.printf("%d ", face);
		}
		System.out.printf("\n");
		
		//c. 6,10,14,18,22
		// print header
		System.out.printf("\nc. set (6,10,14,18,22): \n");
		
		// loop to get random numbers and display them
		for (int i = 1; i<max+1; i++)
		{
			// pick random numbers from the set: 6,10,14,18,22
			int face = (1+ randomNumbers.nextInt(5))*4 + 2;
			
			System.out.printf("%d ", face);
		}
	}// end main
}// end class
