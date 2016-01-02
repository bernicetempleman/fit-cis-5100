//Programmer	: Bernice Templeman
//Date			: 09/22/2015
//Course		: CIS 5100
//Homework  	: 5
//Exercise		: 5.10
/* Nested Loop Prints the following 10 rows of 5 "@"
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
*/
public class Ch5_Exercise10 {

	public static void main(String[] args) 
	{
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= 5; j++)
				System.out.print('@');
			
			System.out.println();
		}
	}
}
