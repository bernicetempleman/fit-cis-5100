//Programmer	: Bernice Templeman
//Date			: 09/13/2015
//Course		: CIS 5100
//Homework  	: 4
//Exercise		: 4.18
//Description	: Customer Class
// For each customer the following facts are available:
// 		account number
//		balance at the beginning of the month
// 		total of all items charged this month
//		total of all credits this month
// 		allowed credit limit
//
// constructor: input all these as integers
// currentBalance: 
// calculate new balance (= beg balance + charges - credits)
// display the new balance
// determine if new balance exceeds credit limit
// if exceeded display message "Credit limit exceeded"

public class Customer
{
	private int accountNumber; 		//instance variable	
	private	int beginningBalance;	//instance variable
	private	int charges;			//instance variable
	private	int credits;			//instance variable
	private	int creditLimit;		//instance variable
			
// Customer constructor that receives 5 parameters
public Customer(int accountNumber, int beginningBalance, 
				int charges, int credits, int creditLimit)
	{
		this.accountNumber = accountNumber; // assign accountNumber to instance variable accountNumber
		this.beginningBalance = beginningBalance; // assign beginningBalance to instance variable beginningBalance
		this.charges = charges; // assign charges to instance variable charges
		this.credits = credits; // assign credits to instance variable credits
		this.creditLimit = creditLimit; // assign creditLimit to instance variable creditLimit
	}

// calculate current balance 
// display current balance
// display message if current balance exceeded limit
public int getCurrentBalance()
{
	// calculate current balance
	return (beginningBalance + charges - credits);
	
}	
	
public boolean creditLimitExceeded()	
{	
	// display message if current balance exceeded limit
	if ( getCurrentBalance() > creditLimit)
	{
		return true;
	}
	else
		return false;
}

// Getters & Setters
/**
 * @return the accountNumber
 */
public int getAccountNumber() {
	return accountNumber;
}

/**
 * @param accountNumber the accountNumber to set
 */
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

/**
 * @return the beginningBalance
 */
public int getBeginningBalance() {
	return beginningBalance;
}

/**
 * @param beginningBalance the beginningBalance to set
 */
public void setBeginningBalance(int beginningBalance) {
	this.beginningBalance = beginningBalance;
}

/**
 * @return the charges
 */
public int getCharges() {
	return charges;
}

/**
 * @param charges the charges to set
 */
public void setCharges(int charges) {
	this.charges = charges;
}

/**
 * @return the credits
 */
public int getCredits() {
	return credits;
}

/**
 * @param credits the credits to set
 */
public void setCredits(int credits) {
	this.credits = credits;
}

/**
 * @return the creditLimit
 */
public int getCreditLimit() {
	return creditLimit;
}

/**
 * @param creditLimit the creditLimit to set
 */
public void setCreditLimit(int creditLimit) {
	this.creditLimit = creditLimit;
}
		
}
