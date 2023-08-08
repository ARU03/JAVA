package Max_Num;

//import java.util.Scanner;
//
//public class two_num {
//	public static void main(String[] aru)
//	{
//		int a, b;
//		Scanner obj=new Scanner(System.in);
//		System.out.println("Enter Your First Number: ");
//		a = obj.nextInt();
//		System.out.println("Enter Your Second Number: ");
//		b = obj.nextInt();
//		if (a>b)
//			System.out.println("Max Number is: "+a);
//		else
//			System.out.println("Max Number is: "+b);
//	}
//
//}

import java.io.*;

public class two_num {
	public static void main(String[] args)throws IOException
	{
		int a, b;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your First Number Here: ");
		a = Integer.parseInt(br.readLine());
		System.out.println("Enter Your Second Number Here: ");
		b = Integer.parseInt(br.readLine());
		if (a>b)
			System.out.println("Max Number is : "+a);
		else
			System.out.println("Max Number is : "+b);
	}
}
