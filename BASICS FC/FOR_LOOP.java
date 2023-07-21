package java_full_course;

import java.util.Scanner;

public class FOR_LOOP {
public static void main(String[] aru)
{
	int num;
	int i;
	System.out.print("Enter Your Number Here: ");
	Scanner obj = new Scanner(System.in);
	num = obj.nextInt();
	
	for (i=1; i<=10; i++ )
	{
		System.out.println(num*i);
	}
	
}
}