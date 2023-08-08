package OOPS.Array;

import java.util.Scanner;

public class ProductofArray {
	public static void main(String[] args) {
		int size, pro=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Array Size Here: ");
		size = sc.nextInt();
		int a[] = new int [size];
		for (int i=0; i<size; i++) {
			System.out.print("Enter The Number Here: ");
			a[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++)
			pro *= a[i];
		System.out.print("The Product of Array: "+pro);
	}
}
