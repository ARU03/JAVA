package OOPS.Class_Object;
 // 
public class FinalClass {
	public static void main(String[] args) {
		B aa=new B();
		aa.display();
		
	}

}
final class A{
	void display() {
		System.out.print("Base Class");
	}
}
class B extends A{       // The program will not be run because already final class is mentioned before...
	void display() {
		System.out.print("Derived Class");
	}
}