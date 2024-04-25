import java.rmi.*;

import java.net.*;

public class AddServer{
    public static void main(String args[]){
        try{
            AddServerImpl locobj = new AddServerImpl();
            Naming.rebind("rmi:///MulRem", locobj);
        }catch(RemoteException re){
            re.printStackTrace();
        }catch(MalformedURLException mfe){
            mfe.printStackTrace();
        }
    }
}