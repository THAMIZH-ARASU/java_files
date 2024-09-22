import java.io.*;
import java.lang.*;
import java.net.*;
public class EchoClient{
	static final int serverPort=1026;
	static final int packetSize=1024;
	public static void main(String args[])throws UnknownHostException,SocketException{
		DatagramSocket socket;
		DatagramPacket packet;
		InetAddress address;
		String messageSend;
		String messageReturn;
		byte[] data;
		
		if(args.length!=2){
			System.out.println("Usage Error :Java EchoServer <Server name> <Message>");
			System.exit(0);
		}
		
		address=InetAddress.getByName(args[0]);
		socket=new DatagramSocket();
		
		data=new byte[packetSize];
		messageSend=new String(args[1]);
		messageSend.getBytes(0,messageSend.length(),data,0);
		
		packet=new DatagramPacket(data,data.length,address,serverPort);
		System.out.println("Tring to Send the packet....");
		
		try{
			socket.send(packet);
		}catch(IOException e){
			System.out.println("Could not Send:"+e.getMessage());
			System.exit(0);
		}
		
		packet=new DatagramPacket(data,data.length);
		
		try{
			socket.receive(packet);
		}catch(IOException e){
			System.out.println("Could not receive:"+e.getMessage());
			System.exit(0);
		}
		
		messageReturn=new String(packet.getData(),0);
		System.out.println("Message returned:"+messageReturn.trim());
	}
}