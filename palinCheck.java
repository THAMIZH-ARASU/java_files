import java.io.*;
import java.lang.*;
import java.util.*;
public class palinCheck{
	public static boolean Palindrome(String S){
		String a="";
		int i=S.length()-1;
		while(i>=0){
			a+=S.charAt(i);
			i--;
		}
		if(a==S){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[])throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String:");
		String p=b.readLine();
		boolean Bool=Palindrome(p);
		System.out.println("Result:"+Bool);
	}
}