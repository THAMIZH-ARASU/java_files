import java.io.*;
import java.lang.*;
import java.util.*;
class digit{
	public static int digit(int k){
		int count=0;
		while(k!=0){
			k/=10;
			count++;
		}
		return count;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int num;
		System.out.print("Enter the number:");
		num=s.nextInt();
		int res=digit(num);
		System.out.print("The digit is "+res);
	}
}