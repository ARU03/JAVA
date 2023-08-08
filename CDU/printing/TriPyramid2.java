package printing;

//     1
//    222
//   33333
//  4444444
// 555555555
import java.util.Scanner;

public class TriPyramid2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Row Numbers Here : ");
		int r = sc.nextInt();
		for (int i=1; i<=r; i++) {
			for (int s=1; s<=r-i; s++)
				System.out.print(" ");
			for (int j=1; j<=2*i-1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
