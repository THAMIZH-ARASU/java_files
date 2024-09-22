import java.io.*;
import java.lang.*;
import java.util.*;
class vowels
{
	public static void main(String args[])
	{
		String word;
		int a=0,e=0,i=0,o=0,u=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string:");
		word=s.nextLine();
		int n=word.length();
		System.out.println("Length of the string:"+n);
		for(int j=0;j<n;j++)
		{
			if((word.charAt(j)=='a')||(word.charAt(j)=='A'))
			{
				a++;
			}
			if((word.charAt(j)=='e')||(word.charAt(j)=='E'))
			{
				e++;
			}
			if((word.charAt(j)=='i')||(word.charAt(j)=='I'))
			{
				i++;
			}
			if((word.charAt(j)=='o')||(word.charAt(j)=='O'))
			{
				o++;
			}
			if((word.charAt(j)=='u')||(word.charAt(j)=='U'))
			{
				u++;
			}
		}
		System.out.println("a:"+a);
		System.out.println("e:"+e);
		System.out.println("i:"+i);
		System.out.println("o:"+o);
		System.out.println("u:"+u);
		
	}
}