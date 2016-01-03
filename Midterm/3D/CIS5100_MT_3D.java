//Programmer	: Bernice Templeman
//Date			: 10/15/2015
//Course		: CIS 5100
//Exam 			: Midterm
//Exercise		: 3.D
//Description   : Write a program that prints out primes 
//				: in a decreasing order 
//				: between 1 and 59.  
//				: (1 is considered to be a prime here.) 
/*
 * Sample Output
59
53
47
43
41
37
31
29
23
19
17
13
11
7
5
3
2
1

 */

public class CIS5100_MT_3D {

	public static void main(String[] args) {
		
		//loop to print prime numbers in decreasing order between 1-59
		for(int i = 59; i > 0; i--)
		{
			//check if number is prime
			if(isPrime(i))
				System.out.printf("%d\n", i);
		}
	}
	
	// method to check if number is prime (1 is prime)
	// primes are integers greater than one 
	//with no positive divisors besides one and itself.
	public static boolean isPrime(int number)
	{
		// negative numbers can not be prime
		if (number <1)
			return false;
		
		//1 & 2 ARE prime
		if ((number == 2)||(number == 1))
			return true;
		
		//numbers>2 that are divisible by 2  ARE NOT PRIME
		if (number % 2 == 0)
			return false;
		
		//check if number is divisible by other numbers
		else 
		{
			// find the square root of the number (round up) & cast to int
			int numberSqRt = (int) Math.ceil(Math.sqrt(number));
			
			// loop to check
			for( int i = 3; i <= numberSqRt; i+=2)
			{
				if (number % i == 0)
					return false;
			}
			return true;		
		}			
	}
}
