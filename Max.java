//write a java program to find the maximum number between two numbers//

import java.util.Scanner;
class Max
{
   public static void main(String args[])
       {
          Scanner sc=new Scanner(System.in);
	     int a,b;
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		if(a>b)
		{
		System.out.println("The maximum numbers between two numbers  is :"+a);
		}
		else
		{
		System.out.println("The maximum numbers between two numbers is :"+b);
		}
      
	 }
}         	










