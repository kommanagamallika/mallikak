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
		int k;
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		int[] a=new int[k];
		for(int i=0;i<k;i++){
			  a[i]=sc.nextInt();
		}
		int temp=0;
		if(k%2!=0){
		for(int i=0;i<k-1;i++){
			for(int j=i+1;j<k-1;j++){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
			i++;
		}
		}
		else{
			for(int i=0;i<k;i++){
			for(int j=i+1;j<k;j++){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
			i++;
		}
		
		
			
		}
		for(int i=0;i<k-1;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print(a[k-1]);
	}
}
