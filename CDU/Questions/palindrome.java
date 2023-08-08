package Questions;

// ###################### Write a program Whether Check it is palindrome or not...??? #####################

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int n, rev= 0, z;
		System.out.println("Enter Your Number Here: ");
		n = sc.nextInt();
		z = n;
		while (n>0)
		{
			rev = rev*10+n%10;
			n = n/10;
		}
		if (rev==z)
			System.out.println("It is a Palindrome Number.");
		else 
			System.out.println("It is Not a Palindrome Number.");
	}

}
