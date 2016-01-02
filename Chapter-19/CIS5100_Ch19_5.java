import java.security.SecureRandom;
import java.util.Arrays;

//Programmer	: Bernice Templeman
//Date			: 10/28/2015
//Course		: CIS 5100
//Homework		: 11
//Exercise		: 19.5
//Description   : Bubble Sort
//				: This is a simple yet inefficient sorting technique
//				: It has Nested Loops
//				: Worst case is O(n^2) because
//				: each individual loop runs in O(n) time 
//				: for each iteration of the outer loop, there are iterations of the inner loop
//				: in Big O nested loops mean that you multiple the number of comparisons, 
//				: so this is  O(n^2)
/*
 * Example Output:
Unsorted array:
[97, 19, 89, 26, 29, 87, 55, 41, 28, 89]

after pass  1: Sorted array:
[19, 89, 26, 29, 87, 55, 41, 28, 89, 97]

after pass  2: Sorted array:
[19, 26, 29, 87, 55, 41, 28, 89, 89, 97]

after pass  3: Sorted array:
[19, 26, 29, 55, 41, 28, 87, 89, 89, 97]

after pass  4: Sorted array:
[19, 26, 29, 41, 28, 55, 87, 89, 89, 97]

after pass  5: Sorted array:
[19, 26, 29, 28, 41, 55, 87, 89, 89, 97]

after pass  6: Sorted array:
[19, 26, 28, 29, 41, 55, 87, 89, 89, 97]

after pass  7: Sorted array:
[19, 26, 28, 29, 41, 55, 87, 89, 89, 97]

Sorted array:
[19, 26, 28, 29, 41, 55, 87, 89, 89, 97]
 */
public class CIS5100_Ch19_5 {

	public static void main(String[] args) 
	{
		//random number generator
		SecureRandom generator = new SecureRandom();
		
		int[] data = new int[10]; //create array
		
		for(int i = 0; i < data.length; i++) //populate array
			data[i] = 10 + generator.nextInt(90);
		
		//display unsorted array
		System.out.printf("Unsorted array:\n%s%n%n",
				Arrays.toString(data)); //display Array
		
		// sort array
		bubbleSort(data); // sort array
		
		//display sorted array
		System.out.printf("Sorted array:\n%s%n%n",
				Arrays.toString(data)); //display Array
	}//end main
	
	// sort array using bubbleSort 
	public static void bubbleSort(int[] data)
	{
		boolean swap = true; 	//flag 
		int pass = 0;			//keep track of pass to printPass
		
		// continue while a swap has occurred
		while (swap)
		{
			swap = false;		//set swap to false
			pass ++;			//increment pass
			
			//loop through array and compare 2 values in array
			for(int next = 1; next < data.length; next++)
			{
				//compare 2 values in array
				if(data[next]< data[next - 1]) //if decreasing order, swap them
				{
					//swap
					int temp = data[next];
					data[next]= data[next-1];
					data[next-1]= temp;
					
					swap = true;	//set swap flag to true
					
				}// end if
			}//end for	
			printPass(data, pass);
		}//end while
	}//end bubbleSort
	
	//print a pass of the algorithm
	public static void printPass(int[] data, int pass)
	{
		System.out.printf("after pass %2d: ", pass);
		
		//output elements
		System.out.printf("Sorted array:\n%s%n%n",
				Arrays.toString(data)); //display Array
	}
}// end class
