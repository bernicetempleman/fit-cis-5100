//Programmer	: Bernice Templeman
//Date			: 09/22/2015
//Course		: CIS 5100
//Homework  	: 6
//Exercise		: 6.7
//Description   : What is the value of x after each statement
//
/*
* a. 7.500000
* b. 7.000000
* c. 0.000000
* d. 0.000000
* e. 6.400000
* f. -6.000000
* g. -14.000000
 */
public class Ch6_Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x;
		
		x = Math.abs(7.5);
		System.out.printf("a. %f",x);
		
		x = Math.floor(7.5);
		System.out.printf("\nb. %f",x);
		
		x = Math.abs(0.0);
		System.out.printf("\nc. %f",x);
		
		x = Math.ceil(0.0);
		System.out.printf("\nd. %f",x);
		
		x = Math.abs(-6.4);
		System.out.printf("\ne. %f",x);
		
		x = Math.ceil(-6.4);
		System.out.printf("\nf. %f",x);
		
		x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
		System.out.printf("\ng. %f", x);

	}

}
