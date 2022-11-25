package com.transactions.driver;

import com.transactions.service.InsertIntoTree;

public class Driver 
{
  public static void main(String[] args)
  {
	  InsertIntoTree tree= new InsertIntoTree();
	  tree.insertintoBST(50);
	  tree.insertintoBST(30);
	  tree.insertintoBST(60);
	  tree.insertintoBST(10);
	  tree.insertintoBST(55);
	  tree.convertintoRST();
	  tree.printTree();
  }
 
}
