//Programmer	: Bernice Templeman
//Date			: 11/10/2015
//Course		: CIS 5100
//Homework		: 12
//Exercise		: 21.10
//Description   : Print a sentence in reverse using stack

public class ReverseStack<T> extends List<T>
{
	public ReverseStack()
	{
		super("stack");
	}
	
	public void push(T object)
	{
		insertAtFront(object);
	}
	
	public T pop() throws EmptyListException
	{
		return removeFromFront();
	}
	


}
