//Programmer	: Bernice Templeman
//Date			: 10/15/2015
//Course		: CIS 5100
//Exam 			: Midterm
//Exercise		: 4.A
//Description   : An enhanced for statement loops through an array.  
//				: The syntax is
//				: 	for ( parameter : arrayName )  
//				:		statement
//				: How would you use a regular for statement 
//				: to replace an enhanced one?  
//				: 	for(int i= 0; i < arrayName.length; i++)
//				:		statement;
//		  		: Draw the activity diagram of the enhanced for. 
/*
 * Sample Output:
enhanced for loop:
1537902648

regular for loop:
1537902648
 */
public class CIS5100_MT_4A {
	
	public static void main(String[] args) {
	
		int arrayName[]={1,5,3,7,9,0,2,6,4,8}; 
		
		//enhanced for loop
		System.out.println("enhanced for loop:");
		for ( int parameter : arrayName )
			System.out.printf("%d", parameter);
		
		System.out.println("\n");
		
		// regular for loop
		System.out.println("regular for loop:");
		for(int i= 0; i < arrayName.length; i++)
			System.out.printf("%d", arrayName[i]);
	}
}
