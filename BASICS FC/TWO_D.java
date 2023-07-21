package java_full_course;

import java.util.Scanner;

public class TWO_D {
	public static void main(String[] aru)
	{
		int a[][] = new int [2][2];
		System.out.print("Enter Your Element Here: ");
		Scanner obj=new Scanner (System.in);
		for (int i=0; i<2; i++)
		{
			for (int j=0; j<2; j++)
			{
				a[i][j] = obj.nextInt();
			}
		}
		System.out.print("\nMatrix Elements:\n");
		for (int i=0; i<2; i++)
		{
			for (int j=0; j<2; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
