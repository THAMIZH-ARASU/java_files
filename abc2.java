//unfinished
import java.io.*;
import java.lang.*;
import java.util.*;
class abc2
{
	public static void main(String args[])
	{
		int n,i=65,j=65;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=65;i<(65+n);i++)
		{
			for(j=65;j<=i;j++)
			{
				System.out.print("%c",i);
			}
		}
	}
}