package OOPS.Class_Object;

import java.util.Scanner;

public class StaticDataMemb {
	public static void main(String[] args) {
		student aa=new student(101,"Arup Roy");
		student bb=new student(102,"Malay malakar");
		aa.display();
		bb.display();
	}

}
class student{
	int roll;
	String name;
	static String cname = "Swami Vivekananda Institute of Science of Technology.";
	student(int x, String y){
		roll = x;
		name =y;
	}
	void display() {
		System.out.println("Student Rollno = "+roll+", Student Name = "+name+", College Name = "+cname);
	}
}
