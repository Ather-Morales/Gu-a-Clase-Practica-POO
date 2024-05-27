import java.util.Scanner;


public class Camion extends VehiculoCarga{

    private int numEjes;

    //Constructor
    public Camion (String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes){

        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes=numEjes;
    }

    //Getter ySetter

    public int getNumEjes(){
        return numEjes;
    }

    public void setNumEjes(int numEjes){
        this.numEjes= numEjes;
    }

    //Sobreescribir el método mstrarInfo()
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Número de Ejes: "+ numEjes);
    }




    //Independiente

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
         System.out.println("5. Cambiar ejes");
     
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
                 System.out.println("Ejes cambiados con exito");
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






}
