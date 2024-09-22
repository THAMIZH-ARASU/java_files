import java.io.*;
import java.lang.*;
import java.util.*;
class emp{
	public static double netpay;
	public static String name;
	public static int empid;
	public static double empsal;
	public static void getdata(String n,int i,double b){
		name=n;
		empid=i;
		empsal=b;
	}
	public static void calculate(double b){
		if(b<=10000){
			netpay=b*1.2;
		}
		else if(b<=20000){
			netpay=b*2.2;
		}
		else if(b<=30000){
			netpay=b*3.2;
		}
		else{
			netpay=b*5;
		}
	}
	public static void display(){
		System.out.println("___________________________");
		System.out.println("Employee name:"+name);
		System.out.println("Empolyee ID:"+empid);
		System.out.println("Employee's basic salary:"+empsal);
		System.out.println("Employee's NetPay:"+netpay);
	}
}
class empdetail{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String ename=new String();
		System.out.print("Enter employee name:");
		ename=s.nextLine();
		int eid;
		System.out.print("Enter employee ID:");
		eid=s.nextInt();
		double bs;
		System.out.print("Enter basic salary:");
		bs=s.nextDouble();
		emp t=new emp();
		t.getdata(ename,eid,bs);
		t.calculate(bs);
		t.display();
	}
}