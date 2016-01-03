import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 11/25/2015
//Course		: CIS 5100
//Exam 			: Final
//Exercise		: 3.B
/*
 * Write a program that inputs five numbers, 
 * each of which is between 10 and 100, inclusive.  
 * As each number is read, 
 * display it only if it is not a duplicate of a number already read. 
 * 
 * Example Output:
 Enter integer value n between 10 and 100, inclusive: 10

10
Enter integer value n between 10 and 100, inclusive: 10

Enter integer value n between 10 and 100, inclusive: 11

11
Enter integer value n between 10 and 100, inclusive: 11

Enter integer value n between 10 and 100, inclusive: 12

12
 */

public class CIS5100_Final_3B {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[5];
	
		//input 5 numbers
		for (int i=0; i < 5; i++)
		{
			System.out.printf("\nEnter integer value n between 10 and 100, inclusive: ");
			int n = input.nextInt();
			
			//check if between 10 and 100 inclusive
			if (n >= 10 && n <= 100)
			{
				a[i] = n;
				if (i == 0)//print first number
				{
					System.out.printf("\n%d", n);
				}
				else //check if number has been already input
				{
					boolean flag = true;
					for(int j = 0; j < i; j++)
					{
						if(a[j]== n)
						{
							flag = false;
						}
					}
					if(flag)
						System.out.printf("\n%d", n);
				}
			}
			else // print invalid number
			{
				System.out.println("Invalid Number.");
				if(i >= 0)
				i--;
			}
		}//end for loop
	}
}
