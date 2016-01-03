import java.security.SecureRandom;

//Programmer	: Bernice Templeman
//Date			: 10/15/2015
//Course		: CIS 5100
//Exam 			: Midterm
//Exercise		: 3.A
//Description   : Write a piece of code in Java that sets the value of 
//				: “int Number”
//				: randomly from the following set:   
//				: {404, 405, 406, 407, 408}. 
/*
 * Sample output
 407
 */
public class CIS5100_MT_3A {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		int Number = 404 + randomNumbers.nextInt(5);
		
		System.out.printf("%d ", Number);		

	}
}
