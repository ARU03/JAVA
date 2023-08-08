 package OddOrEven_PositiveOrNegative;

import java.util.Scanner;

public class Odd_Eve {
	public static void main(String[] args)
	{
		int a;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your First Number: ");
		a = obj.nextInt();
		if (a%2==0)
			System.out.println("The Number is a Even Number..");
		else
			System.out.println("The Number is a Odd Number..");
	}

}

//import java.io.*;
//
//class Odd_Eve {
//	public static void main(String[] args)throws IOException
//	{
//		int a;
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Entere Your Number Here: ");
//		a = Integer.parseInt(br.readLine());
//		if (a%2==0)
//			System.out.println("The Number is a Even number");
//		else
//			System.out.println("The Number is a Odd Number");
//	}
//}

