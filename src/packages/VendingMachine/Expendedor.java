package packages.vendingMachine;
 

import packages._exceptions.*;
import packages.coins.*;
import packages.sodas.*;
import packages.sodas.flavours.*;
import packages.vendingMachine.storages.*;

public class Expendedor {
    private DepositoSodas cocaCola = null;
    private DepositoSodas sprite = null;
    private DepositoSodas fanta = null;
    private DepositoSodas benedictino = null;


    public Expendedor(int numBebidas, int precioBebidas) {
        cocaCola = new DepositoSodas();
        sprite = new DepositoSodas();
        fanta = new DepositoSodas();
        benedictino = new DepositoSodas();

        for (int i = 0; i < numBebidas; i++) {
            Bebida coke = new CocaCola(precioBebidas);
            Bebida white = new Sprite(precioBebidas);
            Bebida orange = new Fanta(precioBebidas);
            Bebida water = new Benedictino(precioBebidas);

            cocaCola.addBebida(coke);
            sprite.addBebida(white);
            fanta.addBebida(orange);
            benedictino.addBebida(water);
        }
    }

    public Bebida comprarBebida(Moneda coin, int opcionBebida) throws PagoInsuficienteException, NoHayBebidaException, PagoIncorrectoException {
        if (coin != null) {
            switch (opcionBebida) {
                case 1:
                    return cocaCola.getBebida();
                case 2:
                    return sprite.getBebida();
                case 3:
                    return fanta.getBebida();
                case 4:
                    return benedictino.getBebida();
                default:
                    throw new NoHayBebidaException();
            }

        } else {
            throw new PagoIncorrectoException();
        }
    }

    public Moneda getVuelto() {
        return null;
    }
}
