/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		    Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

              scan.close();
                int product = num1*num2;
         if(product % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
	}
}
