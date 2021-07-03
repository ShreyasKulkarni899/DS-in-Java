package staticDynamicArray;

import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Array <T> implements Iterable <T> {
	
	private T [] arr;
	private int len=0;
	private int capacity=0;
	
	public Array() { this(16); }
	
	
	public Array(int capacity) {
		if(capacity < 0)throw new IllegalArgumentException("Illegal Capacity" + capacity);
		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
	}
	//for getting the size of array
	public int size() {return len; }
	public boolean isEmpty() {return size() == 0; }
	
	//for the getting the data in particular index
	public T get(int index) {return arr[index];}
	//for setting the data in particular index with elem
	public void set(int index,T elem) {arr[index] = elem;}
	
	//for clearing the data in array
	public void clear() {
		for(int i =0;i<capacity;i++) {
			arr[i]=null;
		}
		len = 0;
	}
	
	//for adding the data in array
	public void add(T elem) {
		
		//Time to resize the array
		if (len +1 >= capacity) {
			if (capacity == 0) capacity=1;
			else capacity *= 2; //this is for doubling of the sixe of the array
			T[] new_arr = (T[]) new Object[capacity];
			for(int i = 0; i<len; i++) {
				new_arr[i]=arr[i];
			}
			arr = new_arr; //arr has extra null padded
		}
	arr[len++] = elem;
	}
	
	//for removing the element from paticular place from array
	public T removeAt(int rm_index) {
		if (rm_index >= len && rm_index < 0)throw new IndexOutOfBoundsException();
		T data =arr[rm_index];
		T[] new_arr = (T[]) new Object[len-1];
		for(int i=0,j=0;i<len;i++,j++) 
			if(i == rm_index) j--;//skiping the given index
			else new_arr[j] = arr[i];
		arr = new_arr;
		capacity = --len;
		return data;
	}
	
	//for searching the particular data from array and sending its index to remove
	public boolean remove(Object obj) {
		for(int i =0;i< len;i++) {
			if (arr[i].equals(obj)) {
				removeAt(i); return true;}}
		return false;
	}
	
	//
	public int indexOf(Object obj) {
		for(int i =0;i <len;i++) 
			if(arr[i].equals(obj))
				return i;
		return -1;
	}
	
	public boolean contains(Object obj) {
		return indexOf(obj) != -1;
	}
	
	@Override public java.util.Iterator<T> iterator() {
		return new java.util.Iterator <T>() {
			int index = 0;
			public boolean hasNext() { return index < len;	}
			public T next() { return arr[index++];}
		};
	}
	
	@Override public String toString() {
		if(len == 0) return "[]";
		else {
			StringBuffer sb =new StringBuffer(len).append("[");
			for(int i=0;i<len-1;i++)
				sb.append(arr[i]+",");
			return sb.append(arr[len-1]+"]").toString();
		}
	}
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the capacity");
		int capacity_length = sc.nextInt();
		Array<Object> arr = new Array<Object>(capacity_length);
		System.out.println("Add the first number in array");
		int data = sc.nextInt();
		arr.add(data);
		arr.toString();
		
		
	}

}

