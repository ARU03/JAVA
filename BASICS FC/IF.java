package java_full_course;

import java.util.Scanner;

//public class IF {
//	public static void main (String[] aru)
//	{
//		int pwd;
//		System.out.print("Enter Your Password: ");
//		Scanner obj=new Scanner (System.in);
//		pwd=obj.nextInt();
//		if (pwd==2593)
//		{
//			System.out.println("Name= Arup Roy");
//			System.out.println("Age= 26");
//			System.out.println("Mobile No= 7908497752");
//			System.out.println("Address= Coochbehar");
//		}
//
//    }
//}

public class IF {
	public static void main (String[] aru)
	{
		int pwd;
		System.out.print("Enter Your Password Here: ");
		Scanner obj = new Scanner(System.in);
		
		pwd = obj.nextInt();
		if (pwd == 2593)
		{
			System.out.println("Name = Arup Roy");
			System.out.println("Age= 26");
			System.out.println("Mobile No. = 7908497752");
			System.out.println("Address = Coochbehar");
		}
	}
}
