package OOPS.Array;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		insertion aa=new insertion();
		aa.getdata();
		System.out.print("The Unsorted Arrays are:");
		aa.putdata();
		System.out.print("\nThe Sorted Arrays are: ");
		aa.sort();
		aa.putdata();
	}

}
class insertion{
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
		for (int i=1; i<10; i++) {        // Because the i started from index a[1] & j is a[0];
			int val = a[i];
			int j = i-1;
			while (val<a[j]) {
				a[j+1] = a[j];
				j--;
				if (j==-1)
					break;
			}
			a[j+1]=val;                 // a[j=1] + a[j+1] = a[0] so the -j value will be stored at a[0];
		}
	}
}
