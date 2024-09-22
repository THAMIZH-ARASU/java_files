import java.io.*;
import java.lang.*;
import java.net.*;
public class EchoServer{
	static final int serverPort=1026;
	static final int packetSize=1024;
	
	public static void main(String args[])throws SocketException{
		DatagramPacket packet;
		DatagramSocket socket;
		byte[] data;
		int clientPort;
		InetAddress address;
		String str;
		socket=new DatagramSocket(serverPort);
		
		for(;;){
			data=new byte[packetSize];
			
		
			packet=new DatagramPacket(data,packetSize);
			System.out.println("Waiting to receive the packets...");
			
			try{
				socket.receive(packet);
			}catch(IOException e){
				System.out.println("Could not receive:"+e.getMessage());
				System.exit(0);
			}
			address=packet.getAddress();
			clientPort=packet.getPort();
			
			str=new String(data,0,0,packet.getLength());
			System.out.println("Messagge:"+str.trim());
			System.out.println("From:"+address);
			
			packet=new DatagramPacket(data,packetSize,address,clientPort);
			
			try{
				socket.send(packet);
			}catch(IOException e){
				System.out.println("Cold not Send:"+e.getMessage());
				System.exit(0);
			}
		}
	}
}