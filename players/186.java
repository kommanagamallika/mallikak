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
		String str3,str1,str2;
		str3=sc.nextLine();
		str1=sc.next();
		str2=sc.next();
		if((str3.contains(str1))&&(str3.contains(str2)))
		{
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
	}
}
