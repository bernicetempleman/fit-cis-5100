//Programmer	: Bernice Templeman
//Date			: 10/06/2015
//Course		: CIS 5100
//Homework  	: 7
//Exercise		: 7.11
//Description   : Write statements that perform the following one-dimensional array ops
// a) set the 10 elements of integer array counts to zero
// b) add one to each of the 15 elements of integer array bonus
// c) display the five values of integer array bestScores in Column format
/*
 * 		// a) set the 10 elements of integer array counts to zero
		//this will initialize the array to 0;
		int[] counts = new int [10];
		
		System.out.println("A: ");
		System.out.println("Array after declaration and initialization");
		System.out.println("index: 0 1 2 3 4 5 6 7 8 9 ");
		System.out.printf("value:");
		for (int count : counts)
			System.out.printf(" %d", count);
		
		//this will set the array counts elements to 0
		for (int count=0; count< counts.length; count++)
			counts[count]= 0;
		
		System.out.println("\n\nArray after set to 0:");
		System.out.println("index: 0 1 2 3 4 5 6 7 8 9 ");
		System.out.printf("value:");
		for (int count : counts)
			System.out.printf(" %d", count);

A: Output:
Array after declaration and initialization
index: 0 1 2 3 4 5 6 7 8 9 
value: 0 0 0 0 0 0 0 0 0 0

Array after set to 0:
index: 0 1 2 3 4 5 6 7 8 9 
value: 0 0 0 0 0 0 0 0 0 0
					
					
		// b) add one to each of the 15 elements of integer array bonus
		int[] bonus = new int [15];	
		
		for (int count=0; count< bonus.length; count++)
			bonus[count]+=1;
		
		System.out.println("\n\nB: ");
		System.out.println("Array after one is added to each element:");
		System.out.println("index:  0  1  2  3  4  5  6  7  8  9 10 11 12 13 14");
		System.out.printf("value:");
		for (int count : bonus)
			System.out.printf(" %2d", count);
			
B Output:
B: 
Array after one is added to each element:
index:  0  1  2  3  4  5  6  7  8  9 10 11 12 13 14
value:  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1

			
		// c) display the five values of integer array bestScores in Column format
		int[] bestScores = new int [5];
		
		System.out.println("\n\nC: ");
		System.out.printf("\n%s%8s\n", "Index","Value");	
		
		for (int count=0; count< bestScores.length; count++)
			System.out.printf("%5d%8d%n", count, bestScores[count]);
	}
}

C: Output
Index   Value
    0       0
    1       0
    2       0
    3       0
    4       0
    
 */

public class Ch7_Exercise11 {

	public static void main(String[] args) {
/**********************************************************************/
		// a) set the 10 elements of integer array counts to zero
		//this will initialize the array to 0;
		int[] counts = new int [10];
		
		System.out.println("A: ");
		System.out.println("Array after declaration and initialization");
		System.out.println("index: 0 1 2 3 4 5 6 7 8 9 ");
		System.out.printf("value:");
		for (int count : counts)
			System.out.printf(" %d", count);
		
		//this will set the array counts elements to 0
		for (int count=0; count< counts.length; count++)
			counts[count]= 0;
		
		System.out.println("\n\nArray after set to 0:");
		System.out.println("index: 0 1 2 3 4 5 6 7 8 9 ");
		System.out.printf("value:");
		for (int count : counts)
			System.out.printf(" %d", count);
/**********************************************************************/		
		// b) add one to each of the 15 elements of integer array bonus
		int[] bonus = new int [15];	
		
		for (int count=0; count< bonus.length; count++)
			bonus[count]+=1;
		
		System.out.println("\n\nB: ");
		System.out.println("Array after one is added to each element:");
		System.out.println("index:  0  1  2  3  4  5  6  7  8  9 10 11 12 13 14");
		System.out.printf("value:");
		for (int count : bonus)
			System.out.printf(" %2d", count);
		
/**********************************************************************/		
		// c) display the five values of integer array bestScores in Column format
		int[] bestScores = new int [5];
		
		System.out.println("\n\nC: ");
		System.out.printf("\n%s%8s\n", "Index","Value");	
		
		for (int count=0; count< bestScores.length; count++)
			System.out.printf("%5d%8d%n", count, bestScores[count]);
	}
}
