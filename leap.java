import java.io.*;
import java.lang.*;
import java.util.*;
class leap
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter year:");
		int n=Integer.parseInt(br.readLine());
		System.out.println();
		if((n%400==0)||(n%4==0)&(n%100!=0))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a Leap year");
		}
	}
}