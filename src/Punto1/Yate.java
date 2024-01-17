package Punto1;

public class Yate extends Barco{
    private int cantidadCamarotes;

    public Yate(int precioBase, int valorAdicional, int fabricacion, int eslora, Capitan capitan,int cantidadCamarotes) {
        super(precioBase, valorAdicional, fabricacion, eslora, capitan);
        this.cantidadCamarotes=cantidadCamarotes;

    }

    public void Comprar(){
        if(cantidadCamarotes>7){
            System.out.println("El yate que desea comprar es de lujo y tiene un precio de 10,000,000,000 USD");
        }else {
            System.out.println("El yate que desea comprar tiene un valor de 20.000.000 USD");
        }
    }
}
