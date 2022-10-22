package packages.VendingMachine;
import java.util.*;
import packages.Sodas.*;

public class Deposito {
    private ArrayList<Bebida> dep;

    public Deposito() {
        dep = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida a) {
        dep.add(a);
    }

    public Bebida getBebida() {
        if (dep.size() > 0) {
            return dep.remove(0);

        } else {
            return null;
        }
    }

}
