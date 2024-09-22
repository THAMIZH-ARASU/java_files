import java.io.*;
import java.lang.*;
import java.net.*;
public class Server{
	public static final int PORT=1025;
	public static void main(String args[]){
		ServerSocket sersock = null;
		Socket sock=null;
		System.out.println("Wait!!");
		try{
			sersock=new ServerSocket(PORT);
			int number;
			System.out.println("Server Sarted:"+sersock);
			
			
			sock=sersock.accept();
			System.out.println("Client Connected"+sock);
			
			DataInputStream ins=new DataInputStream(sock.getInputStream());
			String clientMsg=new String(ins.readUTF());
			System.out.println(clientMsg);
			
			
			DataOutputStream out=new DataOutputStream(sock.getOutputStream());
			out.writeUTF("Hello from Server");
			out.close();
			
			sock.close();
		}catch(SocketException se){
			System.out.println(se);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Connection from:"+sock.getInetAddress());
	}
}