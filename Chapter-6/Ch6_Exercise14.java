import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 09/29/2015
//Course		: CIS 5100
//Homework  	: 6
//Exercise		: 6.14
//Description   : write a method integerPower
//
public class Ch6_Exercise14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int choice = 0; // initialize choice to 0
		
		// loop to ask for base, exponent & calculate result
		while(choice != -1)
		{
			// prompt for base
			System.out.print("Enter the base (int): ");
			int base = input.nextInt();
		
			//prompt for exponent
			System.out.print("Enter the exponenet(positive non-zero int): ");
			int exponent = input.nextInt();
		
			// calculate the result iPower
			int iPower = integerPower(base, exponent);
		
			// display the result
			System.out.printf("The answer is: %d", iPower);
			
			// prompt user if they want to quit or continue
			System.out.print("\n\nEnter -1 to quit or 1 to continue: ");
			choice = input.nextInt();
		}	

	}
	
	// returns the result of the base to the power given base & power
	public static int integerPower(int base, int exponent)
	{
		int iPower=base;
		
		// loop to calculate the result
		for (int i=1 ; i< exponent; i++)
		{
			iPower *=base;
		}
				
		return iPower;
	}
	

}
