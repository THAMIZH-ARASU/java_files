import java.io.*;
import java.lang.*;
import java.util.*;
class abbccc
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(char a=65;a<(65+n);a++)
		{
			for(int j=0;j<=n;j++)
			{
				System.out.print(a);
				n--;
			}
		}
	}
}