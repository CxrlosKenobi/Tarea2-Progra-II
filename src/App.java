import packages.sodas.*;
import packages.sodas.flavours.*;
import packages.*;
import packages.vendingMachine.*;
import packages.coins.*;
//
public class App {
    public static void main(String[] args) throws Exception {
        Moneda moneda = new Moneda1000();
        Expendedor vendomatic = new Expendedor(10,40);
        Comprador Carlos = new Comprador(moneda, 0, vendomatic);







    }
}
