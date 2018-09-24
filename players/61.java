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
		int k,x,y=0;
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		x=sc.nextInt();
		int[] a=new int[k];
		for(int i=0;i<k;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++){
			for(int j=i+1;j<k;j++){
				
					if(a[i]+a[j]==x){
					y++;
				
					}
				
			}
		}
		if(y==0){
		System.out.print("no");
		}
		else{
		System.out.print("yes");
		}
	}
}
