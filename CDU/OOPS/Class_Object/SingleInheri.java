package OOPS.Class_Object;

import java.util.Scanner;

public class SingleInheri {
	public static void main(String[] args) {
		B aa=new B();
		aa.input();
		aa.getdata();
		aa.add();
		aa.display();
		
	}
}
class A{
	int a, b;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your First Number: ");
		a = sc.nextInt();
		System.out.print("Enter Your Second Number: ");
		b = sc.nextInt();
	}
	void add() {
		System.out.println("The Sum of a and b : "+(a+b));
	}
}
class B extends A{
	int c;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your New "
				+ "Number Here: ");
		c = sc.nextInt();
	}
	void display() {
		System.out.print("The Sum of Three Numbers : "+(a+b+c));
	}
}
