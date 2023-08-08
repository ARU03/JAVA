package printing;

//  55555
//   4444
//    333
//     22
//      1

import java.util.Scanner;

public class Pyd2num3 {
	public static void main(String[] args) {
		int k=5;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Row Number Here: ");
		int r = sc.nextInt();
		for (int i=1; i<=r; i++) {
			for (int s=1; s<=i; s++)
				System.out.print(" ");
			for (int j=1; j<=r+1-i; j++) {
				System.out.print(k);
			}
			k = k-1;
			System.out.println();
		}
	}

}
