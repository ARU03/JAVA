package printing;

//111111111
//2222222
// 33333
//  444
//   5
import java.util.Scanner;

public class Pyd3num2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Row Number Here: ");
		int r = sc.nextInt();
		for (int i=1; i<=r; i++)  {
			for (int s=1; s<i; s++)
				System.out.print(" ");
		for (int j=1; j<=2*(r-i)+1; j++) {
			System.out.print(i);
		}
		System.out.println();
	 }
	}

}
