import java.security.SecureRandom;

//Programmer	: Bernice Templeman
//Date			: 10/06/2015
//Course		: CIS 5100
//Homework  	: 7
//Exercise		: 7.17
//Description   : Write an application to simulate the rolling of 2 dice
//				: use an object of class Random for each die
//				: Calculate the sum of the 2 values (1-6): Sum is (2-12)
//				: roll the dice 36,000,000
//				: use a 1-D array to tally the number of times each possible sum appears
//				: Display the results in tabular form

/*
 * Example of output:
 * Sum	Frequency
2	999389
3	2000439
4	2998453
5	3998984
6	4999830
7	6000078
8	5002247
9	4000001
10	3001477
11	2000623
12	998479

total: 36000000
 * 
 */
public class Ch7_Exercise17 {

	public static void main(String[] args) {
		
		//use a 1-D array to tally the number of times each possible sum appears
		int[] frequency = new int[11];
		
		// randomNumbers object wil produce secure random numbers
		SecureRandom randomNumbers = new SecureRandom();
		
		// roll the dice 36,000,000
		for (int roll = 1; roll <= 36000000; roll++ )
		{
			//use an object of class random once to roll the first die
			int face1 = 1 + randomNumbers.nextInt(6);
			
			//and again to roll the second die
			int face2 = 1 + randomNumbers.nextInt(6);
			
			// calculate the sum of the 2 values and tally the sums
			frequency[face1+face2-2]++;
		}
		
		//Display the results in tabular form
		System.out.println("Sum\tFrequency");
		for ( int number = 0; number < 11; number++)
			System.out.printf("%d\t%d\n",number+2, frequency[number]);
		
		//verify total number of times dice rolled
		int total = 0;
		for(int number : frequency)
			total +=number;
		System.out.printf("\ntotal: %d\n", total);
	}
	
}
