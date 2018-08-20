/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int k,o;
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		o=sc.nextInt();
		if(k>=(Math.pow(2,32))&&(o>=Math.pow(2,32)))
		{
			System.out.print("End of File");
			
		}
		else
		{
			System.out.print(o-k);
		}
		
	}
}
