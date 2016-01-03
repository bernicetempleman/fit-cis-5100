import java.security.SecureRandom;

//Programmer	: Bernice Templeman
//Date			: 11/25/2015
//Course		: CIS 5100
//Exam 			: Final
//Exercise		: 2.B
/*
 * Write a program that 
 * rolls a FOUR-sided die 10 times and 
 * stores results in int a[10].
 * 
 * Example Output:
 3 3 3 4 1 3 2 4 2 2 
 */
public class CIS5100_Final_2B {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();
		int[] a = new int[10];
		for(int i = 0; i < 10; i++)
		{
			a[i] = 1 + randomNumbers.nextInt(4);
		}
		for(int i = 0; i < 10; i++)
			System.out.printf("%d ", a[i]);
	}
}
