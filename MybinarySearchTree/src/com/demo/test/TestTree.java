package com.demo.test;

import com.demo.beans.MyLinkedList;

public class TestTree {
	public static void main(String[] args)
	{	
		//create Linked list object
		MyLinkedList LL=new MyLinkedList();
		int[] arr= {45,12,34,10,51,8,52,59,50};
		//adding element
		for (int i=0;i<arr.length;i++)
		{
			int a=arr[i];
			LL.addNewNode(a);
			
		}
		
		//calling preorder treaversal function
		LL.preorder();
	}
}
