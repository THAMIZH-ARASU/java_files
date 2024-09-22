import java.io.*;
import java.lang.*;
import java.util.*;
class  testcase1{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String s1=new String();
		System.out.print("Enter the string:");
		s1=s.nextLine();
		String res=new String();
		for(int i=1;i<s1.length();i++)
		{
			res+=s1.charAt(i);	
		}	
		res+=s1.charAt(0);
		System.out.print("The string is "+res);
	}
}