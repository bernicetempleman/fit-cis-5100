import java.math.BigInteger;

//Programmer	: Bernice Templeman
//Date			: 09/22/2015
//Course		: CIS 5100
//Homework  	: 5
//Exercise		: 5.13
//Description   : Factorials
//				: Calculate the factorials from 1 to 20
//				: use type long
//				: display in table
//				: what might prevent calculate 100!
//				:   answers for factorials over 20 are too large for data type long
//				: 	use variable type: BigInteger 
//				: 	large integers will also require more available memory
// 				: via http://stackoverflow.com/questions/11446973/find-factorial-of-large-numbers-in-java
public class Ch5_Exercise13 {

	public static void main(String[] args) {
		long factorial = 1;
		
		// print table headings
		System.out.println("N\tFactorial");
		
		// loop to calculate and print the factorials 1-20
		for (int i=1; i <=20; i++)
		{
			factorial = 1;
			
			// calculate the factorial
			for(int j=i; j > 1; j--)
			{
				factorial *= j;
			}
			
			// print the factorial
			System.out.printf("\n%d\t%d", i, factorial);
		}
		
/*		// BigInteger 
  		BigInteger factorial100 = BigInteger.valueOf( 1);
		for (int i=1; i <=100; i++)
		{
			factorial100 = BigInteger.valueOf( 1);
			
			for(int j=i; j > 1; j--)
			{
				factorial100 = factorial100.multiply(BigInteger.valueOf(j));
			}
			System.out.printf("\n%d\t%d", i, factorial100);
		}
*/		
	}

}
