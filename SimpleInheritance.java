import java.io.*;
import java.lang.*;
import java.util.*;
class getDetail{
	public String name;
	public void getDetail(String name){
		this.name=name;
	}
	void showName(){
		System.out.println("Name:"+name);
	}
	
}
class Printing extends getDetail{
	public int age;
	void Printing(String n,int m){
		getDetail(n);
		age=m;
	}
	void showdet(){
		super.showName();
		System.out.println("Age:"+age);
	}
}
class main1{
	public static void mian(String args[])throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name:");
		String nam=b.readLine();
		System.out.print("Enter your age:");
		int a=Integer.parseInt(b.readLine());
		Printing t=new Printing(nam,a);
		t.showdet();
	}
}