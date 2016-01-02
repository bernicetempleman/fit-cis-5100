//Programmer	: Bernice Templeman
//Date			: 11/10/2015
//Course		: CIS 5100
//Homework		: 12
//Exercise		: 21.7
//Description   : Inserting into Ordered Lists
//				: SortedList: modify List<T> class figure 21.3 to maintain an ordered list

	//List.java
	// ListNode and List class declarations
	// package

	// class to represent one node in a list
	class ListNode<T extends Comparable<T>>
	{
		//package access members; List can access these directly
		T data;
		ListNode<T> nextNode;
		
		// constructor create a ListNode that refers to object
		ListNode(T object)
		{
			this(object, null);
		}
		
		//constructor creates ListNode that refers to the specified
		// object and to the next Listnode
		ListNode(T object, ListNode<T> node)
		{
			data = object;
			nextNode = node;
		}
		
		// return reference to next node in list
		ListNode<T> getNext()
		{
			return nextNode;
		}	
	}// end class ListNode<T>

	public class SortedList<T extends Comparable<T>> 
	{
		private ListNode<T> firstNode;
		private ListNode<T> lastNode;
		private ListNode<T> currentNode;
		private String name; // string like "list" used in printing
		
		// constructor creates empty List with "list" as the name
		public SortedList()
		{
			this("list");
		}
		
		//constructor creates an empty List with a name
		public SortedList(String listName)
		{
			name = listName;
			firstNode = lastNode = null;
		}
		
		//insert item at the front of the List
		public void insertAtFront(T insertItem)
		{
			if (isEmpty()) //firstNode and lastNode refer to same object
				firstNode = lastNode = new ListNode<T>(insertItem);
			else // firstNode refers to new node
				firstNode = new ListNode<T>(insertItem, firstNode);
		}
		
		//insert item at the end of List
		public void insertAtBack(T insertItem)
		{
			if(isEmpty())
				firstNode = lastNode = new ListNode<T>(insertItem);	
			else
				lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
		}
		
		public void insertInOrder(T insertItem)
		{
			// no nodes in list
			if (isEmpty()) //firstNode and lastNode refer to same object
			{
				firstNode = lastNode = new ListNode<T>(insertItem);
				return;
			}
			
			else // find place to insert
			{
							
				ListNode<T> current = firstNode; 
				
				// check if only first node in list
				if(current.nextNode == null)
				{
					if ( insertItem.compareTo(current.data) <= 0)
					{
						//insertAtFront(insertItem);
						firstNode = new ListNode<T>(insertItem, firstNode);
						return;
					}
					else
					{
						//insert last
						lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
						return;
					}
				}
				
				else // more than one node
				{
					// if new node is first
					if (insertItem.compareTo(current.data) <= 0)
					{
						firstNode = new ListNode<T>(insertItem, firstNode);
						return;
					}
					
					ListNode<T> newNode = new ListNode<T>(insertItem);
				
					//while not at end of list, search for insertion point
					while (current != null)
					{
						// check if  no next node
						if (current.nextNode == null)
						{
							//if new node is less than current node, insert before current/last node
							if ( insertItem.compareTo(current.data) <= 0)
							{
								newNode.nextNode =current;
								newNode = current;									
								return;							
							}
							
							else // insert last (insertItem.compareTo(current.data) < 0))
							{
								current.nextNode = newNode;
								lastNode = lastNode.nextNode = newNode;
								return;
							}					
						}// end if no next node
						
						// else there is a next node
						// if newnode is > current & less than next, insert it
						else if ((insertItem.compareTo(current.data) >= 0)
							&& (insertItem.compareTo(current.nextNode.data) < 0 ))
						{				
							newNode.nextNode = current.nextNode;
							current.nextNode = newNode;		
							return;
						}
						
						current = current.nextNode;
						
					}//end while
				}//end if				
			}//end else
			return;
		}// end insert sorted method		
		
		// remove first Node from list
		public T removeFromFront() throws EmptyListException
		{
			if (isEmpty()) //throw exception if List is empty
				throw new EmptyListException(name);
			
			T removedItem = firstNode.data; //retrieve data being removed
			
			// update references firstNode and lastNode
			if (firstNode == lastNode)
				firstNode = lastNode = null;
			else
				firstNode = firstNode.nextNode;
			
			return removedItem; //return removed node data		
		}
		
		//remove last node from list
		public T removeFromBack() throws EmptyListException
		{
			if (isEmpty()) //throw exception if List is empty
				throw new EmptyListException(name);
			
			T removedItem = lastNode.data; //retrieve data being removed
			
			// update references firstNode and lastNode
					if (firstNode == lastNode)
						firstNode = lastNode = null;
					else //locate new last node
					{
						ListNode<T> current = firstNode;
						
						//loop while current node does not refer to lastNode
						while (current.nextNode != lastNode)
							current = current.nextNode;
						
						lastNode = current; // current is new lastNode
						current.nextNode = null;
					}
					
					return removedItem; // return removed node data
		}
		
		//determine whether list is empty
		public boolean isEmpty()
		{
			return firstNode == null; //return true if list is empty
		}
		
		//output the list contents
		public void print()
		{
			if (isEmpty())
			{
				System.out.printf("Empty %s%n", name);
				return;		
			}
			
			System.out.printf("The %s is: ", name);
			ListNode<T> current = firstNode;
			
			//while not at end of list, output current node's data
			while (current != null)
			{
				System.out.printf("%s ",current.data);
				current = current.nextNode;
			}
			
			System.out.println();
		}		
		
		public T getData()
		// view first Node from list
		{
			if (isEmpty()) //throw exception if List is empty
				throw new EmptyListException(name);
			
			T removedItem = firstNode.data; //retrieve data being removed
			
			return removedItem; //return removed node data		
		}
		
		public static void concatenation( SortedList l1, SortedList l2)
		{
			//add l2 to end of l1
			if (l2.isEmpty())
				return;
			else
			{
				l2.currentNode = l2.firstNode;
				// loop through l2 and add to l1
				
				while(l2.currentNode != null)
				{
					l1.insertAtBack(l2.currentNode.data);
					l2.currentNode = l2.currentNode.nextNode;
				}
			}			
		}
	}//end Class SortedList<T>

