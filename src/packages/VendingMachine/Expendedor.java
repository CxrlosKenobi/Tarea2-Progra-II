package packages.vendingMachine;

import packages.coins.*;
import packages.sodas.*;
import packages.vendingMachine.storages.*;

public class Expendedor {
    private DepositoSodas coca = null;
    private DepositoSodas sprite = null;

    public Expendedor(int n) {
        coca = new DepositoSodas();
        sprite = new DepositoSodas();

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
