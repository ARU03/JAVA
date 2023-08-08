package Questions;

//import java.util.Scanner;
//
//public class tablePrint {
//	public static void main(String[] args)
//	{
//		int n, i=1;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Your Number Here: ");
//		n = sc.nextInt();
//		while (i<=10)
//			{
//			    System.out.print(i*n+" ");
//			    i = i+1;
//			}
//	}
//
//}

// ########################### USING FOR LOOP #############################

import java.util.Scanner;

class table{
	public static void main(String[] args)
	{
		int n, i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Note Print Name: ");
		n = sc.nextInt();
		for (i=1; i<=10; i++)
			System.out.print(i*n+" ");
	}
}
