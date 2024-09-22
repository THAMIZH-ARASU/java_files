import java.io.*;
import java.lang.*;
import java.util.*;
class subtract
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first value:\t");
		int a=s.nextInt();		
		System.out.println("Enter second value:\t");
		int b=s.nextInt();
		System.out.println("-----------------------");
		int c=a-b;
		System.out.println("Subtraction of "+a+" and "+b+" is "+c);
		
	}
}