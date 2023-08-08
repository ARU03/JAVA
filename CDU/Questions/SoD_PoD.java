package Questions;

// ########################### Sum of Even Digit & Product of Odd Digit  ########################

import java.util.Scanner;

public class SoD_PoD {
	public static void main(String[] args)
	{
		int n, sum=0, pro=1, digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		while (n>0)
		{
			digit = n%10;
			if (digit%2==0)
				sum = sum+digit;
			else
				pro = pro*digit;
			n = n/10;
		}
		System.out.println("The Sum of Even digit Is: "+sum
				+"\nProduct of Odd Digit Is: "+pro);
	}

}
