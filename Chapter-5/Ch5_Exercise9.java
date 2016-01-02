//Programmer	: Bernice Templeman
//Date			: 09/22/2015
//Course		: CIS 5100
//Homework  	: 5
//Exercise		: 5.9
public class Ch5_Exercise9 {

	public static void main(String[] args) {
	
	System.out.println("Exercise 5.9 a:");
	//find and correct errors 
	//	a. 
	//	for(i=100, i >= 1, i++)
	//	System.out.println(i);
				
	// syntax error in for , instead of ;
    // i not declares
	// i incremented instead of decremented 
	// infinite loop because i will always be >= 1
	// Corrected:
		for(int i=100; i >= 1; i--)
		System.out.println(i);
	
	System.out.println("\nExercise 5.9 b:");
	// b. print whether the int value is odd or even

	//	switch (value % 2)
	//	{
	//		case 0:
	//			System.out.println("Even integer");
	//		case 1:
	//			System.out.println("Odd integer");
	//	}
		// value not declared & initialized
		// no break statement 9 (even prints both  even & odd
		// no default statement
		// corrected:
		int value = 2;
		switch (value % 2)
		{
			case 0:
				System.out.println("Even integer");
				break;
			case 1:
				System.out.println("Odd integer");
				break;
			default: 
				System.out.println("Error");
				break;
		}
		
		System.out.println("\nExercise 5.9 c:");
		// c. Output odd integers from 19 to 1 
		//for (  i = 19; i >= 1; i+=2)
		//	System.out.println(i);
		
		// i not declared
		// i not decremented ( infinite loop)
		// Corrected:
		for (  int i = 19; i >= 1; i-=2)
			System.out.println(i);
	
		System.out.println("\nExercise 5.9 d:");
		//d. output even integers 2 to 100
		//counter = 2;
		//do
		//{
		//	System.out.println(counter);
		//	counter += 2;
		//} While (counter < 100);
		
		// counter not declared
		// While should be while
		// loop ends before 100
			
		int counter = 2;
		
		do
		{
			System.out.println(counter);
			counter += 2;
		} while (counter <= 100);
	}

}
