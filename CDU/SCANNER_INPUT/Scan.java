package SCANNER_INPUT;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args)
	{
		int a, b, c;
		Scanner obj= new Scanner (System.in);
		System.out.println("Enter Your First Number Here:");
		a = obj.nextInt();
		System.out.println("Enter Your Second Number Here: ");
		b = obj.nextInt();
		c = a+b;
		System.out.println("The Sum of a+b is: "+c);
	}

}
