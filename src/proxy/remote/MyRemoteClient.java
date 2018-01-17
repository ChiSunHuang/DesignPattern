package proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class MyRemoteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyRemoteClient().go();
	}
	private void go() {
		try {
			System.setSecurityManager(new RMISecurityManager()); 
			MyRemote service = (MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");
			System.out.println(service.SayHello());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
