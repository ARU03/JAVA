package Max_Num;

import java.util.Scanner;

public class three_num {
	public static void main(String[] args)
	{
		int a, b, c;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your First Number: ");
		a = obj.nextInt();
		System.out.println("Enter Your Second Number: ");
		b = obj.nextInt();
		System.out.println("Enter Your Third Number: ");
		c = obj.nextInt();
		if (a>b && a>c)
			System.out.println("Max Number is: "+a);
		else if (b>a && b>c)
			System.out.println("Max Number is: "+b);
		else
			System.out.println("Max Number is: "+c);
	}

}
