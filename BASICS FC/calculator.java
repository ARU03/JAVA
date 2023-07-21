package java_full_course;

import java.util.Scanner;

public class calculator {
	public static void main (String[] aru)
	{
		int a,b,c,ch;
		System.out.print("Enter Any Two Number: ");
		Scanner obj = new Scanner (System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		System.out.print("Enter your choice: ");
		ch = obj.nextInt();
		switch (ch)
		{
		case 1: c=a+b;
		 System.out.print("Addition : "+c);
		 break;
		case 2: c=a-b;
		 System.out.print("Substraction: "+c);
		 break;
		case 3: c=a*b;
		 System.out.print("Multiplication: "+c);
		 break;
		case 4: c=a/b;
		 System.out.print("Division :" +c);
		 break;
		case 5: c=a%b;
		 System.out.print("Reminder: "+c);
		 break;
		default:
			System.out.print("Invalid Choice...");
		}
	}

}
