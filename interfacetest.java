import java.io.*;
import java.lang.*;
interface Area{
	final static double pi=3.14;
	double compute(double x,double y);
}
class r implements Area{
	public double compute(double x,double y){
		return x*y;
	}
}
class c implements Area{
	public double compute(double x,double y){
		return (pi*x*x);
	}
}
class interfacetest{
	public static void main(String args[]){
		r rect=new r();
		c circle=new c();
		Area a;
		a=rect;
		System.out.println("Area of the rectangle:"+a.compute(10,20));
		a=circle;
		System.out.println("Area of the circe:"+a.compute(30,40));
	}
}