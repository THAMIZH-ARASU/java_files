import java.io.*;
import java.lang.*;
import pack1.math;
class packtest{
	public static void main(String args[]){
		math m=new math();
		System.out.println("Factorial:"+m.fact(5));
		System.out.println("Square:"+m.square(6));
		System.out.println("Cube:"+m.cube(7));
		System.out.println("Addition:"+m.add(10,90));
		System.out.println("Subtraction:"+m.sub(45,78));
		System.out.println("Multiplication:"+m.mul(5,4));
		System.out.println("Division:"+m.div(8004,4));
	}
}