import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MathServer {
    public static void main(String args[]) {
        try {
            IRemoteMath remoteMath = new RemoteMathServant();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Compute", remoteMath);
            System.out.println("Math server ready on port 1099");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
