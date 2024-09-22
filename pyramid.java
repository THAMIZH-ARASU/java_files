import java.io.*;
import java.lang.*;
import java.util.*;
class pyramid{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int n=s.nextInt();
		int k=0;
		for(int i=1;i<=n;i++,k=0)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			while(k!=(2*i)-1)			
			{
				System.out.print("*");
				k++;	
			}
			System.out.println();
		}
	}
}