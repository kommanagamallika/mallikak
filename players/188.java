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
		int a,b,d;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		d=sc.nextInt();
		if(((a+b)>d)&&((b+d)>a)&&((d+a)>b)){
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
	}
}
