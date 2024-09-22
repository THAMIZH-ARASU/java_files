import java.io.*;
import java.lang.*;
import java.util.*;
class nattu
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:");
		a=s.nextInt();
		System.out.print("Enter a number:");
		b=s.nextInt();
		System.out.print("Enter a number:");
		c=s.nextInt();
		if((a>b)&(a>c))
		{
			System.out.print(a+" is greater");
		}
		else if((b>c)&(b>a))
		{
			System.out.print(b+" is greater");
		}
		else
		{
			System.out.print(c+" is greater");
		}
		
	}
}