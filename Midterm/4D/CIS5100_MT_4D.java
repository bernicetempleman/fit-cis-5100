//Programmer	: Bernice Templeman
//Date			: 10/15/2015
//Course		: CIS 5100
//Exam 			: Midterm
//Exercise		: 4.B
//Description   : What does the following program do? 
//				: Explain line-by-line and 
//				: then give the output. 
/*
 * See cod below for explanation
 */

/*
 * Output
 * 
0 	 2 	 
6 	 12 	 
20 	 30 
 */

//begins class declaration for class CIS5100_MT_4D
public class CIS5100_MT_4D {

	// main method begins execution of a Java program
	public static void main(String[] args) 
	{
		// declares an integer array variable Table
		int Table [ ];    
		
		// creates the array Table; assign to array variable 
		// Table is an array of 6 integers (0-5)
		Table = new int[ 6 ];  
		
		// loop through array index values 0-5
		for ( int i = 0; i < 6; i++ ) 
			// set the value of the index to index * (index+1)
			//first  time i = 0, index 0 = 0 * (0 + 1) = 0
			//second time i = 1, index 1 = 1 * (1 + 1) = 2
			//third  time i = 2, index 2 = 2 * (2 + 1) = 6
			//fourth time i = 3, index 3 = 3 * (3 + 1) = 12
			//fifth  time i = 4, index 4 = 4 * (4 + 1) = 20
			// sixth time i = 5, index 5 = 5 * (5 + 1) = 30
			Table[ i ] = i * ( i + 1 );
		
		//loop through i in reverse ( 6-1)
		for ( int i = 6; i > 0 ; i-- ) 
		{   
		// print value in Table at index 6-i,1space,tab,space
			//first  time i = 6, 6-6 = 0, Table[0] = 0
			//second time i = 5, 6-5 = 1, Table[1] = 2
			//third  time i = 4, 6-4 = 2, Table[2] = 6
			//fourth time i = 3, 6-3 = 3, Table[3] = 12
			//fifth  time i = 2, 6-2 = 4, Table[4] = 20
			// sixth time i = 1, 6-1 = 5, Table[5] = 30
			System.out.printf( "%d \t ", Table [6-i] ); 
			
			// if i is odd then go to next line 
			// 2 values printed per line
			// 1st line is: Table[0] <tab> Table[1]
			// 2nd line is: Table[2] <tab> Table[3]
			// 3rd line is: Table[4] <tab> Table[5]
			// 4th line is blank
			if ( i%2 != 0 )             
				System.out.print( "\n" );     
			
		} //end for loop
	}// end main
}// end class
