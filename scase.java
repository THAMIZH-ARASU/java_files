import java.io.*;
import java.lang.*;
import java.util.*;
class scase{
	public static void main(String args[]){
		System.out.println("COLOURS");
		System.out.println("1.GREEN");
		System.out.println("2.BLUE");
		System.out.println("3.RED");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		switch (n){
			case 1:{
				System.out.println("Coolour is Green.");
				break;
			}	
			case 2:{
				System.out.println("Colour is Blue.");
				break;
			}
			case 3:{
				System.out.println("Colour is Red.");
				break;
			}
			default:{
				System.out.println("Invalid choice.");
				break;
			}
		}
	}
} 