package linkedList;

public class CircleLinkedList {
	
	private ListNode beginNode;
	private ListNode endNode;
	private int length;
	private class ListNode{
		private int data;
		private ListNode next;
		
		//Construtor for the listNode
		private ListNode(int data) {
			this.data = data;			
		}
	}
	
	//Constuctor for the CircleLinkedList
	public CircleLinkedList() {
		this.beginNode = null;
		this.endNode = null;
		this.length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int isLength() {
		return length;
	}
	
	public void insertEnd(int value) {
		ListNode Node = new ListNode(value);
		if(isEmpty() == true) {
			beginNode = Node;
			beginNode.next = endNode;
		}else {
			endNode.next = Node;
		}
		endNode = Node;		
		endNode.next = beginNode;
		length ++;
	}
	
	public void insertAt(int value , int afterThis) {
		boolean status =  false; 
		ListNode Node = new ListNode(value);
		if(isEmpty() == true) {
			System.out.println("This List is empty");
		}else {
			ListNode travNode = beginNode;
			while(travNode != endNode) {
				if(travNode.data == afterThis) {
					ListNode tempNode = travNode.next;
					travNode.next = Node;
					Node.next = tempNode;
					length ++;
					status = true;
					break;
				}
				travNode = travNode.next;
			}
			//for results
			if(status == true) {System.out.println("Sucessfully added the value");}else { System.out.println("This number is not present in list");}
		}
	}
	
	//removing 1st from the list
	public void removeFirst() {
		if(isEmpty() == true) {
			System.out.println("This List is Empty");
		}else {
			ListNode temp = beginNode;
			beginNode = temp.next;
		}
	}
	
	//Display the List
	public void displayIt() {
		if(isEmpty()== true) {
			System.out.println("This List is Empty!!");
		}else {
			ListNode trav = beginNode;
			while(trav != endNode) {
				System.out.print(trav.data +"-->");
				trav = trav.next;
			}
			System.out.println("-->pointing to head");
		}
	}
	
	//display in reverse
	public void displayRevese() {
		if(isEmpty()==true) {
			System.out.println("This List in Empty"); 
		}else {
			ListNode trav = endNode;
			while(trav != beginNode) {
				System.out.print(trav.data+"<--");
			}
			
		}
	}
	//Driver code
	public static void main(String[] args) {
		CircleLinkedList Listt = new CircleLinkedList();
		for(int i = 0 ; i<10 ; i++) {
			Listt.insertEnd(i);
		}
		Listt.displayIt();
		Listt.displayRevese();
		Listt.insertAt(22,8);
		Listt.displayIt();
		Listt.displayRevese();
		Listt.removeFirst();
		Listt.displayIt();
		Listt.displayRevese();
	}
}
