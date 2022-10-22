package packages.coins;

public abstract class Moneda {
    private int valor;

    public Moneda() {
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getSerie() {
        return Integer.toHexString(hashCode());
    }
}
