//Programmer	: Bernice Templeman
//Date			: 09/13/2015
//Course		: CIS 5100
//Homework  	: 4
//Exercise		: 4.22
//Description	: Tabular Output
//              : Write a Java application that uses looping 
//				: to print the following Table of Values
//
// N			10*N		100*N		1000*N
//
// 1			10		100		1000
// 2			20		200		2000
// 3			30		300		3000
// 4			40		400		4000
// 5			50		500		5000


public class Ch4_Exercise22 {

	public static void main(String[] args) {
		
		// print header
		System.out.printf("N\t\t\t10*N\t\t100*N\t\t1000*N\n\n");
		
		int n = 1;  //initialize n
		
		//loop to print values
		while (n < 6)
		{
			System.out.printf("%d\t\t\t%d\t\t%d\t\t%d\n", n, 10*n, 100*n, 1000*n);
			n++;
		}

	}

}
