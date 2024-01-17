package Punto2;

public class Main {
    public static void main(String[] args) {
        // Creamos carros
        Carro camaro = new Carro("ADC123","CHEVROLET",2020);
        Carro lamborguini = new Carro("adf123","lamborguini",2000);
        Carro ferrari = new Carro("Agt423","ferrari",2023);
        Carro mazda = new Carro("OPG123","mazda",2022);
        Carro jeep = new Carro("CAT423","jeep",2021);

        // Creamos matriz
        Carro[][] carros= new Carro[5][10];

        // Creamos parqueadero
        Parqueadero parqueadero1= new Parqueadero(3000,carros);

        //MOSTRAMOS EL PARQUEADERO VACIO
        parqueadero1.MostrarEstado();

        //parqueamos los carros
        parqueadero1.Parquear(camaro,0,0);
        parqueadero1.Parquear(lamborguini,4,2);
        parqueadero1.Parquear(ferrari,1,7);
        parqueadero1.Parquear(mazda,3,9);

        //Mostramos el parqueadero con la ocupacion actual
        parqueadero1.MostrarEstado();

        //Prueba de parquear en lugar ocupado
        parqueadero1.Parquear(jeep,0,0);

        //prueba metodo cobrar tiempo

        System.out.println(parqueadero1.CobrarTiempo(5,lamborguini));




    }
}
