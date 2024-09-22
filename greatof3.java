import java.io.*;
import java.lang.*;
import java.util.*;
class none
{
	public static void main(String srgs[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("TO FIND THE GREATEST OF THREE GUVEN NUMBERS");
		System.out.println("-------------------------------------------");
		System.out.print("Enter 1st number:");
		int a=s.nextInt();
		System.out.print("Enter 2nd number:");
		int b=s.nextInt();
		System.out.print("Enter 3rd number:");
		int c=s.nextInt();
		System.out.println("\n\n Result :\n\n");
		if((a>b)&(a>c))
		{
			System.out.println(a+" is greatest.");
		}
		else if((b>a)&(b>c))
		{
			System.out.println(b+" is the greatest");
		}
		else
		{
			System.out.println(c+" is greatest");
		}
	}
} 