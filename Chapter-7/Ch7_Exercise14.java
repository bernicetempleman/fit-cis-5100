//Programmer	: Bernice Templeman
//Date			: 10/06/2015
//Course		: CIS 5100
//Homework  	: 7
//Exercise		: 7.14
//Description   : Variable-Length Argument List
//              : Write an application that calculates 
//				: the product of  a series of integers
//				: that are passed to method product
//				: using a variable-length argument list
//				: test your method with several calls, 
//				: each with a different number of arguments

/*
 * Output
 * i1 = 1
i2 = 2
i3 = 3
i4 = 4
The product of i1 and i2 is: 2
The product of i1, i2 & i3 is: 6
The product of i1,i2,i3 & i4 is: 24

 */
 

public class Ch7_Exercise14 {
	
	// method product that accepts a variable-length argument list
	public static int product(int...numbers)
	{
		int total = 1;	//initialize total to 1
		
		//enhanced for statement
		for(int i : numbers)
			//calculate the product of a series of intergers
			total *= i;
		
		return total;
	}

	public static void main(String[] args) 
	{
		//declare and initialize the integers
		int i1 = 1;
		int i2 = 2;
		int i3 = 3;
		int i4 = 4;
		
		//display the integers
		System.out.printf("i1 = %d\ni2 = %d\ni3 = %d\ni4 = %d\n", i1,i2,i3,i4);
		
		//test product method with several calls each with a different number of arguments
		System.out.printf("The product of i1 and i2 is: %d\n", product(i1,i2));
		System.out.printf("The product of i1, i2 & i3 is: %d\n", product(i1,i2,i3));
		System.out.printf("The product of i1,i2,i3 & i4 is: %d\n", product(i1,i2,i3,i4));
	}
}
