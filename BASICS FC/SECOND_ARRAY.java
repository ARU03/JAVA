package java_full_course;

import java.util.Arrays;
import java.util.Scanner;

public class SECOND_ARRAY {
	public static void main (String[] aru)
	{
		int a[] = new int[5];
		System.out.print("Enter Your Elements Here:");
		Scanner obj=new Scanner (System.in);
		for (int i=0; i<5; i++)
		{
			a[i]=obj.nextInt();
		}
		Arrays.sort(a);
		System.out.print("Array Elements are: ");
		for (int b : a)
		{
			System.out.print(b+" ");
		}
	}

}
