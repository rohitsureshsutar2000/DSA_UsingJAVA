package com.demo.test;

import java.util.Scanner;

import com.demo.service.Service;
import com.demo.service.ServiceImpl;

public class testQueue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Service serv=new ServiceImpl();
		System.out.println("Hello Everyone...");
		System.out.println();
		System.out.println("Menu");
		
		int ch=0;
		
		// Switch case for different choises
		while(ch!=6)
		{	
			System.out.println("1. Insert data\n2. Remove element from Queue");
			System.out.println("3. Print element of Queue\n4. Check if queue is full");
			System.out.println("5. Check if queue is empty\n6. Exit");
			ch=sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter String:\n");
				String s=sc.nextLine();
				serv.insert(s);
				break;
			case 2:
				String st=serv.delete();
				System.out.println(st+"\nLength of the string: "+st.length());
				break;
			case 3:
				serv.display();
				
				break;
			case 4:
				
				serv.isFull();
				break;
			case 5:
				serv.isEmpty();
				break;
			
			default:
				System.out.println("Wrong choise!!!");
				break;
			}
		}
	}

}
