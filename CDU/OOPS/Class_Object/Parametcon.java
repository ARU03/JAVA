package OOPS.Class_Object;

import java.util.Scanner;

public class Parametcon {
	public static void main(String[] args) {
		//for default constructor calling
//		addition aa=new addition();
//		aa.disp();
//		aa.input();
//		aa.output();
		
		/// for parameterized constructor calling
		addition bb=new addition();
		bb.disp();
		bb.output();
	}

}

class addition{
	int a, b;
	addition(){
		a=0;
		b=0;
	}
	addition(int x, int y){
		a = x;
		b = y;
	}
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your First Number Here: ");
		a = sc.nextInt();
		System.out.print("Enter Your Second Number Here: ");
		b = sc.nextInt();
	}
	void disp() {
		System.out.println("a="+a+" b= "+b);
	}
	void output() {
		int c;
		c = a+b;
		System.out.print("Addition =" +c);
	}
}
