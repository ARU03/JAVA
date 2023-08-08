package printing;

//          *
//         ***
//        *****
//       *******
//      *********
//       *******
//        *****
//         ***
//          *

import java.util.Scanner; 

public class Pyramid4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Rows Here: ");
		int r= sc.nextInt();
		for (int i=1; i<=r; i++) {
			for (int s=1; s<=r-i; s++)
				System.out.print(" ");
			for (int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		r = r-1;
		for (int i=1; i<=r; i++) {
			for (int s=1; s<=i; s++ )
				System.out.print(" ");
			for (int j=1; j<=2*(r-i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
	    }
    }
}
