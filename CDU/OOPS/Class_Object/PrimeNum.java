package OOPS.Class_Object;

//import java.util.Scanner;
//
//public class PrimeNum {
//	int n;
//	void getdata() {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter Your Number Here: ");
//		n = sc.nextInt();
//	}
//	void putdata() {
//		int i, count=0;
//		for (i=1; i<=n; i++) {
//			if (n%i==0)
//				count += 1;
//		}
//		if (count==2)
//			System.out.println("It is a Prime Number");
//		else
//			System.out.print("It is Not a Prime Number");
//	}
//	public static void main(String[] args) {
//		PrimeNum aa=new PrimeNum();
//		aa.getdata();
//		aa.putdata();
//	}
//
//}

import java.util.Scanner;
class PrimeNum{
	public static void main(String[] args) {
		prime obj=new prime();
		obj.getdata();
		obj.putdata();
		
	}
}
class prime{
	int n;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Number Here: ");
		n = sc.nextInt();
	}
	void putdata() {
		int i , count=0;
		for (i=1; i<=n; i++) {
			if (n%i==0)
				count += 1;
		}
		if (count==2)
			System.out.print("It is a prime Number");
		else
			System.out.print("It is not Prime Number");
	}
}
