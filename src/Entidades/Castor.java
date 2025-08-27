
package Entidades;

public class Castor {
    //Atributos del castor
    private int velocidad;//velocidad la ingresa el usuario o en el constructor
    private String cola = "Ancha y plana";

    public Castor(int velocidad){
        this.velocidad = velocidad;
    }
    //metodos
    public int getVelocidad(){
        return velocidad;
    }
public void nadar(){
    System.out.println("El castor nada a una velocidad de" + velocidad);
}
public void tocarGuitarra(){
    System.out.println("Tocando la guitarra");
}

}
