package OOPS.Array;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Binary aa=new Binary();
		aa.getdata();
		aa.search();
	}

}
class Binary{
	int a[] = new int [10];
	int key;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<10; i++) {
			System.out.print("Enter Your Array Numbers Here : ");
			a[i] = sc.nextInt();
		}
		System.out.print("Enter Your key Search Number Here : ");
		key = sc.nextInt();
	}
	void search() {
		int i=0, j=9, flag=0, mid, pos=0;
		while ( i<=j && flag==0) {
			mid = (i+j)/2;
			if (a[mid] == key)
			{
				flag = 1;
				pos = mid+1;
			}
			if (a[mid]>key)
				j = mid-1;
			if (a[mid]<key)
				i = mid+1;
		}
		if (flag==0)
			System.out.print("The Search Key Number is not Found");
		else
			System.out.print("The Search key Number is Found at Position: "+pos);
		
	}
}
