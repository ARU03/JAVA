package WHILE_LOOP;

import java.util.Scanner;

public class SomOfNatural_N {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i, n, add=0; 
		System.out.println("Enter Your Number Here: ");
		n = sc.nextInt();
		i = 1;
		while (i<=n)
		{
			add = add+i;
			i = i+1;
		}
		System.out.print("Addition : "+add);
	}

}
