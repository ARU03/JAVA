package printing;

//      1
//     22
//    333
//   4444
//  55555

import java.util.Scanner;
public class NumPyramid2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Row Number Here: ");
		int r = sc.nextInt();
		for (int i=1; i<=r; i++) {
			for (int s=1; s<=r-i;s++)
				System.out.print(" ");
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
