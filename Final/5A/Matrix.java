//Programmer	: Bernice Templeman
//Date			: 11/25/2015
//Course		: CIS 5100
//Exam 			: Final
//Exercise		: 5.A
/*
 * Construct the class of non-negative 3x3 Matrices containing non-negative double elements 
 * with the following functionalities: A=[3][3]
 * 1. Determinant method returns the double value of the matrix determinant:
   det(A)= a[1][1] *(a[2][2]*a[3][3]-a[2][3]*a[3]2])
         + a[1][2] *(a[2][3]*a[3][1]-a[2][1]*a[3][3])
         + a[1][3] *(a[2][1]*a[3][2]-a[2][2]*a[3][1])
         
   2. isNull method returns true if the matrix is a Null Matrix (all the elements are 0). 
      Otherwise, isNull method returns false.
     
   3. isUMatrix method returns true if the matrix is a U Matrix.(all elements are 1)
   Otherwise the return value is false.
   
   4. Multiplication results in a 3x3 matrix and 
   takes a constant of double type as the only input parameter.  
   The resulting matrix R is: R=d*A= d* each element
   
   5. Addition method returns a 3x3 sum of two matrices 
     (it takes the addend matrix as an input parameter). 
       The resulting matrix R is: R = A + B = add each element (r[1][1]= a[1][1]+b[1][1])
   
 5.B Given matrix X and matrix Y.  
 Write a program segment that instantiates matrix Z and sets its elements:
  Z=2*X+Y;
*/
public class Matrix {
	
	private double[][] a; 
	
	public Matrix() {
		a = new double [3][3];
	}

	public double Determinant()
	{
		return a[0][0] *(a[1][1]*a[2][2]-a[1][2]*a[2][1])+
		        a[0][1] *(a[1][2]*a[2][0]-a[1][0]*a[2][2])+ 
		        a[0][2] *(a[1][0]*a[2][1]-a[1][1]*a[2][0]);	
	}
	
	public boolean isNull()
	{
		for(int row = 0; row <a.length; row++)
		{
			for(int column = 0; column < a[row].length; column++)
			{
				if(a[row][column] != 0 )
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public void setUMatrix()
	{
		for(int row = 0; row <a.length; row++)
		{
			for(int column = 0; column < a[row].length; column++)
			{
				a[row][column] = 1;			
			}
		}
	}
	
	public boolean isUMatrix()
	{
		for(int row = 0; row <a.length; row++)
		{
			for(int column = 0; column < a[row].length; column++)
			{
				if(a[row][column] != 1 )
				{
					return false;
				}
			}
		}
		return true;
	}
	
	// sets value if >= 0
	public void setElement(int row, int column, double value)
	{
		if(value >= 0)
			a[row][column] = value;
		return;
	}
	
	public Matrix Multiplication(double multiplier)
	{
		Matrix r = new Matrix();
		
		// multiplier must be positive
		if (multiplier >= 0)
		{
			for(int row = 0; row <a.length; row++)
			{
				for(int column = 0; column < this.a[row].length; column++)
				{
					r.setElement( row, column, a[row][column] * multiplier);
				}
			}
		}
		return r;
	}
	
	public Matrix Addition(Matrix right)
	{
		Matrix left = this;
		Matrix r = new Matrix();
		
		for(int row = 0; row <a.length; row++)
		{
			for(int column = 0; column < this.a[row].length; column++)
			{
				r.setElement( row, column, left.a[row][column] + right.a[row][column] );
			}
		}
		return r;
	}
	
	public void printMatrix()
	{
		for(int row = 0; row <a.length; row++)
		{
			for(int column = 0; column < this.a[row].length; column++)
			{
				System.out.printf("%f ", a[row][column] );
			}
			System.out.println();			
		}
	}
}
