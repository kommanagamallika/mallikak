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
		String str1;
		Scanner sc=new Scanner(System.in);
		str1=sc.next();
		int sum=0;
		sum=Integer.parseInt(str1.substring(0,1))+Integer.parseInt(str1.substring(str1.length()-1,str1.length()));
		System.out.print(sum);
	}
}
