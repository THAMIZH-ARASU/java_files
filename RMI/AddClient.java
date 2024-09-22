import java.rmi.*;
import java.io.*;
import java.net.*;
import java.util.*;
public class AddClient{
	public static void main(String args[]){
		String host="loocalhost";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st parameter:");
		int n=s.nextInt();
		System.out.println("Enter 2nd parameter:");
		int m=s.nextInt();
		try{
			AddRem remobj=(AddRem)Naming.lookup("rmi://"+host+"/AddRem");
			System.out.print("Result:");
			System.out.println(remobj.addNum(n,m));
		}
		catch(RemoteException re){
			re.printStackTrace();
		}
		catch(NotBoundException nbe){
			nbe.printStackTrace();
		}
		catch(MalformedURLException mfe){
			mfe.printStackTrace();
		}
	}
}