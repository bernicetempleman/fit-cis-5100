//Programmer	: Bernice Templeman
//Date			: 11/10/2015
//Course		: CIS 5100
//Homework		: 12
//Exercise		: 21.19
//Description   : Depth of a binary tree
//				: Modify 21.17 & 21.18  so the Tree class
//				: provides a method getDepth
//				: that Determines how many Levels are in that tree
//				: Test in an application that inserts 20 random integers in a Tree

// Fig. 21.18: TreeTest.java
// Binary tree test program.
/*
 * Sample output
 * 
 Inserting the following values: 
74 14 28 62 73 76 77 76 49 99 39 0 66 11 7 19 94 2 78 41 

Preorder traversal
74 14 0 11 7 2 28 19 62 49 39 41 73 66 76 77 99 94 78 

Inorder traversal
0 2 7 11 14 19 28 39 41 49 62 66 73 74 76 77 78 94 99 

Postorder traversal
2 7 11 0 19 41 39 49 66 73 62 28 14 78 94 99 77 76 74 


Depth = 7 
 */

import java.security.SecureRandom;
//import com.deitel.datastructures.Tree;

public class TreeTest 
{
   public static void main(String[] args)
   {
      Tree<Integer> tree = new Tree<Integer>();
      SecureRandom randomNumber = new SecureRandom();

      System.out.println("Inserting the following values: ");

      // insert 20 random integers from 0-99 in tree 
      for (int i = 1; i <= 20; i++) 
      {
         int value = randomNumber.nextInt(100);
         System.out.printf("%d ", value);
         tree.insertNode(value);
      } 

      System.out.printf("%n%nPreorder traversal%n");
      tree.preorderTraversal(); 

      System.out.printf("%n%nInorder traversal%n");
      tree.inorderTraversal(); 

      System.out.printf("%n%nPostorder traversal%n");
      tree.postorderTraversal(); 
      System.out.println();
      
      System.out.printf("%n%nDepth = %d %n",tree.getDepth());      
      
   } 
} // end class TreeTest
