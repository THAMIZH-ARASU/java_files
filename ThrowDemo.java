import java.io.*;
class ThrowDemo{
	public static void main(String args[])throws IOException{
		int number;
		number=Integer.parseInt(args[0]);
		try{
			if(number>10){
				throw new Exception("Maximum Limit is 10");
			}
		}catch(Exception e){
			System.out.println("Exception has been occured!!!");
			System.out.println(e.getMessage());
		}finally{
			System.out.println("This is the Last Statement");
		}
	}
}