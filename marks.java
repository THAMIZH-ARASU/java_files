//unfinished
import java.io.*;
import java.lang.*;
import java.util.*;
class stud
{
	public String nm;
	stud(String n){
		nm=n;
	}
	void disp(){
		System.out.println("NAME:"+nm);
	}	
}
class marks extends stud
{
	public int a;
	public int b;
	public int c;
	marks(int n1,int n2,int n3){
		super.stud();
		a=n1;
		b=n2;
		c=n3;
	}
	void show(){
		System.out.println("MARK1:"+a);
		System.out.println("MARK2:"+b);
		System.out.println("MARK3:"+c);
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter name:");
		String name=s.nextLine();
		System.out.print("Enter 3 subject marks:");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nrxtInt();
		marks t=new marks(name,m1,m2,m3);
		t.disp();
		t.show();
	}	
}