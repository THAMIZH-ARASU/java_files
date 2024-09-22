import java.io.*;
import java.util.*;
import java.lang.*;
class multifunc
{
	public static int multiply(int a,int b)
	{
		int k=a*b;
		return k;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int c,d;
		System.out.print("Enter a number: ");
		c=s.nextInt();
		System.out.print("Enter another number: ");
		d=s.nextInt();
		int product=multiply(c,d);
		System.out.println("The multiplication of the two given numbers is "+product);
	}
}