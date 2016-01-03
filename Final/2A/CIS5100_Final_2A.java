import java.util.Arrays;

//Programmer	: Bernice Templeman
//Date			: 11/25/2015
//Course		: CIS 5100
//Exam 			: Final
//Exercise		: 2.A
/*
  A (2 points)	A program sorts an array’s elements into descending order.  
 The array contains 7 elements.  
 How many steps would sorting take (at most)? 
 inefficient sort is O(n^2) = 49
 n(n-1) = 7* 6 =42
 
Example shows:
 outside loop passes = 7
 inside loop passes = 42
 
 after pass  1: Sorted array:
[5, 12, 13, 16, 17, 20, 1]

after pass  2: Sorted array:
[12, 13, 16, 17, 20, 5, 1]

after pass  3: Sorted array:
[13, 16, 17, 20, 12, 5, 1]

after pass  4: Sorted array:
[16, 17, 20, 13, 12, 5, 1]

after pass  5: Sorted array:
[17, 20, 16, 13, 12, 5, 1]

after pass  6: Sorted array:
[20, 17, 16, 13, 12, 5, 1]

after pass  7: Sorted array:
[20, 17, 16, 13, 12, 5, 1]

Inside passes = 42
Sorted array:
[20, 17, 16, 13, 12, 5, 1]
 */
public class CIS5100_Final_2A {

	public static void main(String[] args) {
		
		//create an array of 7 elements
		int [] data = {1,5,12,13,16, 17, 20 };
		
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
		int insidePass = 0;
		
		// continue while a swap has occurred
		while (swap)
		{
			swap = false;		//set swap to false
			pass ++;			//increment pass
			
			//loop through array and compare 2 values in array
			for(int next = 1; next < data.length; next++)
			{
				insidePass++;
				//compare 2 values in array
				if(data[next]> data[next - 1]) //if increasing order, swap them
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
		System.out.printf("Inside passes = %d\n",  insidePass);
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


