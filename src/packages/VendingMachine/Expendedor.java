package packages.VendingMachine;
import java.util.ArrayList;
import packages.Sodas.*;
import packages.Coins.*;

public class Expendedor {
    private Deposito coca = null;
    private Deposito sprite = null;

    public Expendedor(int n) {
        coca = new Deposito();
        sprite = new Deposito();

        for (int i = 0; i < n; i++) {
            Bebida coke = null;
            Bebida white = null;
            //coke = new CocaCola(i + 100);
            //white = new Sprite(i + 200);
            coca.addBebida(coke);
            sprite.addBebida(white);
        }
    }

    public Bebida comprarBebida(Moneda coin, int n) {
        if (coin != null) {
            if (n == 1) {
                return coca.getBebida();
            } else {
                return sprite.getBebida();
            }
        } else {
            return null;
        }

    }
}
