package stack;

public class stackJava {
	
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	
	//constructor of stackJava
	public stackJava() {
		top= -1;
	}
	
	//isEmpty method for checking stack is empty
	public boolean isEmpty() {
		return(top < 0);
	}
	
	//push method for pushing in stack
	public boolean push(int value) {
		if(top >= (MAX-1)) {
			System.out.println("Stack Overflow");
			return false;
		}else {
			a[++top] = value;
			System.out.println( value +" pushed into stack");
			return true;
		}
	}
	
	//pop method for poping the stack
	public int pop() {
		if(top < 0) {
			System.out.println("Stack is underflow");
			return 0 ;
		}else {
			int value = a[top--];
			return value;
		}
	}
	
	//check method for the checking the top
	public int peek() {
		if(top < 0) {
			System.out.println("Stack Underflow");
			return 0 ;
		}else {
			int value= a[top];
			return value;
		}
	}
	
	//Driver Code
	public static void main(String[] args) {
		stackJava stackMain = new stackJava();
		stackMain.push(10);
		stackMain.push(20);
		stackMain.push(30);
		System.out.println( stackMain.pop() +" Popped from stack");
		System.out.println( stackMain.pop() +" Popped from stack");
		System.out.println( stackMain.pop() +" Popped from stack");
		System.out.println( stackMain.pop() +" Popped from stack");
		
	}
}
