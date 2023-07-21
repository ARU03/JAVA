package java_full_course;

import java.util.Scanner;
public class IFELSE{

public static void main(String[] aru)
{
	int pwd;
	System.out.print("Enter Your Password Here: ");
	Scanner obj = new Scanner (System.in);
	pwd = obj.nextInt();
	
	if (pwd == 2593)
	{
		System.out.println("Name: Arup Roy");
		System.out.println("Dept: ECE");
		System.out.println("Year: 2021-2024");
		System.out.println("Roll: 24130321095");
	}
	else
	{
		System.out.print("You Entered a Wrong Password...!!!");
	}

}}
