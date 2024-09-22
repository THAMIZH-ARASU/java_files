import java.io.*;
import java.lang.*;
import java.util.*;
class summa{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of rows:");
		int n=Integer.parseInt(br.readLine());
		for(int i=n;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}