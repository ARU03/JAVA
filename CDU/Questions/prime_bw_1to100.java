package Questions;
// Write a program to print all prime Numbers b/w 1 to 100;
import java.util.Scanner;

//public class prime_bw_1to100 {
//	public static void main(String[] args)
//	{
//		int i, count, j , n;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Your Number Here: ");
//		n = sc.nextInt();
//		for (i=1; i<=100; i++)
//		{
//			count = 0;
//					for (j=1; j<=i; j++)
//					{
//						if (i%j==0)
//							count++;
//					}
//			if (count==2)
//				System.out.print(i+" ");
//		}
//	}
//
//}


public class prime_bw_1to100 {
	public static void main(String[] args)
	{
		int i, count, j , n, total = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number Here: ");
		n = sc.nextInt();
		for (i=1; i<=100; i++)
		{
			count = 0;
					for (j=1; j<=i; j++)
					{
						if (i%j==0)
							count++;
					}
			if (count==2)
				System.out.println(i+" ");
			     total = total + 1;
		}
		System.out.println("Total prime Numbers are: "+total);
	}

}
