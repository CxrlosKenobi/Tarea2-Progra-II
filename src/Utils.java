import java.util.ArrayList;

public class Utils {
    public static void main(String[] args) {

        Bebida a2 = null;
        Moneda m = null;
        Moneda coin = new Moneda();
        Expendedor exp = new Expendedor(10);
        exp.comprarBebida(coin, 2);
        a2 = exp.comprarBebida(m, 2);
        exp.comprarBebida(m, 1);

        System.out.println(a2.getSerie());
        System.out.println(a2.beber());
    }
}

class Moneda {

}

class Expendedor {
    private Deposito coca = null;
    private Deposito sprite = null;

    public Expendedor(int n) {
        coca = new Deposito();
        sprite = new Deposito();

        for (int i = 0; i < n; i++) {
            Bebida coke = null;
            Bebida white = null;
            coke = new CocaCola(i + 100);
            white = new Sprite(i + 200);
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

class Deposito {
    private ArrayList<Bebida> dep;

    public Deposito() {
        dep = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida a) {
        dep.add(a);
    }

    public Bebida getBebida() {
        if (dep.size() > 0) {
            return dep.remove(0);

        } else {
            return null;
        }
    }

}

abstract class Bebida {
    private int nserie;

    public Bebida(int n) {
        nserie = n;
    }

    public int getSerie() {

        return nserie;
    }

    public String beber() {
        String b = "sabor: ";
        return b;
    }

}

class Sprite extends Bebida {
    public Sprite(int n) {
        super(n);
    }

    public String beber() {
        String a = "sprite";
        String b = super.beber();
        return b + a;
    }

}

class CocaCola extends Bebida {
    public CocaCola(int n) {
        super(n);
    }

    public String beber() {

        String a = "cocacola";
        String b = super.beber();
        return b + a;
    }

}