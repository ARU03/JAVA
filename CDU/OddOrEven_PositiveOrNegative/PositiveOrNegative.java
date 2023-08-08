package OddOrEven_PositiveOrNegative;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args)
	{
		int a;
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter Your Number Here: ");
		a = obj.nextInt();
		if (a>0)
			System.out.println("It is a positive Number");
		else if (a<0)
			System.out.println("It is a Negative Number");
		else
			System.out.println("It is Zero");
	}

}
