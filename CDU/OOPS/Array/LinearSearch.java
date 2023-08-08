package OOPS.Array;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		linear aa=new linear();
		aa.getdata();
		aa.search();
	}

}

class linear{
	int a[] = new int [10]; int key;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<10; i++) {
			System.out.print("Enter You Arry Numbers Here: ");
			a[i] = sc.nextInt();
		}
		System.out.print("Enter Your Number to Search Here: ");
		key = sc.nextInt();
		
	}
	void search() {
		int flag = 0, pos=0;
		for (int i=0; i<=10 && flag ==0; i++ ) {
			if (a[i]==key) {
				flag = 1;
				pos = i+1;
			}
		}
		if (flag==1)
			System.out.println("The Numbeer found at position: "+pos);
		else
			System.out.print("The Number is doesn't Matched in this Array.");
	}
}
