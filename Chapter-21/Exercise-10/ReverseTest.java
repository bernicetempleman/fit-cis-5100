import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 11/10/2015
//Course		: CIS 5100
//Homework		: 12
//Exercise		: 21.10
//Description   : Print a sentence in reverse using stack

/*
 * Example output
 * 
Enter a line of text:12345
5 4 3 2 1 
 */

public class ReverseTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a line of text:");
		
		// input a line of text
		String line = input.nextLine();
		
		//use a stack to display the line in reverse order	
		ReverseStack<Character> stack1 = new ReverseStack<>();
		
		// read string into stack
		for (int count = 0; count < line.length(); count++)
			stack1.push(line.charAt(count));
		
		// print sentence in reverse
		while(!stack1.isEmpty())
			System.out.printf("%c",stack1.pop());		
	}
}
