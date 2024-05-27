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






        //Independiente

        System.out.println("Escoja el tipo de vehiculo que desea darle mantenimiento");

        Scanner meli= new Scanner(System.in);
        int mante= meli.nextInt();


        switch (mante) {
            
            case 1:
            System.out.println("Mantenimiento del auto");
            auto.realizarMantenimiento();
            System.out.println("Costo por mantenimiento");
            System.out.println("Cuanto es su costo por kilometro?");
            int costoXkilometro=15;
    
            System.out.println("Cuantos kilometros recorrio?");
            int Kilometrosrecorridos=100;
    
    
    
            auto.costoMantenimiento(costoXkilometro, Kilometrosrecorridos);

                break;
            case 2:
            System.out.println("Mantenimieto del Camion");
            camion.realizarMantenimiento();
            
                break;
            default:
                break;
        }
        
        

        meli.close();


    }
}
