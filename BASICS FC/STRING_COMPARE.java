package java_full_course;

public class STRING_COMPARE {
	public static void main(String[] aru)
	{
		String str = "ARUP";
		String str2 = new String("ARUP");
//		if (str==str2)               //variable diff but content equal means not equal...
		if (str.equals(str2))        // Content Equal means Equal.... 
		{
			System.out.print("Both are Equal..");
		}
		else
		{
			System.out.print("Not Equal...");
		}
	}

}
