package packages;

import packages.coins.*;
import packages.sodas.Bebida;
import packages.vendingMachine.*;
import packages._exceptions.*;

public class Comprador {
    private String direccionMoneda;
    private int dineroDevuelto = 0;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        try {
            Bebida enMano = null;
            
            enMano = exp.comprarBebida(m, cualBebida);
            System.out.println(queBebiste(enMano));
            
            Moneda monedita = null;
            do {
                monedita = exp.getVuelto();
                dineroDevuelto += 100;

            } while (monedita != null);
            System.out.println("Vuelto: " + this.cuantoVuelto());

        } catch (PagoInsuficienteException | NoHayBebidaException | PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
    }

    public int cuantoVuelto() {
        return dineroDevuelto;
    }

    public String queBebiste(Bebida b) {
        return b.beber();
    }
}
