/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k,N;
		int a[]=new int[20];
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
		if(a[i]==k)
		count++;
	}
	System.out.print(count);
}}
