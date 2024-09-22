//unfinished
import java.io.*;
import java.util.*;
import java.lang.*;
class Ascii{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a ASCII value:");
		int a=Integer.parseInt(br.readLine());
		System.out.print("Enter a ASCII value:");
		int b=Integer.parseInt(br.readLine());
		char c=Character.parsechar(a);
		char d=Character.parsechar(b);
		System.out.println("The character of the ASCII value "+a+" is "+c);
		System.out.println("The character of the ASCII value "+b+" is "+d);
	}
}