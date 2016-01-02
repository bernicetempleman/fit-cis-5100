import java.util.Scanner;

// Programmer	: Bernice Templeman
// Date			: 08/28/2015
// Course		: CIS 5100
// Homework  	: 2
// Exercise		: 2.16
// Description	: Comparing Integers
//		Use techniques shown in Fig 2.15
//		Write an application that asks the user to enter 2 integers
//		Obtains them from the user
//		Displays the larger followed by "is larger"
//		Equal Displays the message "These numbers are equal"

public class Ch2_Exercise16 {

	//main method begins execution of java application
	public static void main(String[] args) {
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
				
		int number1;		// first number to compare
		int number2;		// second number to compare
		
		System.out.println("Enter the first integer: "); //prompt
		number1 = input.nextInt(); // read first number from the user
		
		System.out.println("Enter the second integer: "); //prompt
		number2 = input.nextInt(); // read second number from the user
		
		if (number1 == number2) // compare the numbers if equal
			System.out.println("These numbers are equal");
		if (number1 > number2) // compare the numbers if number1 is larger
			System.out.printf("%d is larger", number1);
		if (number2 > number1) // compare the numbers if number2 is larger
			System.out.printf("%d is larger", number2);

	}// end main method
}// end class comparison
