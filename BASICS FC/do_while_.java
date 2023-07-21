package java_full_course;

import java.util.Scanner;

public class do_while_ {
	public static void main (String [] aru)
	{
		int num; 
		System.out.print("Enter Your Number Here: " );
		Scanner obj = new Scanner (System.in);
		num = obj.nextInt();
		do 
		{
			
			System.out.print(num+" ");
			++num;
		}
		while
			(num<=10);
	}

}
