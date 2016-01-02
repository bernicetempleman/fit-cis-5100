import java.util.Scanner;

//Programmer	: Bernice Templeman
//Date			: 10/06/2015
//Course		: CIS 5100
//Homework  	: 7
//Exercise		: 7.9
//Description   : Consider a two-by-three integer array t.
/*          
a.) Write a statement that declares and creates t

    int [][] t = new int[2][3];
    
b.) How many rows does t have? 

    2

c.) How many columns does t have? 
    3

d.) How many elements does t have? 

    6

e.) Write access expressions for all the elements in row 1 of t:
    // access expression: A component of an array is accessed by an array access expression 
     * that consists of an expression whose value is an array reference 
     * followed by an indexing expression enclosed by [ and ], as in t[0][0].
     * 
     * if t is a 2 by 3 array , consisting of row 0 & row 1
     * then the elements in row 1 would be:
     * t[1][0]
     * t[1][1]
     * t[1][2]
     * 
     * these statement print the elements i row 1:

		 System.out.println("Element in row 1, column 0: "
                 + t[1][0]);
		 System.out.println("Element in row 1, column 1: "
                 + t[1][1]);
		 System.out.println("Element in row 1, column 2: "
                 + t[1][2]);
                 
f.) Write access expressions for all the elements in column 2 of t
    // there are three columns with index 0,1,2
     * all the elements in column 2 would be:
     * t[0][2]
     * t[1][2]
     * 
     * These statements print the elements of column 2:
		 System.out.println("Element in row 0, column 2: "
                 + t[0][2]);
		 System.out.println("Element in row 1, column 2: "
                 + t[1][2]);

g) Write a single statement that sets the element of t in row 0 and column 1 to zero
		t[0][1] = 0;
		
h.) Write individual statements to initialize each element of t to zero
		 t[0][0] = 0;
		 t[0][1] = 0;
		 t[0][2] = 0;
		 t[1][0] = 0;
		 t[1][1] = 0;
		 t[1][2] = 0;	
		 
i.) Write a nested for statement that initializes each element of t to zero
			 for (int row=0; row < t.length; row++)
			   for(int col=0;col<t[row].length; col++)
				 t[row][col]=0;
				 
j.) Write a nested for statement that inputs the values for the elements of t from the user
		Scanner input = new Scanner(System.in);
			
		 for (int row=0; row < t.length; row++)
			 for(int col=0; col<t[row].length; col++)
			 {
					// ask user for the integer
					System.out.printf("\nEnter the integer for row %d column %d: ",row,col);
					t[row][col] = input.nextInt();	 
			 }
			 
k.) Write a series of statements that determines and displays the smallest value in t
	 
		 int smallest = t[0][0];
		 int smallrow = 0;
		 int smallcol = 0;
		 
		 for (int row=0; row < t.length; row++)
			 for(int col=0;col<t[row].length;col++)
			 {
				 if (t[row][col]<smallest)
				 {
					 smallest = t[row][col];
					 smallrow = row;
					 smallcol = col;		
				 }
			 }
		 System.out.printf("\nThe smallest value is %d at row %d column %d: ",smallest,smallrow,smallcol);
	
l.) Write a single printf statement that displays the elements of the first row of t
			 System.out.printf("\nElements in row 1: %d %d %d", t[0][0],t[0][1], t[0][2]);
                 
m.) Write a statement that totals the elements of the third column of t. Do not use repetition
    // the third column is column 2
		 int total = t[0][2] + t[1][2];
		 
n.) write a series of statements that displays the contents of t in tabular format
List the column indices as headings across the top, and list the row indices at the left of each row
		 System.out.printf("\n\t0\t1\t2");
		 System.out.printf("\nRow 0:\t%d\t%d\t%d", t[0][0],t[0][1],t[0][2]);
		 System.out.printf("\nRow 1:\t%d\t%d\t%d", t[1][0],t[1][1],t[1][2]);
 */
public class Ch7_Exercise9 {

	public static void main(String[] args) 
	{
		//a. array creation expression: declares and creates array t
		System.out.println("\nA: Write a statement that declares and creates t ");
		System.out.println("The array creation expression is:\n"
				+ "int [][] t = new int[2][3]; ");
		
		//declare & create array
		int [][] t = new int[2][3];
		
		System.out.println("\nB: ");
		System.out.println("How many rows does t have? 2 ");
		
		System.out.println("\nC: ");
		System.out.println("How many columns does t have? 3 ");
		
		System.out.println("\nD: ");
		System.out.println("How many elements does t have? 6 ");
		
		//e. access expressions for all the elements in row 1 of t
		System.out.println("\nE: access expressions for all the elements in row 1 of t");
		 System.out.println("t[1][0] accesses the Element in row 1, column 0: "
                 + t[1][0]);
		 System.out.println("t[1][1] accesses the Element in row 1, column 1: "
                 + t[1][1]);
		 System.out.println("t[1][2] accesses the Element in row 1, column 2: "
                 + t[1][2]);
		
		//f. access expressions for all the elements in column 2 of t	 
		System.out.println("\nF: access expressions for all the elements in column 2 of t");		
		 System.out.println("t[0][2] accesses the Element in row 0, column 2: "
                 + t[0][2]);
		 System.out.println("t[1][2] accesses the Element in row 1, column 2: "
                 + t[1][2]);

		
		//g) Write a single statement that sets the element of t in row 0 and column 1 to zero
		System.out.println("\nG: Write a single statement that sets the element of t in row 0 and column 1 to zero ");
		System.out.println(" t[0][1] = 0;");
		
		// set element to 0
		t[0][1] = 0;
		 
		//h.) Write individual statements to initialize each element of t to zero
		System.out.println("\nH: Write individual statements to initialize each element of t to zero");
		System.out.println("t[0][0] = 0;\nt[0][1] = 0;\nt[0][2] = 0;\nt[1][0] = 0;\nt[1][1] = 0;\nt[1][2] = 0;\n");	 

		// individual statements to set each element to 0
		t[0][0] = 0;
		t[0][1] = 0;
		t[0][2] = 0;
		t[1][0] = 0;
		t[1][1] = 0;
		t[1][2] = 0;
		
		//i.) Write a nested for statement that initializes each element of t to zero
		System.out.println("\nI: Write a nested for statement that initializes each element of t to zero ");
		System.out.println("for (int row=0; row < t.length; row++)");
		System.out.println("  for(int col=0;col<t[row].length;col++)");
		System.out.println("    t[row][col]=0;");
		
		// nested loop to initialize each element to 0
		for (int row=0; row < t.length; row++)
			 for(int col=0;col<t[row].length;col++)
				 t[row][col]=0;
		 
		//j.) Write a nested for statement that inputs the values for the elements of t from the user
		System.out.println("\nJ: Write a nested for statement that inputs the values for the elements of t from the user");
		System.out.println("Scanner input = new Scanner(System.in);");
		System.out.println("for (int row=0; row < t.length; row++)");
		System.out.println("  for(int col=0;col<t[row].length;col++)");
		System.out.println("  { \n    System.out.printf(\"\\nEnter the integer for row %d column %d: \",row,col);");
		System.out.println("    t[row][col] = input.nextInt(); \n  }");
		
		// nested loop to input valuse of elements
		Scanner input = new Scanner(System.in);
		for (int row=0; row < t.length; row++)
			for(int col=0;col<t[row].length;col++)
			 {
					// ask user for the integer
					System.out.printf("\nEnter the integer for row %d column %d: ",row,col);
					t[row][col] = input.nextInt();	 
			 }

		 
		//k.) Write a series of statements that determines and displays the smallest value in t
		System.out.println("\nK: Write a series of statements that determines and displays the smallest value in t");
		System.out.println("int smallest = t[0][0];");
		System.out.println("int smallrow = 0;");
		System.out.println("int smallcol = 0;");
		System.out.println("for (int row=0; row < t.length; row++)");
		System.out.println("  for(int col=0;col<t[row].length;col++)");
		System.out.println("  {\n    if (t[row][col]<smallest) \n    {");
		System.out.println("    smallest = t[row][col];");
		System.out.println("    smallrow = row;    ");
		System.out.println("    smallcol = col;\n    }\n  }");
		System.out.println("System.out.printf(\"\\nThe smallest value is %d at row %d column %d \",smallest,smallrow,smallcol);");
		
		
		// determine & display the smallest value in t
		int smallest = t[0][0];
		int smallrow = 0;
		int smallcol = 0;	 
		for (int row=0; row < t.length; row++)
			for(int col=0;col<t[row].length;col++)
			 {
				 if (t[row][col]<smallest)
				 {
					 smallest = t[row][col];
					 smallrow = row;
					 smallcol = col;		
				 }
			 }
		 System.out.println("\n Output:");
		 System.out.printf("\nThe smallest value is %d at row %d column %d ",smallest,smallrow,smallcol);
		 
		//l.) Write a single printf statement that displays the elements of the first row of t
		System.out.println("\n\nL: Write a single printf statement that displays the elements of the first row of t");
		System.out.println("System.out.printf(\"\\nElements in row 1: %d %d %d\",t[0][0],t[0][1], t[0][2]);");
		
		System.out.println("\nOutput:");
		System.out.printf("\nElements in row 1: %d %d %d",t[0][0],t[0][1], t[0][2]);
		 
		//m.) Write a statement that totals the elements of the third column of t. 
		// Do not use repetition
		System.out.println("\n\nM: Write a statement that totals the elements of the third column of t.");
		System.out.println("int total = t[0][2] + t[1][2];");
		
		System.out.println("\nOutput:");
		int total = t[0][2] + t[1][2];
		System.out.printf("total = %d\n", total);

		//n. write a series of statements that displays the contents of t in tabular format
		//   List the column indices as headings across the top, 
		//   and list the row indices at the left of each row
		System.out.println("\nN: write a series of statements that displays the contents of t in tabular format");
		System.out.println("System.out.printf(\"\\nIndex:\t0\t1\t2\");");
		System.out.println("System.out.printf(\"\\n--------------------------\");");
		System.out.println("System.out.printf(\"\\nRow 0:\t%d\t%d\t%d\", t[0][0],t[0][1],t[0][2]);	");
	    System.out.println("System.out.printf(\"\\nRow 1:\t%d\t%d\t%d\", t[1][0],t[1][1],t[1][2]);");	
		
	    System.out.println("\nOutput:");
		 System.out.printf("\nIndex:\t0\t1\t2");
		 System.out.printf("\n--------------------------");
		 System.out.printf("\nRow 0:\t%d\t%d\t%d", t[0][0],t[0][1],t[0][2]);
		 System.out.printf("\nRow 1:\t%d\t%d\t%d", t[1][0],t[1][1],t[1][2]);
		 
	}
}
