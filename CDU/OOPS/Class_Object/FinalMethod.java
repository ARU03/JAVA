package OOPS.Class_Object;

public class FinalMethod {
	public static void main(String[] args) {
		B aa=new B();
		aa.display();
	}
}
class A{
	final void display() {
		System.out.print("Base Class");
	}
}
class B extends A{
	void display() {  // program will not run because already final keyword is used before or i need to change the display keyword...
		System.out.print("Derived Class");
	}
}
