/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a=new int[10];
		int m,n,temp;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		temp=0;
		for(int i=0;i<m;i++)
		{
			for(int j=i+1;j<m;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print(a[n-1]);
	}
}
