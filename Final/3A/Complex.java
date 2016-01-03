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
 */

public class Complex 
{
	private double realPart;
	private double imaginaryPart;
	
	public Complex()
	{
		this(0.0,0.0);
	}
	
	public Complex(double realPart, double imaginaryPart)
	{
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	// Add two Complex numbers
	public Complex Add( Complex Right )
	{
		Complex Left = this;
		double real = Left.realPart + Right.realPart;
		double imaginary = Left.imaginaryPart + Right.imaginaryPart;
		return new Complex(real, imaginary);
	}
	
	//subtract two Complex Numbers
	public Complex Subtract( Complex Right )
	{
		Complex Left = this;
		double real = Left.realPart - Right.realPart;
		double imaginary = Left.imaginaryPart - Right.imaginaryPart;
		return new Complex(real, imaginary);
	}
	
	//print complex numbers in form (a, b)
	public void Print()
	{
		System.out.printf("(%f, %f)", realPart, imaginaryPart);
	}
}
