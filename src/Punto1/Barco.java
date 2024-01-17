package Punto1;

public class Barco {

    private int precioBase;
    private int valorAdicional;
    private int fabricacion;
    private int eslora;
    private Capitan capitan;

    public Barco(int precioBase, int valorAdicional, int fabricacion, int eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.fabricacion = fabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public int getValorAdicional() {
        return valorAdicional;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", fabricacion=" + fabricacion +
                ", eslora=" + eslora +
                ", capitan=" + capitan.getNombre() +
                '}';
    }

    public void CalcularAlquiler() {
        if (fabricacion > 2020) {
            int total = 0;
            total = precioBase + 20000;
            System.out.println("El alquiler es: " + total);
        } else {
            System.out.println("El alquiler es " + precioBase);
        }
    }
}
