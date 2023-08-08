package Questions;

//################################## Write a program to reverse of a given Number ###################################

import java.util.Scanner;

public class rev {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n, rev=0, z;
		System.out.println("Enter Your Value Here: ");
		n = sc.nextInt();
		z = n;
		while (n>0)
		{
			rev = rev*10 + rev%10;
			n = n/10;
		}
		if (rev%2==0)
			System.out.println(z+" It is a palindrome Number");
		else 
			System.out.println(z+" It is not a Palindrome Number");
			
		
	}

}
