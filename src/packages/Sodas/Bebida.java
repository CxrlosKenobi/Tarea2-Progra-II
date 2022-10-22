package packages.sodas;

public abstract class Bebida {
    private String nombre;
    private int precio;

    public Bebida(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", precio=" + precio;
    }
    
}
