/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,m,gcd=0;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
	          for(int i=1;i<=m&&i<=n;i++){
	          	if(m%i==0 && n%i==0){
	              gcd=i;	
	          	}
	          }
	          int num=(m*n)/gcd;
	          System.out.print(num);
	}
}
