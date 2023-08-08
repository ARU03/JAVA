package OOPS.Array;

import java.util.Scanner;

public class SumofAray {
	public static void main(String[] args) {
		int size, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Array size Here: ");
		size = sc.nextInt();
		int a[] = new int [size];
		for (int i=0; i<size; i++) {
			System.out.print("Enter Your Number Here : ");
			a[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++)
			sum += a[i];
		System.out.print("The Sum of Array is: "+sum);
	}

}
