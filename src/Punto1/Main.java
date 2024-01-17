package Punto1;

public class Main {
    public static void main(String[] args) {
        // PRIMERO CREAMOS EL CAPITAN
        Capitan capitan1 = new Capitan("pedro","hernandes","23ASD34");

        // CREAMOS EL  BARCO
        Velero velero1 = new Velero(30000,50,2024,100,capitan1,6);

        //Evaluamos los metodos
        velero1.evaluarTamanio();
        velero1.CalcularAlquiler();

        System.out.println(velero1.toString());

        //CREAMOS OTRO BARCO

        Yate yate1 = new Yate(40000,300,2004,100,capitan1,10);

        //Evaluamos metodos

        yate1.CalcularAlquiler();
        yate1.Comprar();



        System.out.println(yate1.toString());

        Capitan jorge = new Capitan("jorge","giraldo","asdr23");



    }

}
