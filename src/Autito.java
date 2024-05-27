import java.util.Scanner;

public class Autito extends PasajerosVehiculo {
    
    private String tipoCombustible;

    //Constructor
    public Autito(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible){

        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible=tipoCombustible;
    }

    //Getter y Setter para tipoCombustible
    public String getTipoCombustible(){

        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible=tipoCombustible;
    }

    //Sobreescribir el método mostrarInfo()
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }


    //Independiente

    @Override
    public void realizarMantenimiento(){
        Scanner meli= new Scanner(System.in);

        super.realizarMantenimiento();

        String respuesta= meli.nextLine();

        respuesta.equalsIgnoreCase("SI");
     
        if (   respuesta.equalsIgnoreCase("SI")) {
         System.out.println("Tipos de manteminiento:");
         System.out.println("1. Llantas");
         System.out.println("2. Motor");
         System.out.println("3. Transmición");
         System.out.println("4. Sistema de Aire acondicionado");
         System.out.println("5. Cambio de combustible.");
     
         System.out.println("Escoja el tipo de mantenimiento");
         int tipomantenimiento= meli.nextInt();
     
         switch (tipomantenimiento) {
             case 1:
                 System.out.println("Llantas cambiadas con exito.");
                 break;
             case 2 :
                 System.out.println("Motor arreglado con exito");
                 break;
             case 3:
                 System.out.println("Transmición reaparada con exito");
                 break;
             case 4:
                 System.out.println("Sistema de Aire arreglado con exito");
                 break;
             case 5:
                 System.out.println("A que tipo de combustible desea cambiarlo?");
                 System.out.println("Tipo de combustible:");
                 System.out.println("1. Diesel");
                 System.out.println("2. regular");
                
                 int respucombus= meli.nextInt();
                 switch (respucombus) {
                    case 1:
                        System.out.println("Combustible cambiado a Diesel");
                        break;
                    case 2:
                        System.out.println("Combustible cambiado a regular");
                        break;
                 
                    default:
                    System.out.println("opcion no valida");
                        break;
                 }
                 break;
         
             default:
             System.out.println("Opcion invalida");
                 break;
         }
            
            
         
     
     
        } else {
         System.out.println("No se ha realizado mantenimiento. "
         +"Vuelva Pronto");
         
        }


        
        meli.close();
    }

    public int costoMantenimiento(int costoXkilometro, int Kilometrosrecorridos){

        Scanner meli= new Scanner(System.in);

        System.out.println("Ahora calcularemos el costo por el mantenimiento.");
 
        
        
        int costototal=costoXkilometro*Kilometrosrecorridos;

        System.out.println("El mantenimiento del vehiculo es de: " +costototal + " $");

        meli.close();

        return costototal;

    }







}
