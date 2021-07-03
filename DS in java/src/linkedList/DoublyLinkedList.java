package linkedList;

public class DoublyLinkedList {
	
	//instance variables
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode {
		private int data;
		private ListNode next;
		private ListNode prev;
		
		//ListNode's Constuctor
		public ListNode(int data) {
			this.data = data;
		}
		
	}
	
	//DoublyLinkedList's Constuctor
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	//isEmpty() method
	public boolean isEmpty() {
		return length == 0; // OR head == null
	}
	
	//length sending method
	public int lengthOf() {
		return length;
	}
	
	//insert at the end
	public void insertEnd(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			head = newNode;
		}else {
			tail.next = newNode;
		}
		newNode.prev = tail;
		tail = newNode;
		length ++;		
	}
	
	//insert at the particular data
	public void insertAt(int value , int afterThis) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			System.out.println("This Linked list is Empty");
		}else {
			ListNode trav = head;
			
			while(trav != null) {
				if(trav.data == afterThis) {
					ListNode temp = trav.next;
					trav.next = newNode;
					newNode.next = temp;
					newNode.prev = trav;
					temp.prev = newNode;
					length ++;
					break;
				}
				trav = trav.next;
			}			
		}
	}
	
	//removing from the the linked list
	public void removeSome(int value) {
		if(isEmpty()) {
			System.out.println("This list is Empty");
		}else {
			ListNode trav = head;
			while(trav != null) {
				if(trav.data == value) {
					ListNode tempPrev = trav.prev;
					ListNode tempNext = trav.next;
					tempPrev.next = tempNext;
					tempNext.prev = tempPrev;
					length --;
				}
				trav = trav.next;
			}
		}
	}
	
	//display forward the data in it
	public void displayForward() {
		if(head == null) {
			return;
		}
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	//display reverse the data init
	public void displayReverse() {
		if(tail == null) {
			return;
		}
		ListNode temp = tail;
		while(temp != null) {
			System.out.print(temp.data + "<--");
			temp = temp.prev;
		}
		System.out.println("null");
	}
	
	
	
	//driver code
	public static void main(String[] args) {
		DoublyLinkedList Listt = new DoublyLinkedList();
		//adding the data in it
		for(int i=0;i<10;i++) { Listt.insertEnd(i);	}
		Listt.displayForward();
		Listt.displayReverse();
		Listt.insertAt(12, 2);
		Listt.displayForward();
		Listt.displayReverse();
		Listt.removeSome(8);
		Listt.displayForward();
		Listt.displayReverse();
		
	
	}
}	