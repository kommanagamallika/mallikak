/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int a=0;
		for(int i=0;i<str.length();i++)
		{
		   if((str.charAt(i)=='1')||(str.charAt(i)=='0'))
		   {
		   	
		   }
		   else
		   {
		   	a++;
		   }
		}
		if(a==0)
		System.out.println("yes");
		else
		System.out.println("no");
		
	}
}
