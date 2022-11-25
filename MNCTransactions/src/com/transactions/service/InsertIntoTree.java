package com.transactions.service;

public class InsertIntoTree 
{
	public static Node root,newNode;
	public static class Node
	 {
		public int data;
		public Node left;
		public Node right;
		
		public Node(int data)
		{
			super();
			this.data=data;
		}
		
	 }
	
	public InsertIntoTree()
	{
		super();
	    root= null;
	    newNode=null;
	}
	
	public void insertintoBST(int data)
	{
		root=insertKey(root,data);
	}
	
	Node insertKey(Node root, int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		if(data<root.data)
		{
			root.left=insertKey(root.left,data);
		}else if(data>root.data)
		{
			root.right=insertKey(root.right,data);
		}
		return root;
	}
	public void convertintoRST()
	{
		inorder(root);
	}
	
	public void insertintoRST(int data)
	{
		newNode=insertRSTKey(newNode,data);
	}
	
	Node insertRSTKey(Node newNode, int data)
	{
		if(newNode==null)
		{
			newNode=new Node(data);
			return newNode;
		}
		 if(data>newNode.data)
		{
			 newNode.right=insertRSTKey(newNode.right,data);
			 newNode.left=null;
			 return newNode;
		}
		 else
		return newNode;
	}
	
	
	
	public void inorder(Node root)
	  {
		  if(root==null)
		  {
			  return;
		  }
		  else
		  {
			  inorder(root.left);
			  insertintoRST(root.data); 
			  inorder(root.right);
		  }
	
	  }
	public void printTree()
	{
		printRSTree(newNode);
	}
	
	public void printRSTree(Node newNode)
	{
		if(newNode==null)
		  {
			  return;
		  }
		else
		  {
			 System.out.print(newNode.data+" ");
			printRSTree(newNode.right);
			  
		  }
	}
	  

	
}
