package packages;

import packages.coins.*;
import packages.sodas.Bebida;
import packages.vendingMachine.*;
import packages._exceptions.*;
public class Comprador {
    private String direccionMoneda;
    private int numDeposito;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        try {
            Bebida enMano = null;
            enMano = exp.comprarBebida(m, cualBebida);
            System.out.println(queBebiste(enMano));

        } catch (PagoInsuficienteException | NoHayBebidaException | PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
    }

    public int cuantoVuelto() {
        return 0;
    }

    public String queBebiste(Bebida b) {

        return b.getClass().getSimpleName();
    }
}
