import java.security.SecureRandom;

//Programmer	: Bernice Templeman
//Date			: 11/25/2015
//Course		: CIS 5100
//Exam 			: Final
//Exercise		: 6.A
/*
 * Write a program that creates a queue of integers. 
After that it loads in 20 random integers between 1 and 6, 
and after the 20th number it prints out the content of the queue.  
Finally, the program calculates and prints out the average of the values 
without losing the values from the queue!

(For the queue structure, consider Chapter 21, Data Structures.)

Example Output:
The queue is: 5 3 4 5 4 6 5 5 1 1 4 4 2 2 3 1 4 3 6 4 
The queue Average is: 3.600000

 */
public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<>();
		
		SecureRandom randomNumbers = new SecureRandom();
		
		for (int i = 0; i < 20; i++)
		{
			queue.enqueue(1 + randomNumbers.nextInt(6));
		}	
		queue.print();
		queue.printAverage();
	}
}
