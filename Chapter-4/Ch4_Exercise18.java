import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 09/13/2015
//Course		: CIS 5100
//Homework  	: 4
//Exercise		: 4.18
//Description	: Credit Limit Calculator
// 	Develop a Java application 
// 	that determines whether any of several department
// 	store customers has exceeded the credit limit on a charge account
// 	For each customer the following facts are available:
// 		account number
//		balance at the beginning of the month
// 		total of all items charged this month
//		total of all credits this month
// 		allowed credit limit
//
// 		input all these as integers
// 		calculate new balance (= beg balance + charges - credits)
// 		display the new balance
// 		determine if new balance exceeds credit limit
// 		if exceeded display message "Credit limit exceeded"
//
// I tested several ways.
// This is the pseudocode:
// 
// Set choice to 1
// prompt user on choice to test with 1) constructor 2) sentinel loop
// input the choice
//
// 	if choice is to test with constructor
//   	create 3 customer objects
//
//    	display the current balance for customer1
//    	if customer1 exceeded credit
//        	message exceeded limit

//    	display the current balance for customer2
//		if customer2 exceeded credit
//			message exceeded limit
//		
//    	display the current balance for customer1
//		if customer1 exceeded credit
// 			message exceeded limit

// 	else choice is to test with sentinel loop
// 		set account number to 0
//    	set beginning balance to 0
//    	set charges to 0
//    	set credits to 0
//    	set credit limit to 0
//		set balance to 0
//  
//    	prompt user to enter the first account number
//    	input the first account number
//
//		While the user has not entered the sentinel
//    		prompt user for beginning balance
//    		input beginning balance
//    		prompt user for charges
//    		input charges
//    		prompt user for credits
//    		input credits
//    		prompt user for credit limit
//    		input credit limit
//    		calculate the current balance
//    		display the current balance
//    		if current balance is over the credit limit
//       		display message over credit limit
//    		prompt user for next account number
//    		input account number
//  
public class Ch4_Exercise18 {

	public static void main(String[] args) {
		
		// create Scanner to obtain input from command line
		Scanner input = new Scanner (System.in);
		
		int choice = 1;
		
		System.out.print("\nEnter 1 to test constructor or \nEnter 2 to test loop: ");
		choice = input.nextInt();
		
		if(choice == 1)
		{
			//test with constructors
			// create 3 customer objects
			Customer customer1 = new Customer(12345,100,200,50,300);
			Customer customer2 = new Customer(12347,200,200,50,300);
			Customer customer3= new Customer(12348, 0, 0,0,0);	
		
			// calculate current balance for each customer
			//display message if over limit
			System.out.printf("\nCustomer # %d Current Balance is: %d",
				customer1.getAccountNumber(),
		        customer1.getCurrentBalance());
			if (customer1.creditLimitExceeded())
				System.out.printf(" Credit limit exceeded");
		
			System.out.printf("\nCustomer # %d Current Balance is: %d",
				customer2.getAccountNumber(),
		        customer2.getCurrentBalance());
			if (customer2.creditLimitExceeded())
				System.out.printf(" Credit limit exceeded");
		
			System.out.printf("\nCustomer # %d Current Balance is: %d",
				customer3.getAccountNumber(),
		        customer3.getCurrentBalance());
			if (customer3.creditLimitExceeded())
				System.out.printf(" Credit limit exceeded");		
		}//end if choice = 1
		
		else //choice = 2
		{
	
			int accountNumber=0; 	// account number initialized to 0	
			int beginningBalance=0;	// beginning balance
			int charges=0;			// charges for the month
			int credits=0;			// credits for the month
			int creditLimit=0;		// credit limit
			int balance=0;			// balance
		
			//prompt for input from user
			System.out.print("\n\nEnter id or -1 to quit: ");
			accountNumber = input.nextInt();
			
			// while loop with Sentinel-controlled repitition
			while(accountNumber != -1)
			{
				// prompt for input from user
				System.out.print("Enter beginning balance: ");
				beginningBalance = input.nextInt();
			
				System.out.print("Enter charges: ");
				charges = input.nextInt();
			
				System.out.print("Enter credits: ");
				credits = input.nextInt();
			
				System.out.print("Enter credit limit: ");
				creditLimit = input.nextInt();
		
				// calculate current balance
				balance = beginningBalance + charges - credits;
			
				// display current balance
				System.out.printf("\nCustomer # %d Current Balance is: %d",accountNumber, balance);
			
				// display message if current balance exceeded limit
				if ( balance > creditLimit)
				{
					System.out.printf(" Credit limit exceeded");
				}//end if (balance >creditLimit
				
				//prompt for input from user
				System.out.print("\n\nEnter id or -1 to quit: ");
				accountNumber = input.nextInt();
				
			}// end while ( account number != -1)
		}// end else choice = 2		
	}//end main
}//end class
