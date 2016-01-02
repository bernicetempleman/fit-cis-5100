//Programmer	: Bernice Templeman
//Date			: 11/10/2015
//Course		: CIS 5100
//Homework		: 12
//Exercise		: 21.6
//Description   : Concatenating Lists
//				: Write a program to concatenate two linked list objects of characters
//				: Class List Concatenate should include a static method concatenate
//				: that takes references to both list objects as args 
//				: and concatenates the second list to the first list
/*
 * Sample Output
 * 
Creating List 1: 
The list is: 1
The list is: 21

Creating List 2: 
The list is: 3
The list is: 34

Concatenate List 2 to to List 1: 
List 1: The list is: 2134
List 2: The list is: 34

Concatenate List 1 to to List 2: 
List 1: The list is: 2134
List 2: The list is: 342134
 */

// Test List concatenate
public class CIS5100_Ch21_6 
{

	public static void main(String[] args) 
	{
		
		List<Character> list1 = new List<>();
		List<Character> list2 = new List<>();
		
		System.out.println("Creating List 1: " );
		
		//insert characters
		list1.insertAtFront('1');
		list1.print();
		list1.insertAtFront('2');
		list1.print();
		
		System.out.println("\nCreating List 2: " );
		
		list2.insertAtBack('3');
		list2.print();
		list2.insertAtBack('4');
		list2.print();
		
		System.out.println("\nConcatenate List 2 to to List 1: " );
		
		List.concatenation(list1,list2);
		System.out.print("List 1: " );
		list1.print();
		System.out.print("List 2: " );
		list2.print();
		
		System.out.println("\nConcatenate List 1 to to List 2: " );
		
		List.concatenation(list2,list1);
		System.out.print("List 1: " );
		list1.print();
		System.out.print("List 2: " );
		list2.print();		
	}
}
