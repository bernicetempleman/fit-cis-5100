//Programmer	: Bernice Templeman
//Date			: 11/25/2015
//Course		: CIS 5100
//Exam 			: Final
//Exercise		: 3.A
/*
 * (Complex Numbers) Create a class called Complex 
 * for performing arithmetic with complex numbers.  
 * Complex numbers have the form 
   realPart + imaginaryPart * i
   where i is square root of -1

Write a program to test your class.  
Use floating-point variables to represent the private data of the class.  
Provide a constructor that enables an object of this class to be initialized when it is declared.  
Provide a no-argument constructor with default values in case no initializers are provided.  
Provide public methods that perform the following operations:
//  a)	Add two Complex numbers: 
 *     the real parts are added together and 
 *     the imaginary parts are added together.
//	b)	Subtract two Complex numbers:
 *      the real part of the right operand is subtracted from the real part of the left operand, and
 *       the imaginary part of the right operand is subtracted from the imaginary part of the left operand.
//	c)	Print Complex numbers in the form (a, b), 
 * where a is the real part and 
 * b is the imaginary part.
 * 
 * Example Output:
result = (0.000000, 0.000000)
number1 = (5.000000, 4.000000)
number2 = (-2.000000, 2.000000)
number1 + number2 = (3.000000, 6.000000)
number1 - number2 = (7.000000, 2.000000)
 */
public class ComplexTest {

	public static void main(String[] args) {
		
		Complex number1 = new Complex(5,4);
		Complex number2 = new Complex(-2,2);
		Complex result = new Complex();
		
		System.out.printf("result = ");
		result.Print();
		System.out.println();
		
		System.out.printf("number1 = ");
		number1.Print();
		System.out.println();
		
		System.out.printf("number2 = ");
		number2.Print();
		System.out.println();
		
		System.out.printf("number1 + number2 = ");
		result = number1.Add(number2);
		result.Print();
		System.out.println();
		
		System.out.printf("number1 - number2 = ");
		result = number1.Subtract(number2);
		result.Print();
	}
}
