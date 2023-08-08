package printing;

//     1
//    123
//   12345
//  1234567
// 123456789

import java.util.Scanner;

public class TriPyramidNumerical {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Row Numbers Here: ");
		int r= sc.nextInt();
		for (int i=1; i<=r; i++) {
			for (int s=1; s<=r-i; s++)
				System.out.print(" ");
			for (int j=1; j<=2*i-1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
