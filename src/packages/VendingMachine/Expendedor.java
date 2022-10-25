package packages.vendingMachine;

import packages._exceptions.*;
import packages.coins.*;
import packages.sodas.*;
import packages.sodas.flavours.*;
import packages.vendingMachine.storages.*;

public class Expendedor {
    private int precioBebidas;
    private DepositoSodas benedictino;
    private DepositoSodas cocaCola;
    private DepositoSodas sprite;
    private DepositoSodas fanta;

    public Expendedor(int numBebidas, int precioBebidas) {
        this.precioBebidas = precioBebidas;
        this.benedictino = new DepositoSodas();
        this.cocaCola = new DepositoSodas();
        this.sprite = new DepositoSodas();
        this.fanta = new DepositoSodas();

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
            Bebida cache;
            switch (opcionBebida) {
                case 0:
                    cache = benedictino.getBebida();
                    checkPrecioBebida(coin);
                    return checkBebidaCache(cache);

                case 1:
                    cache = cocaCola.getBebida();
                    checkPrecioBebida(coin);
                    return checkBebidaCache(cache);

                case 2:
                    cache = cocaCola.getBebida();
                    checkPrecioBebida(coin);
                    return checkBebidaCache(cache);

                case 3:
                    cache = cocaCola.getBebida();
                    checkPrecioBebida(coin);
                    return checkBebidaCache(cache);

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

    // Aux
    public Bebida checkBebidaCache(Bebida cache) throws NoHayBebidaException {
        if (cache == null)
            throw new NoHayBebidaException();
        else
            return cache;
    }

    public void checkPrecioBebida(Moneda coin) throws PagoInsuficienteException {
        if (this.precioBebidas > coin.getValor())
            throw new PagoInsuficienteException();
    }
}
