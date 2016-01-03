//Programmer	: Bernice Templeman
//Date			: 11/25/2015
//Course		: CIS 5100
//Exam 			: Final
//Exercise		: 1.C
/*
 * C (5 points)	Write a method Power(base, exponent) 
 * that returns the value of base **exponent;
 * ( Assume that base is a positive, non-zero double and exponent is a double. )
 * 
 * Example Output:
 * 1.000000 4.000000 8.000000 
 */
public class CIS5100_Final_1C {

	public static void main(String[] args) {
		
		System.out.printf("%f %f %f ", Power(1.0,1.0), Power(2.0,2.0), Power(2.0,3.0));
	}

// method Write a method Power(base, exponent) that returns the value of base^exponent;
static	double Power(double base, double exponent)
	{
		double power = 1;
		
		for(int i = 0; i < exponent; i++)
			power *= base;
		return power;
	}
}
