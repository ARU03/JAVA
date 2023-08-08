package Calculator;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args)
	{
		int a, b, ch;
		Scanner obj= new Scanner (System.in);
		System.out.println("Enter Your first Number: ");
		a = obj.nextInt();
		System.out.println("Enter Your Second Number: ");
		b = obj.nextInt();
		System.out.println("1-> Additon, n2-> Substraction, 3-> Multiplication, 4-> Division"
				+ "\nEnter Your Choice: ");
		ch = obj.nextInt();
		if (ch==1)
			System.out.println("Additon: "+(a+b));
		else if (ch==2)
			System.out.println("Substraction: "+(a-b));
		else if (ch==3)
			System.out.println("Multiplication: "+(a*b));
		else if (ch==4)
			System.out.println("Division: "+(a/b));
		else
			System.out.println("Your Choice is Invalid..!");
	}

}
