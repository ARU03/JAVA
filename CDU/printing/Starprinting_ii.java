package printing;

import java.util.Scanner;

public class Starprinting_ii {
	public static void main(String[] args)
	{
		int n, j , k=1;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter The Number Of Rows: ");
		n = sc.nextInt();
		for ( ;n>=1;n--)
		{
			for (j=1; j<=n; j++)
			{
				System.out.print(k);
			}
			k=k+1;
			System.out.println();
		}
		
	}

}
