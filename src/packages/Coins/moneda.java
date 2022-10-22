package packages.coins;

public abstract class Moneda {
    private int valor;

    public Moneda(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
