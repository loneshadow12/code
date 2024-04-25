import java.rmi.*;
import java.net.*;
import java.util.*;

public class AddClient {

    public static void main (String args[]){
        String host = "localhost";
         
        Scanner sc = new Scanner(System.in);  // Create a scanner

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter first number: ");
        int b = sc.nextInt();

        try {
            AddServerIntf remobj = (AddServerIntf) 
            Naming.lookup("rmi://"+ host + "/MulRem");
            System.out.println ("Result: "+ remobj.multi(a,b));
        } catch (RemoteException re) {
            re.printStackTrace();
        } catch (NotBoundException nbe) {
            nbe.printStackTrace();
        } catch (MalformedURLException mfe) {
            mfe.printStackTrace();
        }
    }

}

