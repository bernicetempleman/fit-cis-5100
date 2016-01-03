//Programmer	: Bernice Templeman
//Date			: 10/15/2015
//Course		: CIS 5100
//Exam 			: Midterm
//Exercise		: 3.C
//Description   : Pythagorean Triples.  
// The set of three integer values for the lengths of the sides 
// of a right triangle is called a Pythagorean Triple.  
// These three sides must satisfy the relationship that 
// the sum of the squares of two of the sides is equal to 
// the square of the hypotenuse. 
// Specifically: a*a + b*b = c*c is true 
// if and only of the triangle is a right triangle.
// Write a method that gets 3 input integers and 
// checks whether those in any order represent a Pythagorean Triple.  
// The method returns ‘p’ if the numbers are of Pythagorean Triples and 
// returns ‘n’ otherwise.  
/*
 * Sample output:
triple(3,4,5): p
triple(4,3,5): p
triple(5,4,3): p
triple(3,5,4): p
triple(4,5,3): p
triple(5,3,4): p
triple(340,357,493): p
triple(3,4,6): n
 */

public class CIS5400_MT_3C {

	public static void main(String[] args) 
	{
		int side1;   
		int side2; 
		int side3;
		
		// test some triples
		System.out.printf("triple(3,4,5): %s\n", triple(3,4,5));
		System.out.printf("triple(4,3,5): %s\n", triple(4,3,5));
		System.out.printf("triple(5,4,3): %s\n", triple(5,4,3));
		System.out.printf("triple(3,5,4): %s\n", triple(3,5,4));
		System.out.printf("triple(4,5,3): %s\n", triple(4,5,3));
		System.out.printf("triple(5,3,4): %s\n", triple(5,3,4));
		System.out.printf("triple(340,357,493): %s\n", triple(340,357,493));
		System.out.printf("triple(3,4,6): %s\n", triple(3,4,6));
		
	}//end main
	
	//method to check if pathagorean triple
	public static char triple( int side1, int side2, int side3)
	{
		if((side1 * side1) + (side2 * side2) == (side3 * side3))
			return 'p';
		else if ((side1 * side1) + (side3 * side3) == (side2 * side2))
			return 'p';
		else if ((side2 * side2) + (side3 * side3) == (side1 * side1))
			return 'p';
		else
			return 'n';
	}

}  //end class

