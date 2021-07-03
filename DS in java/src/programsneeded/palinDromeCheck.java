package programsneeded;

import java.util.Scanner;

public class palinDromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the data to check palindrome : ");
		String data = sc.next();
		if(palinDo(data) == true) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("It is not Palindrome");
		}

	}
	public static boolean palinDo(String data) {
		boolean status = true;
		int inLength = data.length();
		for(int i =0;i< (inLength)/2;i++) {
			if(data.charAt(i) != data.charAt(inLength-i-1)) {
				status = false;
				break;
			}
		}
		return status;
	}
}
