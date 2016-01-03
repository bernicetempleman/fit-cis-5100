import java.security.SecureRandom;

//Programmer	: Bernice Templeman
//Date			: 11/25/2015
//Course		: CIS 5100
//Exam 			: Final
//Exercise		: 1.B
/*
 * B (5 points)	Write a program segment in Java that 
 * sets the value of “int Number1” randomly from the following set:   
 * {2, 4, 6, 20}.
 */
public class CIS5100_Final_1B {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		int Number1 = 2 * (1 + randomNumbers.nextInt(4));
		if (Number1 == 8)
			Number1 = 20;
		System.out.printf("%d ", Number1);
	}
}
