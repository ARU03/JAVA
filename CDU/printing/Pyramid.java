package printing;
//
//                   *
//                  **
//                 ***
//                ****
//               *****
import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Rows Here : ");
		int r = sc.nextInt();
		for (int i=1; i<=r; i++) {
			for (int s=1; s<=r-i; s++)
				System.out.print(" ");
				for (int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}
}
