import java.io.*;
import java.util.*;
import java.lang.*;
public class GFG{
	public static void guessno(){
		Scanner s=new Scanner(System.in);
		int number=1+(int)(100*Math.random());
		int k=5;
		int i, guess;
		System.out.println("A number is chosen between 1 to 100 .");
		System.out.println("Guess the number within 5 trials.");
		for (i=0;i<k;i++){
			System.out.print("Guess the number:");
			guess=s.nextInt();
			if(number==guess){
				System.out.println("Congratulations! You guessed the number");
				break;
			}
			else if((number>guess)&&(i!=k-1)){
				System.out.println("The number is greater than "+guess);
			}
			else if((number<guess)&&(i!=k-1)){
				System.out.println("The number is less than "+guess);
			}
		}
		if (i==k){
			System.out.println("You have exhausted");
			System.out.println("The number is "+number);
		}
	}
	public static void main(String args[]){
		guessno();
	}
} 