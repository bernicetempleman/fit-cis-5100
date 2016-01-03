import java.security.SecureRandom;
//Programmer	: Bernice Templeman
//Date			: 10/15/2015
//Course		: CIS 5100
//Exam 			: Midterm
//Exercise		: 3.B
//Description   : Write a piece of code in Java that sets the value of 
//				: “int Number”
//				: randomly from the following set:   
//				: {404, 405, 406, 407, 411}. 
/*
 * Sample Output
411
 */
public class CIS5100_MT_3B {

	public static void main(String[] args) 
	{
		SecureRandom randomNumbers = new SecureRandom();
		
		int Number = 404 + randomNumbers.nextInt(5);
		if (Number == 408)
			Number = 411;
		
		System.out.printf("%d ", Number);	
	}

}
