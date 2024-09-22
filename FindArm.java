import java.io.*;
import java.lang.*;
import java.util.*;
class FindArm{
	public static void main(String args[])throws IOException{
		BufferedReader s= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
		int n=Integer.parseInt(s.readLine());
		int sum=0;
		int r,num;
		for(int i=1;i<=n;i++){
			num=i;
			while(num!=0){
				r=num%10;
				int g=r*r*r;
				sum+=g;
				num/=10;
			}
			if(sum==i){
				System.out.println(i);
			}
		}
	}
}