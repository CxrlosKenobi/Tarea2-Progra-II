package packages.vendingMachine.storages;
import java.util.*;

import packages.sodas.*;

public class DepositoMonedas {
    private ArrayList<Bebida> dep;

    public DepositoMonedas() {
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
