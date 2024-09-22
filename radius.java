import java.io.*;
import java.lang.*;
import java.util.*;
class Radius
{
	public static void main(String args[])
	{
		System.out.println("Enter the values:");
		Scanner j=new Scanner(System.in);
		int a=j.nextInt();
		int b=j.nextInt();
		int c=j.nextInt();
		int r=(a+b)*(c*a)/(a*c);
		System.out.println("Radius:"+r);
	}
}