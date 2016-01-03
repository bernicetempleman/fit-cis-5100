import java.util.Arrays;

//Programmer	: Bernice Templeman
//Date			: 10/15/2015
//Course		: CIS 5100
//Exam 			: Midterm
//Exercise		: 4.B
//Description   : Write a program that prints the following 
//				: array’s values in descending order:
//				:	  int a[]={1,5,3,7,9,0,2,6,4,8}; 
/*
 * Sample output
 9 8 7 6 5 4 3 2 1 0 
 */
public class CIS5100_MT_4B {

	public static void main(String[] args) {
		
		int a[]={1,5,3,7,9,0,2,6,4,8}; 
		
		//sort array
		Arrays.sort(a);
		
		//reverse array
		for(int i = 0; i < a.length / 2; i++)
		{
		    int temp = a[i];
		    a[i] = a[a.length - i - 1];
		    a[a.length - i - 1] = temp;
		}
		
		// print array
		for ( int parameter : a )
			System.out.printf("%d ", parameter);
		System.out.println("\n");
	}
}
