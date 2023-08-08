package OOPS.Class_Object;

// ############ Passing Arguement to function in Class & Object ####################

import java.util.Scanner;

public class reverse {
	int n;
	void getdata(int i) {
		n = i;
	}
	void putdata() {
		int rev = 0;
		while (n>0)
		{
			rev = (rev*10)+(n%10);
			n= n/10;
		}
		System.out.println("The Reverse Value is: "+rev);
	}
	public static void main(String[] args) {
		reverse aa=new reverse();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Number Here: ");
		int m = sc.nextInt();
		aa.getdata(m);
		aa.putdata(); 
		
	}

}
