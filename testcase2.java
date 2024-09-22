import java.io.*;
import java.lang.*;
import java.util.*;
class testcase2{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String a=new String();
		System.out.print("Enter the string:");
		a=s.nextLine();
		String b=new String(); 
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a')
			{
				b=a.replace('a','b');
			}
			if(a.charAt(i)=='e')
			{
				b=a.replace('e','f');
			}
			if(a.charAt(i)=='i')
			{
				b=a.replace('i','j');
			}
			if(a.charAt(i)=='o')
			{
				b=a.replace('o','p');
			}
			if(a.charAt(i)=='u')
			{
				b=a.replace('u','v');
			}
			
		}
		System.out.print("The string is :"+b);
	}
}