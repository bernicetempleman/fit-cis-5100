import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 09/22/2015
//Course		: CIS 5100
//Homework  	: 5
//Exercise		: 5.11
//Description   : Find the smallest value
//				: The first value read specifies the number of integers

public class Ch5_Exercise11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// the first number specifies the number of integers
		System.out.printf("Enter the number of integers: ");
		int count = input.nextInt();  // count is the total number of integers
		
		if (count > 0)
		{
		
			// get the first integer and make it the smallest
			System.out.printf("Enter the interger: ");
			int smallest = input.nextInt();
		
			//loop to ask for rest of integers & find smallest
			for(int i=1; i < count; i++)
			{	
				//ask for integer
				System.out.printf("Enter the interger: ");
				int value = input.nextInt();
			
				// check if it is the smallest so far
				if ( value < smallest)
					smallest = value;
			}
			//Display the smallest
			System.out.printf("%nThe smallest is %d: ", smallest);
		}//end if valid number
		else
			// display error message
			System.out.printf("%nInvalid number of integers. ");
	}
}
