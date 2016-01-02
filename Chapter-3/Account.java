//Programmer	: Bernice Templeman
//Date			: 08/28/2015
//Course		: CIS 5100
//Homework  	: 3
//Exercise		: 3.11
//Description	: Modify Account Class: Figure 3.8 & 3.9
//            	: provide withdraw method
//				: ensure withdrawal amount does not exceed Account balance
//				: else "withdrawal amount exceeded acct balance"
//				: Modify AccountTest to test method withdraw
//
// Fig. 3.8: Account.java
// Account class with 
// a double instance variable balance and 
// a constructor 
// deposit method that performs validation

public class Account {
	private String name; // instance variable
	private double balance; // instance variable
	
	// Account constructor that receives two parameters
	public Account(String name, double balance)
	{
		this.name = name; // assign name to instance variable name
		
		// validate that the balance is greater than 0.0; if it's not,
		// instance variable balance keeps its default initial balance of 0.0
		if (balance > 0.0 ) //if balance is valid
			this.balance = balance; // assign it to instance variable balance
	}
	
	// method that deposits (adds) only a valid amount to the balance
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0) //if the depositAmount is valid
			balance = balance + depositAmount; // add it to the balance
	}
	
	// method that withdraws (subtracts) only a valid amount
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount > balance)
			System.out.print("Withdrawal amount exceeded account balance.");
		else
			balance = balance - withdrawAmount; //subtracts it from balance
				
	}
	
	// method returns the account balance
	public double getBalance()
	{
		return balance;
	}
	
	// method that sets the name
	public void setName(String name)
	{
		this.name = name;	
	}
	
	// method that returns the name
	public String getName()
	{
		return name; // give value of name back to the caller
	} //end method getName
	
	} // end class Account

