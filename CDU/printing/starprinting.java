package printing;

import java.util.Scanner;

public class starprinting {
	public static void main(String[] args)
	{
		int i, n , j ;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Your Number of Rows: ");
		n = sc.nextInt();
		for (i=1; i<=n; i++)
		{
			for (j=1; j<=i; j++)
			{
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
}
