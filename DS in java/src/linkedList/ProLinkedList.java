package linkedList;
import java.util.*;

public class ProLinkedList extends Thread {
	//Initalizing the Linked list
	LinkedList<Integer>  link1 = new LinkedList<>(); 
	
	//Adding in the linkedlist 
	public boolean addIn(int data) {		
		if(link1.add(data)== true ) { return true; }
		else { return false; }		
	}
	//Removing from the linkedlist
	public boolean removeIt(int data) {
		boolean status = false;
		for(int i = 0 ; i<link1.size() ;i++) { if(i == data) { link1.remove(data); status = true; }}
		return status;		
	}
	//Finding in the linkedlist
	public boolean findIt(int data) {
		boolean status = false;
		for(int i = 0 ; i<link1.size() ;i++) { if(i == data) { status = true; }}
		return status;		
	}
	//Displaying the linkedlist
	public void displayIt() {
		for(int i =0 ; i<link1.size() ;i++) { System.out.println(i+",");	}
	}
	
	//Driver Code of the program
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int choose; 
		boolean status = false;
		ProLinkedList l1 = new ProLinkedList();
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Make a choose : \n 1. Add data \n 2.Remove data \n 3.Find data \n 4.Display List \n 5.EXiT \n ");
		choose = sc.nextInt();
		switch(choose) {
		case 1:
			System.out.println("Enter the  data to add in Linked List : ");
			int dataAdd = sc.nextInt();
			if(l1.addIn(dataAdd)== true) {
				System.out.println(dataAdd+" is sucessfully Added in Linked List");				
			}
			else {
				System.out.println("Some thing went wrong with it!!");
			}
			break;
		
		case 2: 
			System.out.println("Enter the  data to remove in Linked List : ");
			int dataRemove = sc.nextInt();
			if(l1.removeIt(dataRemove)== true) {
				System.out.println(dataRemove+" is sucessfully removed from Linked List");				
			}
			else {
				System.out.println("Some thing went wrong with it!!");
			}
			break;
		
		case 3 : 
			System.out.println("Enter the  data to remove in Linked List : ");
			int dataFind = sc.nextInt();
			if(l1.findIt(dataFind)== true) {
				System.out.println(dataFind+" is sucessfully removed from Linked List");				
			}
			else {
				System.out.println("Some thing went wrong with it!!");
			}
			break;
			
		case 4 :
			System.out.println("Displaying the data Linked List");
			l1.displayIt();
			break;		
			
		case 5 :
			status = true;
			
		}	
		}while(status == true);	 
	}
}
