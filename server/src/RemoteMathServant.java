import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteMathServant extends UnicastRemoteObject implements IRemoteMath {
    public RemoteMathServant() throws RemoteException {
        super();
    }

    public double add(double i, double j) throws RemoteException {
        return i + j;
    }

    public double subtract(double i, double j) throws RemoteException {
        return i - j;
    }
}
