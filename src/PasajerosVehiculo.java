public class PasajerosVehiculo extends Vehiculo {

    private int numPasajeros;

    //Constructor
    public PasajerosVehiculo(String marca, String modelo, int año, int kilometraje, int numPasajeros){

        super(marca, modelo, año, kilometraje);
        this.numPasajeros=numPasajeros;
    }

    //Getter y Setter para numPasajeros
    public int getNumPasajeros(){
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros){
        this.numPasajeros=numPasajeros;
    }

    //Sobreescribir el método mostrarInfo()
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de Pasajeros: "+ numPasajeros);
    }


}
