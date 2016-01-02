//Programmer	: Bernice Templeman
//Date			: 08/28/2015
//Course		: CIS 5100
//Homework  	: 3
//Exercise		: 3.13
//Description	: Employee Class: 
//            	: 3 instance variables: 
//				: 	firstName(string), 
//				:   lastName(string), 
//				:   monthlySalary(double) 
//				: Constructor initializes 3 variables
//				: if monthly salary is not positive, do not set its value
//				: Set & Get method for each variable

public class Employee {
	private String firstName; // instance variable
	private String lastName; //instance variable
	private double monthlySalary; // instance variable
	
	// Employee constructor that receives 3 parameters
	public Employee(String firstName, String lastName, double monthlySalary)
	{
		this.firstName = firstName; // assign firstName to instance variable name
		this.lastName = lastName; // assign lastNmae to instance var lastName
		
		// validate that the monthly salary is positive; 
		// if it's not, do not set it
		// instance variable balance keeps its default initial salary of 0.0
		if (monthlySalary > 0.0 ) //if balance is valid
			this.monthlySalary = monthlySalary; // assign it to instance variable monthlySalary
	}	
	
	// method that sets the monthly salary
	public void setMonthlySalary(double monthlySalary)
	{
		this.monthlySalary = monthlySalary;		
	}
	
	// method returns the monthly Salary
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	
	// method that sets the firstName
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;		
	}
	
	// method that returns the first name
	public String getFirstName()
	{
		return firstName; // give value of first name back to the caller
	} //end method getFirstName
	
	// method that sets the lastName
	public void setLastName(String lastName)
	{
		this.lastName = lastName;	
	}
	
	// method that returns the last name
	public String getLastName()
	{
		return lastName; // give value of last name back to the caller
	} //end method Last
}
