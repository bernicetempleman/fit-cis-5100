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

 */
public class Queue<T> extends List<T>{
	
	private List<T> queueList;
	
	//constructor
	public Queue()
	{
		queueList = new List<T>("queue");
	}
	
	public void enqueue(T object)
	{
		queueList.insertAtBack(object);
	}
	public T dequeue() throws EmptyListException
	{
		return queueList.removeFromFront();
	}
	
	public boolean isEmpty()
	{
		return queueList.isEmpty();
	}
	
	public void print()
	{
		queueList.print();
	}
	
	public void printAverage()
	{
		queueList.printAverage();
	}
}
