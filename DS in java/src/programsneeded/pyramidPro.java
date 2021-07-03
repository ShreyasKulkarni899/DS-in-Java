package programsneeded;

import java.util.Scanner;

public class pyramidPro {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows wanted : ");
		int rows = sc.nextInt();
		noramlPyramid(rows,false);
		noramlPyramid(rows,true);
		reversePyramid(rows,false);
		reversePyramid(rows,true);
		hyPyramid(rows,false);
		hyPyramid(rows,true);
		reverseHyPyramid(rows,false);
		reverseHyPyramid(rows,true);
		
	}
	
	//method for the normalPyramid printing from given rows
	public static void noramlPyramid(int rows,boolean status) {
		System.out.println("  Normal Pyramid   ");
		for(int i =0 ;i < rows;i++) {
			for(int j = 0; j<=i ;j++) {
				if(status == true) {System.out.print(i);
				}else {System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	//method for the reversePyramid printing from given rows
	public static void reversePyramid(int rows,boolean status) {
		System.out.println("  Reverse Pyramid   ");
		for(int i = rows;i>=0;i--) {
			for(int j = 0;j<=i;j++) {
				if(status ==true) {System.out.print(i);
				}else {System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	//method for hybird Pyramid printing from given rows
	public static void hyPyramid(int rows,boolean status) {
		System.out.println("  HyPyramid   ");
		for(int i =0;i<=rows;i++) {
			for(int j = rows; j>i;j--) {System.out.print(" ");
			}
			for(int k =1;k<=i;k++) {
				if(status == true) {System.out.print(i+" ");
				}else {System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
	
	//method for hybird Pyramid printing reverse from given rows
	public static void reverseHyPyramid(int rows,boolean status) {
		System.out.println("    Reverse HyPyramid   ");
		for(int i = rows;i>=0;i--) {
			for(int j=rows;j>i;j--) {System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				if(status == true) {System.out.print(i+" ");
				}else {System.out.print("*"+ " ");
				}
			}
			System.out.println();
		}
	}
}
