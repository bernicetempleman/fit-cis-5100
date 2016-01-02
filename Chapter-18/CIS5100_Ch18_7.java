//Programmer	: Bernice Templeman
//Date			: 10/21/2015
//Course		: CIS 5100
//Homework		: 10
//Exercise		: 18.7
//Description   : recursive method multiplies 2 numbers
public class CIS5100_Ch18_7 {

	public static void main(String[] args) {
		
		int c = mystery(3,4);
		
		System.out.printf(" %d", c);

	}
	
	public static int mystery(int a, int b)
	{
		if (b == 1)
		{
			System.out.printf(" b == 1, a == %d \n", a);
			return a;
		}
		else 
		{ 
			System.out.printf(" b== %d, a== %d\n", b, a);
		
			return a + mystery(a, b - 1);
		}
	}

}
