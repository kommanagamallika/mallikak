/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num1;
		Scanner sc=new Scanner(System.in);
		num1=Integer.parseInt(sc.nextLine(),2);
	
		String octal=Integer.toHexString(num1);
		System.out.print(octal);
	}
}
