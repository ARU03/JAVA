package OOPS.Array;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		multiply aa=new multiply();
		aa.getdata();
		aa.putdata();
		aa.multiply();
		
	}

}
class multiply{
	int a[][] = new int [3][3];
	int b[][] = new int [3][3];
	int c[][] = new int [3][3];
	void getdata() {
		Scanner sc=new Scanner(System.in);
		int i, j;
		System.out.println("The Element For Matrix A");
		for ( i=0; i<3; i++)
			for ( j=0; j<3; j++)
			{
				System.out.print("Enter Your Array Numbers Here:");
				a[i][j] = sc.nextInt();
			}
		System.out.println("The Elements for Matrix B");
		for ( i=0; i<3; i++)
			for ( j=0; j<3; j++) {
				System.out.print("Enter Your Array Numbers Here: ");
				b[i][j] = sc.nextInt();
			}
	}
	void putdata() {
		int i, j;
		System.out.print("first Matrix is: ");
		for ( i=0; i<3; i++)
			for ( j=0; j<3; j++) {
				System.out.print(a[i][j]+"    ");
			}System.out.println();
		System.out.println();
		System.out.print("Second Matrix is: ");
		for ( i=0; i<3; i++)
			for ( j=0; j<3; j++) {
				System.out.print(b[i][j]+"    ");
			}System.out.println();
	}
	void multiply() {
		int i, j, k;
		for ( i=0; i<3; i++)
			for (j=0; j<3; j++)
			{
				c[i][j] = 0;
				for (k=0; k<3; k++)
					c[i][j] = c[i][j]+a[i][k]*b[k][j];
			}
		System.out.print("Multiplication is: ");
		for (i=0; i<3; i++)
			for (j=0; j<3; j++)
				System.out.print(c[i][j]+"    ");
		System.out.println();
	}
}
