import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 09/29/2015
//Course		: CIS 5100
//Homework  	: 6
//Exercise		: 6.18
//Description   : Display a square of asterisks
//
public class Ch6_Exercise18 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		// ask user for size of square
		System.out.printf("Enter square side size (int): ");
		int side = input.nextInt();
		
		if (side > 0)
			// print the square
			squareOfAstericks(side);
		else
			System.out.printf("\nSide must be larger than 0.\n");

	}
	
	public static void squareOfAstericks(int side)
	{
		// Nested loop to print the square
		for (int i = 0; i < side; i++)
		{
			for(int j = 0; j < side; j++)
				System.out.printf("*");
			System.out.printf("\n");
		}
	}

}
