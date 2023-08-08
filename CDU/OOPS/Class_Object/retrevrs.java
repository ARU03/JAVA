package OOPS.Class_Object;

import java.util.Scanner;

public class retrevrs{
	public static void main(String[] args) {
		int m, val; 
		ret aa=new ret();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Value Here: ");
		m = sc.nextInt();
		aa.getdata(m);
		val= aa.putdata();
		System.out.println("The Reverse Number is : "+val);
	}
}

class ret {
	int n;
	void  getdata(int i) {
		n = i;
	}
	void putdata() {
		int rev=0;
		while(n>0) {
			rev = (rev*10)+(n%10);
			n = n/10;
		}
		return (rev);
	}
		
}
