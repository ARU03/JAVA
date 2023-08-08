package printing;

//      *****
//       ****
//        ***
//         **
//          *

import java.util.Scanner;

public class Pyramid2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Row Number Here: ");
		int r = sc.nextInt();
		for (int i=1; i<=r; i++) {
			for (int s=1; s<i; s++)
				System.out.print(" ");
			for (int j=1; j<=r+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
