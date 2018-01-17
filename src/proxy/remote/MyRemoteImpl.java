package proxy.remote;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	protected MyRemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String SayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Server say hello";
	}
	
	public static void main(String[] args) {
		try {
			//System.setSecurityManager(new RMISecurityManager()); 
			MyRemote service = new MyRemoteImpl();
			//Naming.rebind("RemoteHello", service);
			Registry r = LocateRegistry.getRegistry();
			r.bind("RemoteHello", service);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
