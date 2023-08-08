package OOPS.Class_Object;

public class FinalVariable {
	public static void main(String[] args) {
		int a= 5 ;
		final int b = 10;
		a = 10;
		b = 10;  // if i want to run this program then i need to remove the b or i need to change the "final" Variable;
		System.out.println("The Value of a="+a+"The Value of B="+b);
	}

}
