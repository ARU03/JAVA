package OOPS.Array;

import java.util.Scanner;

public class TwodimArray {
	public static void main(String[] args) {
		twodim aa=new twodim();
		aa.getdata();
		aa.putdata();
	}

}
class twodim{
	int a[][] = new int [3][3];
	void getdata() {
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++)
			{
				System.out.print("Enter Your Array Numbers Here: ");
				a[i][j] = sc.nextInt();
			}
		}
	}
	void putdata() {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++)
			{
				System.out.print(a[i][j]+"    ");
			}
			System.out.println();
		}
	}
}
