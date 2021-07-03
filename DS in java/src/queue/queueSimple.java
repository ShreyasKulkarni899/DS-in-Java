package queue;

public class queueSimple {
	//Array for storing the queue
	private int arr[];
	private int front;
	private int rear;
	//maximum
	private int capacity;
	//current size of the queue
	private int count;
	
	
	//Constructor for the queueSimple
	queueSimple(int inSize){
		arr = new int[inSize];
		capacity = inSize;
		front = 0;
		rear = -1;
		count = 0;
	}
	
	//method for checking the size of the queue
	public int size() {
		return count;
	}
	//method for checking if the queue is empty or not in boolean
	public Boolean isEmpty() {
		return (size()==0);
	}
	//method for checking if the queue is full or not in boolean
	public Boolean isFull() {
		return (size()== capacity);
	}
	
	//Method for taking out the element from queue
	public void dequeue() {
		if(isEmpty() == true) {
			System.out.println("Underflow\n Program terminted");
			System.exit(1);
		}
		System.out.println("Removing" + arr[front]);
		front = (front+1)%capacity;
		count--;
	}
	
	//Method for entring the new element in queue
	public void enequeue(int item) {
		if(isFull()== true) {
			System.out.println("Overflow\n Program terminated");
			System.exit(1);
		}
		System.out.println("Inserting "+ item);
		rear = (rear +1)%capacity;
		arr[rear] = item;
		count++;
	}
	
	//Method to display the element from queue
	public int peek() {
		if(isEmpty()==true) {
			System.out.println("Underflow\n Program Terminated");
			System.exit(1);
		}
		return arr[front];
	}
	
	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueSimple sq = new queueSimple(5);
		sq.enequeue(1);
		sq.enequeue(2);
		sq.enequeue(3);
		sq.enequeue(4);
		sq.enequeue(5);
		System.out.println("The Front is "+ sq.peek());
		sq.dequeue();
		System.out.println("The Front is "+ sq.peek());
		sq.dequeue();
		sq.dequeue();
		sq.dequeue();
		sq.dequeue();
		if(sq.isEmpty()== true) {
			System.out.println("The queue is Empty");
		}else {
			System.out.println("The queue is not empty");
		}
		System.out.println("The Front is "+ sq.peek());
	}

}
