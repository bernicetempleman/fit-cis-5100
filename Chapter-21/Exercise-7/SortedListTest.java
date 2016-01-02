import java.security.SecureRandom;
//Programmer	: Bernice Templeman
//Date			: 11/10/2015
//Course		: CIS 5100
//Homework		: 12
//Exercise		: 21.7
//Description   : Inserting into Ordered Lists
//				: SortedList: modify List<T> class figure 21.3 to maintain an ordered list
//				: Add 25 random numbers from 0 to 100 into sortedlinked list
//
/*
 * Sample Output
 * 
43 The list is: 43 
1 The list is: 1 43 
62 The list is: 1 43 62 
72 The list is: 1 43 62 72 
68 The list is: 1 43 62 68 72 
74 The list is: 1 43 62 68 72 74 
54 The list is: 1 43 54 62 68 72 74 
59 The list is: 1 43 54 59 62 68 72 74 
69 The list is: 1 43 54 59 62 68 69 72 74 
62 The list is: 1 43 54 59 62 62 68 69 72 74 
9 The list is: 1 9 43 54 59 62 62 68 69 72 74 
41 The list is: 1 9 41 43 54 59 62 62 68 69 72 74 
82 The list is: 1 9 41 43 54 59 62 62 68 69 72 74 82 
19 The list is: 1 9 19 41 43 54 59 62 62 68 69 72 74 82 
67 The list is: 1 9 19 41 43 54 59 62 62 67 68 69 72 74 82 
54 The list is: 1 9 19 41 43 54 54 59 62 62 67 68 69 72 74 82 
6 The list is: 1 6 9 19 41 43 54 54 59 62 62 67 68 69 72 74 82 
26 The list is: 1 6 9 19 26 41 43 54 54 59 62 62 67 68 69 72 74 82 
14 The list is: 1 6 9 14 19 26 41 43 54 54 59 62 62 67 68 69 72 74 82 
82 The list is: 1 6 9 14 19 26 41 43 54 54 59 62 62 67 68 69 72 74 82 
28 The list is: 1 6 9 14 19 26 28 41 43 54 54 59 62 62 67 68 69 72 74 82 
96 The list is: 1 6 9 14 19 26 28 41 43 54 54 59 62 62 67 68 69 72 74 82 96 
97 The list is: 1 6 9 14 19 26 28 41 43 54 54 59 62 62 67 68 69 72 74 82 96 97 
46 The list is: 1 6 9 14 19 26 28 41 43 46 54 54 59 62 62 67 68 69 72 74 82 96 97 
98 The list is: 1 6 9 14 19 26 28 41 43 46 54 54 59 62 62 67 68 69 72 74 82 96 97 98 

The list is: 1 6 9 14 19 26 28 41 43 46 54 54 59 62 62 67 68 69 72 74 82 96 97 98 

 */
public class SortedListTest {

	public static void main(String[] args) 
	{
		SortedList<Integer> list = new SortedList<>();
		
		SecureRandom randomNumbers = new SecureRandom();
		
		// add 25 random numbers from 0 to 100 to list'
		for(int counter = 1; counter <=25; counter ++)
		{
			int number =randomNumbers.nextInt(101);
			System.out.printf("%d ", number);
			
			list.insertInOrder(number);
			list.print();
		}
		System.out.println();
		list.print();
	}
}
