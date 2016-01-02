
//Programmer	: Bernice Templeman
//Date			: 08/28/2015
//Course		: CIS 5100
//Homework  	: 3
//Exercise		: 3.14
//Description	: Date Class: 
//            	: 3 instance variables: 
//				: 	month(int), day(int), year(int) 
//				: Constructor initializes 3 variables
//				: assume values are correct
//				: Set & Get method for each variable
//				: provide a method displayDate (separate with /)
//
//				: write DateTest 
//				: demonstrate class Date's capabilities

public class Date {
	
	private int month; // instance variable
	private int day; // instance variable
	private int year; // instance variable
	
	// Date constructor that receives 3 parameters
	public Date(int month, int day, int year)
	{
		this.month = month; // assign month to instance variable month
		this.day = day; // assign day to instance variable day
		this.year = year; // assign year to instance variable year
	}	
	
	// displays date separated with"/"
	public void displayDate()
	{
		System.out.printf("%d/%d/%d %n",
				getMonth(), 
				getDay(),
				getYear());
	}
	
	// method that sets the month
	public void setMonth(int month)
	{
		this.month = month;		
	}
	
	// method returns the month
	public int getMonth()
	{
		return month;
	}
	
	// method that sets the day
	public void setDay(int day)
	{
		this.day = day;		
	}
	
	// method that returns the day
	public int getDay()
	{
		return day; // give value of day back to the caller
	} //end method getDay
	
	// method that sets the year
	public void setLastName(int year)
	{
		this.year = year;		
	}
	
	// method that returns the year
	public int getYear()
	{
		return year; // give value of year back to the caller
	} //end method getYear

}//end class
