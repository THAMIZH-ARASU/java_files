import java.io.*;
import java.lang.*;
import java.net.*;

public class ipfind{
	public static void main(String args[])throws IOException{
		try{
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			String url = new String();
			System.out.print("\n Eneter url:" );
			url=b.readLine();
			InetAddress ia=InetAddress.getByName(url);  
			String ip=ia.getHostAddress();
			System.out.println("IP"+ip);
			
		}catch(UnknownHostException e){
			System.out.println(e.getMessage());
		}
	}
}