import java.util.Scanner;

public class Vehiculo {

    //Atrinutos

    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    //Contructor

    public Vehiculo (String marca, String modelo, int año, int kilometraje){
        
        this.marca=marca;

        this.modelo=modelo;

        this.año=año;

        this.kilometraje=kilometraje;

    }

    //Getter y Setter
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public int getAño(){
        return año;
    }

    public void setAño(int año){
        this.año=año;
    }

    public int getKilometraje(){
        return kilometraje;
    }

    public void setKilometraje(int kilometraje){
        this.kilometraje=kilometraje;
    }


    //Metodo para mostrar la informacion del vehiculo

    public void mostrarInfo(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Año: "+ año);
        System.out.println("Kilometraje: "+ kilometraje);
    }

}
