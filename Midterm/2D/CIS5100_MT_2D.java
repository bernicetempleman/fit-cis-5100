//Programmer	: Bernice Templeman
//Date			: 10/15/2015
//Course		: CIS 5100
//Exam 			: Midterm
//Exercise		: 2.D
//Description   : Write a FOR loop that sums even integers 
//				: from 4 through 54 AND
//				: prints out the FINAL result only. 
/*
 * Output:
 754
 */

public class CIS5100_MT_2D {

	public static void main(String[] args) {
		
		int sum = 0;
		
		// for loop to sum even int 4-54 and print result
		for(int i=4; i<=54; i+=2)
		{
			sum +=i;
			if(i == 54)
				System.out.printf("%d", sum);
		}
	}
}
