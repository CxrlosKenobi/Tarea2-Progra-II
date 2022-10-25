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

    public Bebida comprarBebida(Moneda coin, int opcionBebida)
            throws PagoInsuficienteException, NoHayBebidaException, PagoIncorrectoException {
        if (coin != null) {
            Bebida cache=null;
            switch (opcionBebida) {
                case 0:
                    cache = benedictino.getBebida();
                    if (cache == null)
                        throw new NoHayBebidaException();
                    return cache;
                case 1:
                    cache = cocaCola.getBebida();
                    if (cache == null)
                        throw new NoHayBebidaException();
                    return cache;
                case 2:
                    cache = cocaCola.getBebida();
                    if (cache == null)
                        throw new NoHayBebidaException();
                    return cache;
                case 3:
                    cache = cocaCola.getBebida();
                    if (cache == null)
                        throw new NoHayBebidaException();
                    return cache;
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
