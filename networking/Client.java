import java.io.*;
import java.lang.*;
import java.net.*;
import java.net.InetAddress;
public class Client{
	public static void main(String args[]){
		Socket sock=null;
		
		DataInputStream dis=null;
		DataOutputStream dos=null;
		System.out.println("Trying to connect!");
		try{
			InetAddress ip=InetAddress.getByName("localhost");
			sock=new Socket(ip,Server.PORT);
			dos=new DataOutputStream(sock.getOutputStream());
			dos.writeUTF("Hi from Client!");
			DataInputStream ins=new DataInputStream(sock.getInputStream());
			String serverMsg=new String(ins.readUTF());
			System.out.println(serverMsg);
			
		}catch(SocketException se){
			System.out.println(se);
			
		}catch(IOException e){
			System.out.println(e);
			
		}finally{
			try{
				sock.close();
			}catch(IOException e){
				System.out.println(e);
			}
		}
	}
}