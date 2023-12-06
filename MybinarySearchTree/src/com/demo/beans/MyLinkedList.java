package com.demo.beans;

public class MyLinkedList {
	Node root;
	
	class Node{
		int data;
		Node right,left;
		public Node(int data)
		{
			this.data=data;
			right=null;
			left=null;
		}
		
	}
	
	// calling adding function
	public void addNewNode(int data)
	{
		root=addNode(root,data);
		
	}
	// adding new element
	private Node addNode(Node root,int data)
	{
		Node newNode=new Node(data);
		if(root==null)
		{
			root=newNode;
			return root;
		}
		else
		{
			//we send recursive call
			if(root.data>data)
			{
				root.left=addNode(root.left,data);
			}
			else
			{
				root.right=addNode(root.right,data);
			}
			return root;
		}
	}
	
	//calling preorder treaversal function
	public void preorder()
	{
		preorderRev(root);
	}
	private void preorderRev(Node root) {
		if(root!=null)
		{
			System.out.print(root.data+",");
			preorderRev(root.left);
			preorderRev(root.right);
		}
		
		
	}
	
	
}
