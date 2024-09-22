import java.io.*;
import java.lang.*;
import java.util.*;
public class Armstrong{
	public static void main(String args[]){
		System.out.println("Finding All the Armstrong numbers :");
		Scanner b=new Scanner(System.in);
		System.out.print("Enter a number:");
		int len=b.nextInt();
		for(int num=1;num<len;num++){
			int n=num;
			int sum=0,re;
			while(n!=0){
				re=n%10;
				int s=re*re*re;
				sum+=s;
				n/=10;
			}
			if(num==sum){
				System.out.println(num);
			}else{
				continue;
			}
		}
	}
}