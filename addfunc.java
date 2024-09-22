import java.io.*;
import java.lang.*;
import java.util.*;
class addfunc{
	public static int add(int a,int b){
			int k=a+b;
			return k;
		}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int c,d;
		System.out.print("Enter a number:");
		c=s.nextInt();
		System.out.print("Enter anoother number:");
		d=s.nextInt();
		int sum=add(c,d);
		System.out.println("The sum of the given two numbers is "+sum);
	}
}