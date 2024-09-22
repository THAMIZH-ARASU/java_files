//program will wor if the comment statement is given as program statement
import java.io.*;
import java.lang.*;
class name
{
	public static void main(String args[])
	{
		int x=100;
		\\int y;
		System.out.println("x="+x);
		{
			x+=10;
			y=200;
		}
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}