package AREA_OF_RECT;

import java.util.Scanner;

class area{
	public static void main(String[] args)
	{
		int len, br, area, peri;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Your Length: ");
		len = obj.nextInt();
		System.out.println("Enter Your Breadth: ");
		br = obj.nextInt();
		area = len*br;
		peri = 2*(len+br);
		System.out.println("Area of Rectangle: "+area);
		System.out.println("Perimeter of Rectangle: "+peri);
	}
	
}