package java_full_course;

import java.util.Scanner;

public class WHILE_LOOP {
	public static void main (String[] aru)
	{
		int num;
		System.out.print("Enter Your Number Here: ");
		Scanner obj = new Scanner (System.in);
		num = obj.nextInt();
		while (num>=0)
		{
			if (num%2==0)
			{
				System.out.print("Even Number");
				break;
			}
			else
			{
				System.out.print("Odd Number");
				break;
			}
		}
	}

}
