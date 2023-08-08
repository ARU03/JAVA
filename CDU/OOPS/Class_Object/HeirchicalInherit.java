package OOPS.Class_Object;

import java.util.Scanner;

public class HeirchicalInherit {
	public static void main(String[] args) {
		B aa=new B();
		C bb=new C();
		aa.input();
		aa.add();
		bb.input();
		bb.substract();
		
	}

}
class A{
	int a, b;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your first Number Here: ");
		a = sc.nextInt();
		System.out.print("Enter Your Second Number :");
		b = sc.nextInt();
	}
}
class B extends A{
	void add() {
		System.out.println("The Sum of Two Number is: "+(a+b));
	}
}
class C extends B{
	void substract() {
		System.out.println("The Susbstraction of Two Number is: "+(a-b));
	}
}
