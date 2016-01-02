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
//
// Fig. 21.17: Tree.java
// TreeNode and Tree class declarations for a binary search tree.
// package com.deitel.datastructures;

// class TreeNode definition
class TreeNode<T extends Comparable<T>> 
{
   // package access members
   TreeNode<T> leftNode; 
   T data; // node value
   TreeNode<T> rightNode; 

   // constructor initializes data and makes this a leaf node
   public TreeNode(T nodeData)
   { 
      data = nodeData;              
      leftNode = rightNode = null; // node has no children
   } 

   // locate insertion point and insert new node; ignore duplicate values
   public void insert(T insertValue)
   {
      // insert in left subtree
      if (insertValue.compareTo(data) < 0) 
      {
         // insert new TreeNode
         if (leftNode == null)
            leftNode = new TreeNode<T>(insertValue);
         else // continue traversing left subtree recursively
            leftNode.insert(insertValue); 
      }
      // insert in right subtree
      else if (insertValue.compareTo(data) > 0) 
      {
         // insert new TreeNode
         if (rightNode == null)
            rightNode = new TreeNode<T>(insertValue);
         else // continue traversing right subtree recursively
            rightNode.insert(insertValue); 
      } 
   } 
} // end class TreeNode

// class Tree definition
public class Tree<T extends Comparable<T>>
{
   private TreeNode<T> root;

   // constructor initializes an empty Tree of integers
   public Tree() 
   { 
      root = null; 
   } 

   // insert a new node in the binary search tree
   public void insertNode(T insertValue)
   {
      if (root == null)
         root = new TreeNode<T>(insertValue); // create root node
      else
         root.insert(insertValue); // call the insert method
   } 

   // begin preorder traversal
   public void preorderTraversal()
   { 
      preorderHelper(root); 
   } 

   // recursive method to perform preorder traversal
   private void preorderHelper(TreeNode<T> node)
   {
      if (node == null)
         return;

      System.out.printf("%s ", node.data); // output node data
      preorderHelper(node.leftNode); // traverse left subtree
      preorderHelper(node.rightNode); // traverse right subtree
   } 

   // begin inorder traversal
   public void inorderTraversal()
   { 
      inorderHelper(root); 
   } 

   // recursive method to perform inorder traversal
   private void inorderHelper(TreeNode<T> node)
   {
      if (node == null)
         return;

      inorderHelper(node.leftNode); // traverse left subtree
      System.out.printf("%s ", node.data); // output node data
      inorderHelper(node.rightNode); // traverse right subtree
   } 

   // begin postorder traversal
   public void postorderTraversal()
   { 
      postorderHelper(root); 
   } 

   // recursive method to perform postorder traversal
   private void postorderHelper(TreeNode<T> node)
   {
      if (node == null)
         return;
  
      postorderHelper(node.leftNode); // traverse left subtree
      postorderHelper(node.rightNode); // traverse right subtree
      System.out.printf("%s ", node.data); // output node data
   } 
   
   //instance variables
   int currentDepth, depth;
   public int getDepth()
   {
	   depth = 0;	//set depth to 0
	   currentDepth = 0; //set current Depth to 0
	   depth = getDepthHelper(root);	   
	   return depth;
   }
   
   //help from http://tekmarathon.com/2013/05/02/find-depth-of-binary-search-tree/
   public int getDepthHelper(TreeNode<T> node)
   {
	   
	   if (node == null)
		   return depth; 
	   
	   currentDepth++; //increment currentDepth
	   
	   if (currentDepth > depth) //check if deepest
	   {
           depth = currentDepth; 
       }

       getDepthHelper(node.leftNode); // traverse left subtree
       getDepthHelper(node.rightNode);  // traverse right subtree

       currentDepth--; //decrement currentDepth
	   
	   return depth;
   }
} // end class Tree
