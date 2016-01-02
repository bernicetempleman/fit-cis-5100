import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 08/28/2015
//Course		: CIS 5100
//Homework  	: 3
//Exercise		: 3.13
//Description	: write EmployeeTest 
//				: create 2 employee objects 
//				: display each yearly salary
//				: give each employee a 10% raise and display yearly salary
//				: Employee Class: 
//            	: 3 instance variables: 
//				: 	firstName(string), lastName(string), monthlySalary(double) 
//				: Constructor initializes 3 variables
//				: if monthly salary is not positive, do not set its value
//				: Set & Get method for each variable
//


public class EmployeeTest {

	public static void main(String[] args) {
		// create 2 employee objects 
		Employee employee1 = new Employee("Jane",  "Green", 10000.00);
		Employee employee2 = new Employee("John", "Blue", -7.53);
		
		//display initial yearly salary of each object
		System.out.printf("%s %s yearly salary: $%.2f%n",
				employee1.getFirstName(), 
				employee1.getLastName(),
				12 * employee1.getMonthlySalary());
		System.out.printf("%s %s yearly salary: $%.2f%n",
				employee2.getFirstName(), 
				employee2.getLastName(),
				12 * employee2.getMonthlySalary());
		
		// give 10% raise
		double raiseAmount = .10; // obtain user input
		System.out.printf("%nadding raise of %.2f to employee salary%n%n",
				raiseAmount);
		
		employee1.setMonthlySalary(employee1.getMonthlySalary()
				+employee1.getMonthlySalary()*raiseAmount);
		employee2.setMonthlySalary(employee2.getMonthlySalary()
				+employee2.getMonthlySalary()*raiseAmount);
		
		//display  yearly salary after raise of each object
		System.out.printf("%s %s yearly salary: $%.2f%n",
				employee1.getFirstName(), 
				employee1.getLastName(),
				12 * employee1.getMonthlySalary());
		System.out.printf("%s %s yearly salary: $%.2f%n",
				employee2.getFirstName(), 
				employee2.getLastName(),
				12 * employee2.getMonthlySalary());
	
	}//end main
}// end class

