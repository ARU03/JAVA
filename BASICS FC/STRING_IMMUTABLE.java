package java_full_course;

public class STRING_IMMUTABLE {
	public static void main(String[] aru)
	{
		String str = "Arup";                  // IMMUTABLE (CAN'T CHANGE)
		String str1 = "Arup";
		str.concat(" roy");
		String str2 = str.concat(" Roy");
		System.out.println(str);
		System.out.println(str2);
	}

}
