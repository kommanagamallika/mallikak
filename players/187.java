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
		Scanner sc=new Scanner(System.in);
		String str1,str;

		str1=sc.next();
		str=sc.next();
		int m=str1.length();
		int n=str.length();
		if(n==(m+1))
		{
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
	}
}
