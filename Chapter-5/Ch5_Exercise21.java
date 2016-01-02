//Programmer	: Bernice Templeman
//Date			: 09/22/2015
//Course		: CIS 5100
//Homework  	: 5
//Exercise		: 5.21
//Description   : Pythagorean Triples
//				: a*a + b*b = h*h
// 				: Display a table of triples <= 500
// 				: side1	side2	hypotenuse

public class Ch5_Exercise21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 500;
		
		System.out.printf("\nSide1\tSide2\tHypotenuse");
		
		//hypotenuse
		for (int hypotenuse=1; hypotenuse <= max; hypotenuse++)
		{	
			// side 1
			for (int side1=1; side1 <= max ; side1++)
			{	
				//side 2
				for(int side2=1; side2 <= max; side2++)
				{
					if( side1*side1 + side2*side2 == hypotenuse*hypotenuse)
					{
						System.out.printf("\n%d\t%d\t%d",side1, side2, hypotenuse);
					}
				}
			}
		}

	}
}
