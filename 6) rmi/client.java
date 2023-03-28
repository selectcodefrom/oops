import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class client 
{
    public static void main(String args[]) throws RemoteException    
    {
                client c=new client();
                c.connectRemote();
    }    

    private void connectRemote() throws RemoteException
    {
      try
      {
          Scanner scan = new Scanner(System.in);
          Registry reg=LocateRegistry.getRegistry("localhost",1234);
          adder ad=(adder) reg.lookup("MyServer");
          System.out.print("Addition\nEnter the First number:");
          int a=scan.nextInt();
          System.out.print("Enter the Second number:");
          int b=scan.nextInt();
          System.out.println("Addition is:"+ad.add(a,b));
      }
      catch(NotBoundException|RemoteException e)
      {
          System.out.println("Exception"+e);
      }
    }
}