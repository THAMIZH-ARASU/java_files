import java.io.*;
import java.lang.*;
import java.util.*;
class calltest{
	public static void change(int i){
		i+=1;
		System.out.println("Inside function i="+i);
	}
}
class callbyvalue{
	public static void main(String args[]){
		calltest ob=new calltest();
		int a=10;
		System.out.println("Before call a="+a);
		ob.change(a);
		System.out.println("After call a="+a);
	}
}