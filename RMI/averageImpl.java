import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class averageImpl extends UnicastRemoteObject implements average{
	public averageImpl()throws RemoteException{}
	public float avg(float a,float b){
		float k=(a+b)/2;
		return (k);
	} 
}