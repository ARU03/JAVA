package Questions;

//############################### Check a Number is Prime Or Not #########################

import java.util.Scanner;

public class prime{
	public static void main(String[] args)
	{
		int n, count=0,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number Here: ");
		n = sc.nextInt();
		while (i<=n)
		{
			if (n%i==0)
				count = count+1;
			i = i+1;
		}
		if (count==0)
			System.out.println("It is a Prime Number");
		else 
			System.out.println("It is not a Prime number");
	}
}
