/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n1,n2;
	    Scanner sc=new Scanner(System.in);
	    n1=sc.nextInt();
	    n2=sc.nextInt();
                int a[]=new int[20];
                for(int i=1;i<n1;i++)
                {
                	a[i]=sc.nextInt();
                }
	    	System.out.print(a[n2]);
	   
	}
}
