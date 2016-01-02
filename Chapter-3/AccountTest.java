import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 08/28/2015
//Course		: CIS 5100
//Homework  	: 3
//Exercise		: 3.11
//Description	: AccountTest: Figure 3.8 & 3.9
//				: Modify AccountTest to test method withdraw
//            	: Class Account: provide withdraw method
//				: ensure withdrawal amount does not exceed Account balance
//				: else "withdrawal amount exceeded account balance"

public class AccountTest {

	public static void main(String[] args) {
		
		//create 2 account objects
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		//display initial balance of each object
		System.out.printf("%s balance: $%.2f%n",
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",
				account2.getName(), account2.getBalance());
		
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		// deposit to account 1
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding %.2f to account1 balance%n%n",
				depositAmount);
		account1.deposit(depositAmount); // add to account1's balance
		
		// display balances
		System.out.printf("%n%s balance:  %.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",
				account2.getName(), account2.getBalance());
		
		// deposit to account 2
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n",
				depositAmount);
		account2.deposit(depositAmount);
		
		//display balances
		System.out.printf("%n%s balance:  %.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",
				account2.getName(), account2.getBalance());
		
		// test withdraw method
		// withdraw from account 1
		System.out.print("Enter withdraw amount for account1: ");
		double withdrawAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nsubtracting %.2f from account1 balance%n%n",
				withdrawAmount);
		account1.withdraw(withdrawAmount); // add to account1's balance
				
		// display balances
		System.out.printf("%n%s balance:  %.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",
				account2.getName(), account2.getBalance());
				
		// withdraw from account 2
		System.out.print("Enter withdraw amount for account2: ");
		withdrawAmount = input.nextDouble();
		System.out.printf("%nsubtracting %.2f from account2 balance%n%n",
				withdrawAmount);
		account2.withdraw(withdrawAmount);
				
		//display balances
		System.out.printf("%n%s balance:  %.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",
				account2.getName(), account2.getBalance());		
		
	}// end main

} //end class AccountTest
