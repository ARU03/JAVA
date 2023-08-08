package OOPS;
import java.util.Scanner;

public class prog{
	public static void main(String[] args)
	{
		demmo aa = new demmo();
		aa.getdata();
		aa.sumofdigit();
		
	}
}
class demmo {
	int i; 
	void getdata()
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Number Here: ");
		i = sc.nextInt();
	}
	void sumofdigit()
	{
		int sum = 0;
		while (i>0)
		{
			sum = sum+ i%10;
		    i = i/10;
	    }
		System.out.println("The Sum of Digit is : "+sum);
	}
	
}