package SingleLL;

public class LinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int val){
			data=val;
			next=null;
		}
	}
	
	public void addInLinkedList(int data) {
		Node newnode = new Node(data);
		Node temp=head;
		if(temp==null) {
			head=newnode;
			
			return;
		}
		
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			
		
		
		
	}
	public void insertByPosition(int data,int pos) {
		
		Node temp=head;
		Node newnode = new Node(data);
		int a=1;
		int size=1;
		Node temp2=head;
		while(temp2.next!=null) {
			temp2=temp2.next;
			size++;
		}
		if(pos>size+1) {
			System.out.println("Invalid position");
			return;
		}
		
		if(head==null && pos==1) {
			head=newnode;
		}
		if(head!=null && pos==1) {
			newnode.next=head;
			head=newnode;
		}
		else {
			while(a < pos-1) {
				a++;
				temp=temp.next;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
		
		
		
	}
	public void deleteByPosition(int data,int pos) {
		
	}
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		
		return false;
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
}
