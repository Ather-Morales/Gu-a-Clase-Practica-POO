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

}
