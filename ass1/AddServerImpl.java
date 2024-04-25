import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf{
    public AddServerImpl() throws  RemoteException {super();}

    public int multi(int a,int b){
        return a*b;
    }
}