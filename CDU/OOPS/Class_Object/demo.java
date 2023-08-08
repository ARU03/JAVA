package OOPS.Class_Object;

import java.util.Scanner; 

public class demo{
	public static void main(String[] args) {
		addition aa=new addition();
		aa.getdata();
		aa.putdata();
	}
}
class addition {
	int a, b;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your first Number: ");
		a = sc.nextInt();
		System.out.print("Enter Your Second Number: ");
		b = sc.nextInt();
	}
	void putdata() {
		System.out.print("The Addition of Two Digits is : "+(a+b));
	}

}
