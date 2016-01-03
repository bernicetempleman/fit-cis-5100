//Programmer	: Bernice Templeman
//Date			: 10/15/2015
//Course		: CIS 5100
//Exam 			: Midterm
//Exercise		: 4.B
//Description   : A palindrome is a number or text phrase that 
//				: reads the same backwards as forwards.  
//				: For example, each of the following five-letter words 
//				: is a palindrome: abcba, ghihg, bbbbb.  
//				: Write a program containing a method 
//				: that determines whether a five-digit word 
//				: is a palindrome.
//    			: 	char ch[] = {'a', 'b', 'c', 'b', 'a'};  // it is a palindrome    
// 				: 	char ch2[] = {'a', 'b', 'c', 'd', 'e'}; // it is not a palindrome 
/*
 * Sample output
ch is a palindrome
ch2 is not a palindrome
 */
public class CIS5100_MT_4C {

	public static void main(String[] args) {
				
		char ch[] = {'a', 'b', 'c','b', 'a'};
		char ch2[] = {'a', 'b', 'c', 'd', 'e'};
		
		if(isPalindrome(ch))
			System.out.printf("ch is a palindrome\n");
		else
			System.out.printf("ch is not a palindrome\n");
		
		if(isPalindrome(ch2))
			System.out.printf("ch2 is a palindrome");
		else
			System.out.printf("ch2 is not a palindrome");
	}
	
	// method to check if a character array is a palindrome
	public static boolean isPalindrome(char [] a)
	{	
		// loop to compare 1st half with reversed 2nd half
		for(int i = 0; i < a.length / 2; i++)
		{
			// check letters are not the same
		    if (a[i] != a[a.length - i - 1])
		    	return false;
		}		
		return true;	
	}
}
