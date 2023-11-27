package circularQueue;

public class testCirQue {

	public static void main(String[] args) {
		MyCircularQueue ob=new MyCircularQueue(4);
		ob.enQueue(10);
		ob.enQueue(20);
		ob.enQueue(30);
		ob.enQueue(60);
		ob.enQueue(50);
		

		System.out.println(ob);
		ob.deQueue();
		ob.enQueue(50);
		System.out.println(ob);
	}

}
