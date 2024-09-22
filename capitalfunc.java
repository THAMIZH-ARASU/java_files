//unfinished
import java.io.*;
import java.lang.*;
import java.util.*;
class capitalfunc
{
	public static boolean caps(char a){
		char cp[26]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for(int i=0;i<26;i++)
		{
			if (a=cp[i])
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a alphabet:");
		char b=s.nextchar();
		c=caps(b);
		if(c=true)
		{
			System.out.println("The given character is capital");
		}
		else
		{
			System.out.println("The given character is not capital ");
		}
	}
}