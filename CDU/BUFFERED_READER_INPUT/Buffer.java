package BUFFERED_READER_INPUT;

import java.io.*;

public class Buffer {
	public static void main(String[] args)throws IOException
	{
		int a, b, c;
		BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Frist Number: ");
		a = Integer.parseInt(obj.readLine());             //float.parseFloat(obj.readline());
		System.out.println("Enter Your Second number:");
		b = Integer.parseInt(obj.readLine());
		c = a+b;
		System.out.println("Addition: "+c);
	}

}


