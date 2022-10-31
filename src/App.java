import packages.*;
import packages.vendingMachine.*;
import packages.coins.*;
//
public class App {
    public static void main(String[] args) throws Exception {
        int numBebidas = 5, precioBebidas = 500;
        Expendedor vendomatic = new Expendedor(numBebidas, precioBebidas);

        int tipoBebida = 0;
        Moneda moneda = new Moneda1000();

        Comprador JeanPierre = new Comprador(moneda, tipoBebida, vendomatic);
    }
}
