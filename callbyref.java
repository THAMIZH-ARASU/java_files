import java.io.*;
import java.lang.*;
import java.util.*;
class reftest{
	public static int a,b;
	public static void change(reftest o){
		o.a+=2;
		o.b-=2;
	}
	public static void show(){
		System.out.println("A="+a+",B="+b);
	}
}
class callbyref{
		public static void main(String args[]){
			reftest ob1=new reftest();		
			reftest ob2=new reftest();
			ob2.a=10;
			ob2.b=20;
			System.out.println("Before calling change:");
			ob2.show();
			ob1.change(ob2);
			System.out.println("After calling change:");
			ob2.show();
		}
	}