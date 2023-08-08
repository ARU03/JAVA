package OOPS.Array;

import java.util.Scanner;

public class BubbleSortArray {
	public static void main(String[] args) {
		Bubble aa=new Bubble();
		aa.getdata();
		System.out.println("The Unsorted Arrays are: ");
		aa.putdata();
		System.out.print("\nThe Sorted Arrays are: ");
		aa.sort();
		aa.putdata();
	}

}

class Bubble{
	int a[] = new int [10];
	void getdata() {
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<10; i++) {
			System.out.print("Enter Your Array Numbers Here: ");
			a[i] = sc.nextInt();
		}
	}
	void putdata() {
		for (int i=0; i<10; i++)
			System.out.print(a[i]+" ");
	}
	void sort() {
		for (int i=0; i<10; i++) {
			for (int j=0; j<9-i; j++)
			{
				if (a[j]>a[j+1])
				{
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
}
