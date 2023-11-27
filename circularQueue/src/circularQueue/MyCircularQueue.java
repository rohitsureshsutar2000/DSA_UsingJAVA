package circularQueue;

import java.util.Arrays;

public class MyCircularQueue {
	private int size;
	private int[] arr;
	private int front;
	private int rear;
	
	MyCircularQueue(int size)
	{
		this.size=size;
		front=-1;
		rear=-1;
		arr= new int[size];
	}
	
	public boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
		}
		return false;
	}
	public boolean isfull()
	{
		return (rear+1)%size==front;
	}
	public void enQueue(int a)
	{
		if(!isfull())
		{
			if(front==-1)
			{
				front=0;
			}
			rear=(rear+1)%size;
			arr[rear]=a;
			System.out.println("Data inserted...");
		}
		else
		{
			System.out.println("full...");
		}
	}
	public void deQueue()
	{
		
		if(!isEmpty())
		{
			if(front==rear)
			{
				System.out.println(arr[front]);
				front=rear=-1;
				
			}
			System.out.println(arr[front++]+" deleted...");
		}
		
		else
		{
			System.out.println("it is empty");
		}
		
	}

	@Override
	public String toString() {
		return "MyCircularQueue [size=" + size + ", arr=" + Arrays.toString(arr) + ", front=" + front + ", rear=" + rear
				+ "]";
	}
	
	
	
	
}
