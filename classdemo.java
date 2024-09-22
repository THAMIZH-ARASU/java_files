import java.io.*;
import java.lang.*;
import java.util.*;
class employee{
	public static String ename;
	public static int esal;
	public static void getdata(String n,int m){
		ename=n;
		esal=m;
	}
	public static void display(){
		System.out.println("________________________________");
		System.out.println("Employee name is "+ename);
		System.out.println("Employee salary is "+esal);
	}
}
class classdemo{
	public static void main(String args[]){
		employee e=new employee();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the name of the employee:");
		String name=new String();
		name=s.nextLine();
		System.out.print("Enter the salary:");
		int sal=s.nextInt();
		e.getdata(name,sal);
		e.display();
	}
}