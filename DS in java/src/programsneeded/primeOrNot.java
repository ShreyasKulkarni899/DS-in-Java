package programsneeded;

public class primeOrNot {
	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primeCheck(10));
		System.out.println(primeCheck(7));
		//print prime number from 1 to 100
		for(int i=2;i<=100;i++) {
			if(primeCheck(i)== true) {
				System.out.print(i + " ");
			}
		}

	}
	//method for checking the prime or not
	public static boolean primeCheck(int value) {
		if(value == 0 || value == 1) {
			return false;
		}
		if(value == 2) {
			return true;
		}
		for(int i = 2;i <= value/2;i++) {
			if(value % i==0) {
				return false;
			}
		}
		return true;
	}
	
}
