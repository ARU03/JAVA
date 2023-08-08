package Questions;

import java.util.Scanner;

public class BreakContinue {
	public static void main(String[] args)
	{
		int i;
	    i = 0;
	    while (i<=10)
	    {
	    	i = i+1;
	    	if (i==5)
	    		continue;
//	    		break;
	    	System.out.print(i+" ");
	    }
	    System.out.println("Execution Done");
	}

}
