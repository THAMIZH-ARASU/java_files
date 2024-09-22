import java.io.*;
import java.lang.*;
import java.util.*;
class sumdig{
	public static int sum(int a){
		int r=0;
		int k;
		while(a!=0){
			k=a;
			k%=10;
			r+=k;
			a/=10;
		}
		return r;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=s.nextInt();
		int res=sum(n);
		System.out.println("The result is "+res);
	}
}
