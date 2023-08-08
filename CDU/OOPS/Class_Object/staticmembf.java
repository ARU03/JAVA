package OOPS.Class_Object;

import java.util.Scanner;

public class staticmembf {
	public static void main(String[] args) {
		stud aa=new stud(101,"Arup");
		stud bb=new stud(102,"Malay");
		aa.disp();
		bb.disp();
		stud.change();      // static function call and it is not a part of any object;     
		aa.disp();
		bb.disp();
	}
}

class stud{
	int roll;
	String name;
	static String cname = "XYZ";
	
	// parameterized constructor
	stud (int x, String y){
		roll = x;
		name = y;
	}
	
	// Here we can use static and non static both variables;
	// normal function call
	void disp() {
		System.out.println("Rollno.="+roll+", Name="+name+", College Name="+cname);
	}
	
	// Here we can only use staic variables;
	static void change() {
		cname = "SVIST";
	}
}
