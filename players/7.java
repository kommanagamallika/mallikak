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
		char[] carr = str.toCharArray();


	           for(int i=0;i<str.length()-1;i++){
	           	char tmp = carr[i];
                        carr[i] = carr[i+1];
                         carr[i+1] = tmp;
                      ++i;

	           }
	       

		System.out.print(carr);
	
	}
}
