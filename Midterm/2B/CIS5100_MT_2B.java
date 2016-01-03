//Programmer	: Bernice Templeman
//Date			: 10/15/2015
//Course		: CIS 5100
//Exam 			: Midterm
//Exercise		: 2.B
//Description   : Give at least 1 example 
//				: for each java control statement

public class CIS5100_MT_2B {

	public static void main(String[] args) {
		
		//variables
		int total=0, grade=0, counter=0;
		int aCount=0, bCount=0, cCount=0,dCount=0,fCount=0;
		

//		Give at least 1 example for each.
//	1.	Sequence:			
		total = total + grade; 
		counter = counter +1;
		
//	2.	If:  
		if (grade >= 60)  
			System.out.println( "Passed" );
		
//	3.	If/else: 
		if (grade >= 60) 
			System.out.println( "Passed" );
		else
			System.out.println( "Failed" );

//	4.	Switch:			
			switch (grade/10)
			{
				case 9:
				case 10: 
					++ aCount;
					break;
				case 8:
					++ bCount;
					break;
				case 7:
					++ cCount;
					break;
				case 6:
					++ dCount;
					break;
				default: 
					++fCount; 
					break;
			}

//	5.	While:
			int product = 2;
			while( product < 10)
				product++;

//	6.	Do/While:
			int i = 0;
			do
			{
				System.out.printf("%d",i);
				i++;
			}while( i < 10);

//	7.	For:
		for(int j = 0; j < 10; j++)
				System.out.printf("%d",j);

	}
}
