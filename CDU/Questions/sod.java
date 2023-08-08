package Questions;


// ################################ Write a program to sum Digit of given Number ############################
import java.util.Scanner;

public class sod {
	public static void main(String[] args)
	{
		int n, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		while (n>0)
		{
			sum = sum+n%10;
			n = n/10;
		}
		System.out.println("Sum Of Digit Value is: "+sum);
	}

}
