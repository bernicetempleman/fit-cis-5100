import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 10/26/2015
//Course		: CIS 5100
//Homework		: 10
//Exercise		: 18.9
//Description   : Recursive Power Method
//				: Write  power(base, exponent)
//				: return base to the exponent
//				: power(3,4) = 3*3*3*3
//				: exponent is an int >= 1
//				: recursion uses: base **exp = base * base**(exp-1)
//				: terminating condition occurs when exponent ==1
//				: because Base **1 = base
//				: enable the user to enter base and exponent

/* Example Output for power(3,4):
 81
 
 Example values during recursion for power(3,4)
 1.) a = 3, b = 4 returns 3 * power (3,4-1) = 3 * 27 = 81
 2.) a = 3, b = 3 returns 3 * power (3,3-1) = 3 * 9 = 27
 3.) a = 3, b = 2 returns 3 * power (3,2-1) = 3 * 3 = 9
 4.) a = 3, b = 1 returns 3
 
 */

public class CIS5100_Ch18_9 {

	//main method to enable user to enter the base and exponent
	public static void main(String[] args) 
	{
		// declare scanner for input
		Scanner input = new Scanner(System.in);
		
		//ask for the base
		System.out.print("Enter the base: "); 
		int base = input.nextInt();
		
		//ask for the exponent
		System.out.print("Enter the exponent: ");
		int exponent = input.nextInt();
		
		// display the result
		System.out.printf("%d", power(base,exponent));

	}// end main
	
	// recursive method power
	public static int power(int a, int b)
	{
		// test for base case
		if (b == 1) //base case
			return a;
		else // recursion step
			return a * power(a, b - 1);
	}// end method power

}// end class
