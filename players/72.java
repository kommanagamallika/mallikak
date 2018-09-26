

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int[] a=new int[num];
		for(int i=0;i<num;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<num-1;i++){
			if(a[i+1]<a[i]){
				System.out.print(a[i]);
				break;
			}
		}
	}
}
	
