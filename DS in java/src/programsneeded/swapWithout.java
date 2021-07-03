package programsneeded;

public class swapWithout {
	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ans = swapHere(100,50);
		System.out.println("a = " + ans[0]);
		System.out.println("b = " + ans[1]);
	}
	//method for swapping the number without 3rd variable
	public static int[] swapHere(int a , int b) {
		int[] ans = new int[2];
		b = b+a;
		a = b-a;
		b = b-a;
		ans[0] = a;
		ans[1] = b;
		return ans;
	}

}
