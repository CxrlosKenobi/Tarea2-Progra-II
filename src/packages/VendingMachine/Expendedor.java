package packages.vendingMachine;
 

import packages.exceptions.*;
import packages.coins.*;
import packages.sodas.*;
import packages.vendingMachine.storages.*;

public class Expendedor {
    private DepositoSodas cocaCola = null;
    private DepositoSodas sprite = null;
    private DepositoSodas fanta = null;

    public Expendedor(int numBebidas, int precioBebidas) {
        cocaCola = new DepositoSodas();
        sprite = new DepositoSodas();
        fanta = new DepositoSodas();

        for (int i = 0; i < numBebidas; i++) {
            Bebida coke = null;
            Bebida white = null;
            Bebida orange = null;

            // coke = new CocaCola(i + 100);
            // white = new Sprite(i + 200);
            // orange = new Fanta(i + 300);
            cocaCola.addBebida(coke);
            sprite.addBebida(white);
            fanta.addBebida(orange);
        }
    }

    public Bebida comprarBebida(Moneda coin, int n) throws PagoInsuficienteException {
        if (coin != null) {
            if (n == 1) {
                return cocaCola.getBebida();
            } else {
                return sprite.getBebida();
            }
        } else {
            throw new PagoInsuficienteException();
        }

    }

    public Moneda getVuelto() {
        return null;
    }
}
