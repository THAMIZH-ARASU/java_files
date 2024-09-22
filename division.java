import java.io.*;
import java.lang.*;
import java.util.*;
class division
{
	public static void main(String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value:");
		a=s.nextInt();
		System.out.println("Enter second value:");
		b=s.nextInt();
		float c=a/b;
		System.out.println("Division of "+a+" and "+b+" is "+c);
	}
}