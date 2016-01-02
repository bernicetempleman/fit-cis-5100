
public class Ch4_Exercise15 {

	public static void main(String[] args) {
		// a) 
		// 
		// if (age >= 65);
		//	System.out.println("Age is greater than or equal to 65");
		// else
		//	System.out.println("Age is less than 65");	
		//
		// age not declared and initialized
		// added declaration & initialized age
		// code will not compile because of a syntax error on "else"
		// error is caused because of the semicolon in
		//     if (age >= 65);
		// remove the semicolon
		int age = 66;
		if (age >= 65)
			System.out.println("Age is greater than or equal to 65");
		else
			System.out.println("Age is less than 65");	
		
		// b. 
		// int x = 1, total;
		int x = 1, total=0;
		while(x<=10)
		{
			total += x;
			++x;
			System.out.printf("x = %d  Total = %d \n", x, total);
			
		}
		System.out.printf("x = %d  Total = %d ", x, total);
		// error given because total is not initialized
		// initialize total to 0
		// no output displayed
		// added print to show values of x & total
		// x = 11  Total = 55

		// c.
		
		int y = 0;
		int totaly = 0;
		while(y <= 100)
		{
			totaly +=y;
		System.out.printf("y = %d TotalY= %d\n", y, totaly);
		++y;
		}
		System.out.printf("y = %d TotalY= %d\n", y, totaly);
		// y not declared & initialized
		// program compiles and runs but does not display results
		//infinit loop because y is not incremented inside loop
		//add brackets
		// added print: y = 101 TotalY= 5050
		
		
		//d.
		int z = 1;
		while (z > 0)
		{
			System.out.println(z);
			z--;
		}
		//z not initialized
		//missing closing bracket'
		// z not decremented so will always be greater than 0
		// infinite loop
		
	}

}
