//Programmer	: Bernice Templeman
//Date			: 11/10/2015
//Course		: CIS 5100
//Homework		: 12
//Exercise		: 21.10
//Description   : 
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
