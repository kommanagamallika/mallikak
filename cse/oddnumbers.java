/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0,n=0;
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		n=s.nextInt();
	    for(i=1; i<n; i++)
        {
            if(i%2!=0)
                System.out.print(i+" ");
        }  
			System.out.println();

	}
}
