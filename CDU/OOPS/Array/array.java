package OOPS.Array;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		int a[] = new int [10];
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<10; i++) {
			System.out.print("Enter Your Array Here: ");
			a[i]=sc.nextInt();
		}
		for (int i=0; i<10; i++)
			System.out.print(a[i]+" ");
	}
}
