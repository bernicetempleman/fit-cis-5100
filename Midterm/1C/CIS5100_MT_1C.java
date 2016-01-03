import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 10/15/2015
//Course		: CIS 5100
//Exam 			: Midterm
//Exercise		: 1.C
//Description   : Write a program that decides whether integer number 
//				: input1 can be divided by integer number 
//				: input2 without remainder.   
//				: The program should output 
//				: 	“No Remainder” if there is no remainder and
//				: 	“Remainder is: ” if there is any.  
//				: In this latter case, the program
//				: should output the value of the remainder as well. 
/* Sample Output
 * 

Enter integer input1: 1
Enter integer input2: 1
No Remainder

Do you want to continue (enter 1 for yes, 2 for no): 1

Enter integer input1: 2
Enter integer input2: 3
Remainder is: 2

Do you want to continue (enter 1 for yes, 2 for no): 2

 */
public class CIS5100_Midterm {

	public static void main(String[] args) {
		
		int choice = 1; //initialize choice to 1 to get user input
		
		//create scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		//loop to get user input for input1 & input2
		while( choice == 1)
		{
			// ask for input1
			System.out.printf("\nEnter integer input1: ");
			int input1 = input.nextInt(); 
			
			//ask for input2
			System.out.printf("Enter integer input2: ");
			int input2 = input.nextInt(); 

			// check if input2 is 0 (can't divide by 0)
			if (input2 != 0)
				//check if there is no remainder
				if( input1 % input2 == 0)
					System.out.printf("No Remainder");
				else
					System.out.printf("Remainder is: %d",  input1 % input2 );
			else //print error message
				System.out.println("Error: input2 cannot be 0");
			
			//ask if the user wants to continue
			System.out.printf("\n\nDo you want to continue (enter 1 for yes, 2 for no): ");
			choice = input.nextInt(); 
		}
	}
}
