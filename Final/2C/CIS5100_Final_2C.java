//Programmer	: Bernice Templeman
//Date			: 11/25/2015
//Course		: CIS 5100
//Exam 			: Final
//Exercise		: 2.C
/*
 *  What does the following program print? 
 Result is : 57.
 *  Why? 
 57 is the sum of 4*5 + 4*4 + 4*3 + 4*2 + 1

 *  Explain with your own words.
   The array size is 5
   The first time whatIsThis is called
   the size is 5
   b[4] = 5
   4 * 5 = 20
   + it calls it self with size = 4
   b[3] = 4
   4 * 4 = 16
    +it calls itself with size of 3
   b[2] = 3
   4 * 3 = 12
   + it calls itself with size = 2
   b[1] =2
   4 * 2 = 8
   +it calls itself with size = 1
   b[0] = 1 //base case
20 + 16 + 12 + 8 + 1 = 57  
 */

public class CIS5100_Final_2C {

	public static void main(String[] args) {
	    final int arraySize =5;
		int a[] = { 1, 2, 3, 4, 5 };
	    int result = whatIsThis(a, arraySize);
		System.out.printf("Result is : %d.\n", result);
	}
	
	public static int whatIsThis(int b[], int size)
	{
		if ( size == 1 ) //base case
		{
			System.out.printf("%d \n",b[0]);
			return b[ 0 ];
		}
		else 
		{
			System.out.printf("%d \n", 4 * (b[ size - 1 ]));
			return 4 * (b[ size - 1 ] )	+ whatIsThis(b, size - 1 );
		}
	}

}
