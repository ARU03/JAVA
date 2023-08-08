package OOPS;

import java.util.Scanner;

public class Programs {
	public static void main(String[] args)
	{
		demo aa=new demo();
		aa.getdata();
		aa.sumofdigits();
	}

}
class demo{
	int i;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Data: ");
		i = sc.nextInt();
	}
	void sumofdigits()
	{
		int sum=0;
		while (i>0)
		{
			sum = sum+i%10;
			i= i/10;
		}
		System.out.println("Sum of digits = "+sum);
	}
}

