package OOPS.Class_Object;

import java.util.Scanner;

public class add{
	int a, b;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your First Number Here: ");
		a = sc.nextInt();
		System.out.print("Enter Your Second Number Here: ");
		b = sc.nextInt();
	}
	void putdata() {
		System.out.println("Addition = "+(a+b));
	}
	public static void main(String[] args) {
		add aa=new add();
		aa.getdata();
		aa.putdata();
	}
}