import java.io.*;
import java.lang.*;
class tr{
	public static void main(String args[]){
		int a;
		int b=0;
		try{
			a=40/b;
			System.out.println("This will not be printed");
		}catch(ArithmeticException e){
			System.out.println("Dividing by zero is not possible");
		}
	}
}