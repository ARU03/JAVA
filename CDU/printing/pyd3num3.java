package printing;

//23456789
//345678
// 4567
//  56

import java.util.Scanner;

public class pyd3num3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Row Number Here: ");
		int r = sc.nextInt();
		for (int i=1; i<=r; i++) {
			for (int s=1; s<i; s++)
				System.out.print(" ");
			for (int j=1; j<2*(r-i)+1; j++) {
				System.out.print(j+i);
			}
			System.out.println();
		}
	}

}
