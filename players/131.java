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
		int n1,rem=0;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		int[] a=new int[10];
		int i=0;
		while(n1>0){
			rem=n1%10;
			n1=n1/10;
			i++;
			a[i]=rem;
		}
		int odd=0;
		for(int j=i;j>=0;j--){
			if((j%2)!=0){
				odd+=a[j];
			}
		}
		
		if(odd%2==0){
			System.out.print("E");
		}
		else{
			System.out.print("O");
		}
	}
}
