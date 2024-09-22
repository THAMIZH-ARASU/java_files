import java.io.*;
import java.lang.*;
import java.util.*;
class multiply
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first value:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());	
		int c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+c);
		}
} 