package java_full_course;

public class NESTED_IFELSE {
	public static void main (String[] aru)
	{
		int num1=190, num2 = 125, num3 = 120;
		if (num1>num2)
		{
			if (num1>num3)
			{
				System.out.print("The Maximum Value is: "+num1);
			}
			else
			{
				System.out.print("The Maximum Value is :"+num3);
			}
		}
		else
		{
			if (num2>num3)
			{
				System.out.print("The Maximum Value is : "+num2);
			}
			else
			{
				System.out.print("The Maximum Value is : " +num3);
			}
		}
		
	}

}
