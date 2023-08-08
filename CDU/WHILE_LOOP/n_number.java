package WHILE_LOOP;

import java.util.Scanner;

public class n_number {
	public static void main(String[] args)
	{
		int i, n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number Which You Want to Print: ");
		n = sc.nextInt();
		i = 1;
		while (i<=n)
		{
			System.out.print(i+" ");
			i = i+1;
		}
	}

}
