package packages;
import packages.coins.*;
import packages.vendingMachine.*;

public class Comprador {
    private Moneda m;
    
    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
    }

    public int cuantoVuelto() {
        return 0;
    }

    public String queBebiste() {
        return "";
    }
}

// public Expendedor(int numBebidas, int precioBebidas);

// public Bebida comprarBebida(Moneda m, int cual) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException;

// public Moneda getVuelto(); //retorna moneda, null si deposito está vacío

// public Bebida(int numSerie);

// public int getSerie();

// public abstract String beber();

// public Moneda();

// public String getSerie ();  //significa que retorna su dirección en RAM como número de serie

// public abstract int getValor(); //retorna la cantidad de $que vale la moneda