import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("Hello, World!");

        //Crear instancias de cada tipo de vehiculo
        Autito auto= new Autito("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");

        Camion camion= new Camion("Volvo", "FH", 2019,75000,2000,4);

        //Mostrar info de cada vehiculo
        System.out.println("Información del Autito:");
        auto.mostrarInfo();

        System.out.println("Informacion del Camion:");
        camion.mostrarInfo();



        


    }
}
