package OOPS.Array;

import java.util.Scanner;

public class FrequencySearch {
	public static void main(String[] args)
	{
		bin aa=new bin();
		aa.getdata();
		aa.frequency();
	}

}

class bin{
	int a[] = new int [10];
	int key;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<10; i++)
		{
			System.out.print("Enter Your Array Numbers Here: ");
			a[i] = sc.nextInt();
		}
		System.out.print("Enter Your Frequency Search Number Here: ");
		key = sc.nextInt();
	}
	void frequency() {
		int count =0;
		for (int i=0; i<10; i++) {
			if (a[i]==key)
				count = count+1;
		}
		System.out.println("The Frequency count Number is : "+count);
	}
}
