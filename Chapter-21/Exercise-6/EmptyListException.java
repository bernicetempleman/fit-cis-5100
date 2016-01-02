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

public class EmptyListException extends RuntimeException
{
	//constructor
	public EmptyListException()
	{
		this("List"); // call other constructor
	}
	
	//constructor
	public EmptyListException(String name)
	{
		super(name + " is empty"); // call super class constructor
	}
}
