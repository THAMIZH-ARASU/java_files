import java.rmi.*;
import java.net.*;
public class Server{
	public static void main(String args[]){
		try{
			averageImpl l=new averageImpl();
			Naming.rebind("rmi:///average",l);
		}catch(RemoteException re){
			re.printStackTrace();
		}catch(MalformedURLException m){
			m.printStackTrace();
		}
	}
} 