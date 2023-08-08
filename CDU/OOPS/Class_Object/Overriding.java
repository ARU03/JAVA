package OOPS.Class_Object;

public class Overriding {
	public static void main(String[] args) {
		Q aa=new Q();
		aa.message();
		
	}

}
class P{
	void message() {
		System.out.print("Welcome to The Base Class" );
	}
}
class Q extends P{
	void message() {
		System.out.print("Welcome to The Derived Class");
	}
}
