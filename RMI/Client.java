import java.rmi.*;
import java.net.*;
import java.util.*;
import java.io.*;
public class Client{
	public static void main(String args[])throws IOException{
		String host="localhost";
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter name:");
		String name=b.readLine();
		System.out.print("Enter ID:");
		int id=Integer.parseInt(b.readLine());
		System.out.print("Enter Course:");
		String course=b.readLine();
		System.out.print("Enter Faculty:");
		String faculty=b.readLine();
		System.out.print("Enter mark 1:");
		float mark1=Float.parseFloat(b.readLine());
		System.out.print("Enter mark 2:");
		float mark2=Float.parseFloat(b.readLine());
		try{
			average r=(average)Naming.lookup("rmi://"+host+"/average");
			System.out.println("\n\n\n\n_____________________");
			System.out.println("NAME:"+name);
			System.out.println("ID:"+id);
			System.out.println("COURSE:"+course);
			System.out.println("FACULTY"+faculty);
			System.out.println("MARK 1:"+mark1);
			System.out.println("MARK 2:"+mark2);
			System.out.println("_____________________");
			System.out.println("AVERAGE:"+r.avg(mark1,mark2));
		}catch(RemoteException re){
			re.printStackTrace();
		}catch(NotBoundException nbe){
			nbe.printStackTrace();
		}catch(MalformedURLException m){
			m.printStackTrace();
		}
		
	}
} 