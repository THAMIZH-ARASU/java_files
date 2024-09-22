
import java.rmi.*;
public interface average extends Remote{
	public float avg(float a,float b)throws RemoteException;
}