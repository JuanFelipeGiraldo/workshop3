package Punto1;

public class Velero extends Barco{
    private int cantidadMastiles;

    public Velero(int precioBase, int valorAdicional, int fabricacion, int eslora, Capitan capitan,int cantidadMastiles) {
        super(precioBase, valorAdicional, fabricacion, eslora, capitan);
        this.cantidadMastiles=cantidadMastiles;
    }

    public void evaluarTamanio(){
        if(cantidadMastiles>4){
            System.out.println("El velero se considera grande");
        }else {
            System.out.println("El velero se considera pequenio");
        }

    }

}
