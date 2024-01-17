package Punto2;

public class Parqueadero {

    private Carro carro;


    private Carro[][] carros = new Carro[5][10];
    private double tarifacarros;

    public Parqueadero(double tarifacarros, Carro[][] carros) {
        this.tarifacarros = tarifacarros;
        this.carros = carros;


    }

    public boolean Parquear(Carro carro, int fila, int columna) {
        if (carros[fila][columna] == null) {
            carros[fila][columna] = carro;
            System.out.println("El vehiculo de placas " + carro.getMarca() + " se ha estacionado correcatamente en la posicion " + fila + " " + columna);
            return true;
        } else {
            System.out.println("El vehiculo no se puede estacionar en la posicion indicada ya que esta ocupado o la posicion no existe");
            return false;
        }

    }

    public double CobrarTiempo(int horas, Carro carro) {
        System.out.println("El tiempo a pagar por "+horas+" horas es : ");
        return horas * tarifacarros;
    }

    public void MostrarEstado() {
        System.out.println("Ocupacion actual del parqueadero");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (carros[i][j] == null) {
                    System.out.print("[" + " " + "]");
                } else {
                    System.out.print("[" + "x" + "]");
                }

            }
            System.out.println(" ");
        }
    }
}
