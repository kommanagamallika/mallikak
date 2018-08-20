/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  int num, sum = 0;
		  int a[]=new int[10];
          Scanner sc=new Scanner (System.in);
          num=sc.nextInt();
          
        for(int i = 0; i < num; ++i)
        {
          a[i]=sc.nextInt();  
           
        }
          for(int i = 0; i < num; ++i)
          {
          	 sum += a[i];
          }

        System.out.println(+sum);
	}
}
