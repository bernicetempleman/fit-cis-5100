
//Programmer	: Bernice Templeman
//Date			: 08/28/2015
//Course		: CIS 5100
//Homework  	: 3
//Exercise		: 3.14
//Description	
//				: DateTest 
//				: demonstrate class Date's capabilities
//              : Date Class: 
//            	: 3 instance variables: 
//				: 	month(int), day(int), year(int) 
//				: Constructor initializes 3 variables
//				: assume values are correct
//				: Set & Get method for each variable
//				: provide a method displayDate 
//				: (separate with /)

public class DateTest {

	public static void main(String[] args) {
		
		// create 2 date objects
		Date date1 = new Date(9, 6,2015);
		Date date2 = new Date(10,10,2015);
		
		//display dates
		date1.displayDate();
		date2.displayDate();	
		
	}// end main
}// end class
