package SingleLL;

public class linkedListTest {
	public static void main(String[] args) {
		LinkedList ob=new LinkedList();
		ob.addInLinkedList(10);
		ob.addInLinkedList(20);
		ob.addInLinkedList(30);
		ob.addInLinkedList(40);
		
		ob.display();
		System.out.println("add by position");
		ob.insertByPosition(50, 2);
		ob.display();
	}
}
