package printing;

//       2
//      23
//     345
//    5678
//   678910

import java.util.Scanner;
public class NumPyramid3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Row Number Here : ");
		int r = sc.nextInt();
		for (int i=1; i<=r; i++) {
			for (int s=1; s<=r-i; s++)
				System.out.print(" ");
			for (int j=1; j<=i; j++) {
				System.out.print(j+i);
			}
			System.out.println();
		}
	}

}
