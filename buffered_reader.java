import java.io.*;
import java.lang.*;
class Baddition
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the values:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
	}
}