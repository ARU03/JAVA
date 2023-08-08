package Questions;
 //########################## Find a Factorial Number of a given Number#######################
//import java.util.Scanner;
//
//public class factorial {
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		int n, fact= 1;
//		System.out.println("Enter Number To Find Factorial: ");
//		n = sc.nextInt();
//		while (n>0)
//		{
//			fact = fact*n;
//			n = n-1;
//		}
//		System.out.println("Factorial: "+fact);
//	}
//
//}

import java.util.Scanner;

public class factorial{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int n, fact=1;
		System.out.print("Enter Your number Here: ");
		n = sc.nextInt();
		while (n>0)
		{
			fact = fact*n;
			n= n-1;
		}
		System.out.println("Factorial : "+fact);
	}
}
