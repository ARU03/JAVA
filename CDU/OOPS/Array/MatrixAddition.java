package OOPS.Array;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		addition aa=new addition();
		aa.getdata();
		aa.add();
		aa.putdata();
	}

}
class addition{
	int a[][] = new int [3][3];
	int b[][] = new int [3][3];
	int c[][] = new int [3][3];
	void getdata() {
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("Enter Your Array Numbers Here: ");
				a[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("Enter Your Arrays Here: ");
				b[i][j] = sc.nextInt(); 
			}
		}
	}
	void add() {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
	}
	void putdata() {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(c[i][j]+"    ");
			}
			System.out.println();
		}
	}
}
