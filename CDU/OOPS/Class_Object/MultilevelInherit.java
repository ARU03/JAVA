package OOPS.Class_Object;

import java.util.Scanner;

public class MultilevelInherit {
	public static void main(String[] args) {
		c obj=new c();
		obj.input();
		obj.getdata();
		obj.add();
	}

}
class a{
	int a;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your first Value Here: ");
		a = sc.nextInt();
	}
}
class b extends a{
	int b;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Second Number Here: ");
		b = sc.nextInt();
	}
}
class c extends b{
	void add() {
		System.out.println("The Sum of Two Value is : "+(a+b));
	}
}
