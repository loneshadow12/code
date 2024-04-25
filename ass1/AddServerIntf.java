import java.rmi.*;

public interface AddServerIntf extends Remote{
    public int multi(int a,int b) throws  RemoteException;
}