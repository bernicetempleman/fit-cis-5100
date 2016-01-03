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
  
  Example Output:
  Matrix A: 
0.000000 0.000000 0.000000 
0.000000 0.000000 0.000000 
0.000000 0.000000 0.000000 
Matrix A IsNull true
Matrix A IsU false
Matrix A Determinant 0.000000

Updated Matrix A: 
0.000000 0.000000 0.000000 
0.000000 5.000000 0.000000 
0.000000 0.000000 0.000000 
Matrix A IsNull false
Matrix A IsU false
Matrix A Determinant 0.000000

Updated Matrix A: 
1.000000 1.000000 1.000000 
1.000000 1.000000 1.000000 
1.000000 1.000000 1.000000 
Matrix A IsNull false
Matrix A IsU true
Matrix A Determinant 0.000000

Updated Matrix A: 
1.000000 1.000000 1.000000 
1.000000 5.000000 1.000000 
1.000000 1.000000 5.000000 
Matrix A IsNull false
Matrix A IsU false
Matrix A Determinant 16.000000

Matrix X: 
0.000000 0.000000 0.000000 
0.000000 0.000000 0.000000 
0.000000 0.000000 0.000000 

Set Matrix X to 4 * A: 
4.000000 4.000000 4.000000 
4.000000 20.000000 4.000000 
4.000000 4.000000 20.000000 
Matrix X IsNull false
Matrix X IsU false
Matrix X Determinant 1024.000000

Set Matrix Y to A + X: 
5.000000 5.000000 5.000000 
5.000000 25.000000 5.000000 
5.000000 5.000000 25.000000 
Matrix Y IsNull false
Matrix Y IsU false
Matrix Y Determinant 2000.000000

Set Matrix Z to 2*X + Y: 
13.000000 13.000000 13.000000 
13.000000 65.000000 13.000000 
13.000000 13.000000 65.000000 
Matrix Z IsNull false
Matrix Z IsU false
Matrix Z Determinant 35152.000000
  
*/
public class MatrixTest {

	public static void main(String[] args) {
		
		Matrix A = new Matrix();
		System.out.println("Matrix A: ");
		A.printMatrix();
		System.out.printf("Matrix A IsNull %b\n", A.isNull());
		System.out.printf("Matrix A IsU %b\n",A.isUMatrix());
		System.out.printf("Matrix A Determinant %f\n", A.Determinant());
		System.out.println();
		
		A.setElement(1, 1, 5.0);
		System.out.println("Updated Matrix A: ");
		A.printMatrix();
		System.out.printf("Matrix A IsNull %b\n", A.isNull());
		System.out.printf("Matrix A IsU %b\n",A.isUMatrix());
		System.out.printf("Matrix A Determinant %f\n", A.Determinant());
		System.out.println();
		
		A.setUMatrix();
		System.out.println("Updated Matrix A: ");
		A.printMatrix();
		System.out.printf("Matrix A IsNull %b\n", A.isNull());
		System.out.printf("Matrix A IsU %b\n",A.isUMatrix());
		System.out.printf("Matrix A Determinant %f\n", A.Determinant());
		System.out.println();
		
		A.setElement(1, 1, 5.0);
		A.setElement(2, 2, 5.0);
		System.out.println("Updated Matrix A: ");
		A.printMatrix();
		System.out.printf("Matrix A IsNull %b\n", A.isNull());
		System.out.printf("Matrix A IsU %b\n",A.isUMatrix());
		System.out.printf("Matrix A Determinant %f\n", A.Determinant());
		System.out.println();
		
		Matrix X = new Matrix();
		System.out.println("Matrix X: ");
		X.printMatrix();
		System.out.println();
		System.out.println("Set Matrix X to 4 * A: ");
		X = A.Multiplication(4.0);		
		X.printMatrix();
		System.out.printf("Matrix X IsNull %b\n", X.isNull());
		System.out.printf("Matrix X IsU %b\n",X.isUMatrix());
		System.out.printf("Matrix X Determinant %f\n", X.Determinant());
		System.out.println();
		
				
		Matrix Y = new Matrix();
		
		System.out.println("Set Matrix Y to A + X: ");
		Y = A.Addition(X);	
		Y.printMatrix();	
		System.out.printf("Matrix Y IsNull %b\n", Y.isNull());
		System.out.printf("Matrix Y IsU %b\n",Y.isUMatrix());
		System.out.printf("Matrix Y Determinant %f\n", Y.Determinant());
		System.out.println();
		
		/* 5.B Given matrix X and matrix Y.  
 			Write a program segment that instantiates matrix Z and sets its elements:
  			Z=2*X+Y;
		 */
	
		Matrix Z = new Matrix();
		System.out.println("Set Matrix Z to 2*X + Y: ");
		Z = Y.Addition(X.Multiplication(2));
		Z.printMatrix();
		System.out.printf("Matrix Z IsNull %b\n", Z.isNull());
		System.out.printf("Matrix Z IsU %b\n",Z.isUMatrix());
		System.out.printf("Matrix Z Determinant %f\n", Z.Determinant());
	}
}
