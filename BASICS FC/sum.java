package java_full_course;
import java.util.Scanner;
public class sum{
	public static void main(String[] args)
	{
		int a, b, c;
		System.out.println("Enter Your Two Numbers:");
		Scanner obj= new Scanner (System.in);
		a= obj.nextInt();
		b= obj.nextInt();
		c= a+b;
		System.out.println("The Sum of Teo numbers is : "+c);
	}
}