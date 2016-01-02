//Programmer	: Bernice Templeman
//Date			: 10/21/2015
//Course		: CIS 5100
//Homework		: 10
//Exercise		: 18.12
//Description   : Recursive method sums the integers in the array
public class CIS5100_Ch18_12 {
	
	public static int mystery(int[] array2, int size)
	{
		if (size == 1)
		{
			System.out.printf("\nelement[0]=%d", array2[0]);
			return array2[0];
			
		}
		else{
			System.out.printf("\nelement[%d-1]=%d", size, array2[size -1]);
			return array2[size - 1] + mystery(array2, size -1);

		}
	}

	public static void main(String[] args) 
	{
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		int result = mystery(array, array.length);
		System.out.printf("\nResult is: %d%n", result);	
	}
}
