package com.demo.beans;

public class MyLinkedList {
	Node head;
	Node rear;
	class Node{
		String data;
		Node next;
		public Node(String data)
		{
			this.data=data;
			next=null;
		}
	}
	public MyLinkedList()
	{
		head=null;
		rear=null;
	}
	//in the queue u can store n number of element that why isFull method is always false
	public boolean isFull()
	{
			return false;
		
	}
	// Checking weather the queue is empty or not
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	// Inserting Data in Queue
	public void insertAtend(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			rear=newNode;
		}
		else {
			rear.next=newNode;
			newNode.next=null;
		}
	}
	// Deleting data
	public String deleteFromStart()
	{
		String s;
		if(isEmpty())
			return "Queue is Empty";
		else {
			s=head.data;
			head=head.next;
			return s;
		}
	}
	// Display the data
	public void display()
	{
		if (head==null)
		{
			System.out.println("Queue is empty");
		}
		else {
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	}
	
	
}
