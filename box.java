import java.io.*;
import java.lang.*;
import java.util.*;
class box
{
	public static void main(String args[])
	{
		int n,m;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of rows:");
		n=s.nextInt();
		System.out.print("Enter number of columns:");
		m=s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if((i==0)||(j==0)||(i==n-1)||(j==m-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}