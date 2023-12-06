package com.demo.dao;

import com.demo.beans.MyLinkedList;

public class DaoImpl implements Dao {
	MyLinkedList ll=new MyLinkedList();
	@Override
	public void insert(String data) {
		
		ll.insertAtend(data);
		
	}
	
	//deleting string 
	@Override
	public String deletestr() {
		String s=ll.deleteFromStart();
		return s;
	}
	
	//display the data
	@Override
	public void display() {
		ll.display();
		
	}

	//checking is queue full
	@Override
	public void isFull() {
		if(!ll.isFull())
		{
			System.out.println("Queue is Not full");
		}
		
	}
	
	// Checking empty or not
	@Override
	public void isEmpty() {
		if(ll.isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		
	}

}
