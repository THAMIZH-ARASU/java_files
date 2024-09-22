import java.rmi.*;
import java.util.*;
interface Bank extends Remote{
	public List<Customer> getCustomer()throws RemoteException;
}