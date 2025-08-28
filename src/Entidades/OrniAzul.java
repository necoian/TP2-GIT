package Entidades;
import Entidades.Interfaces.Pata;
import java.util.Scanner;
public class OrniAzul extends Castor {
    private int propulsion;
    private String nombre;
    public OrniAzul(int velocidad, int propulsion, String nombre) {
        super(velocidad);
        this.propulsion = propulsion;
        this.nombre = nombre;
    }
    //sobreescribimos el metodo del padre 
    @Override
    public void nadar(){
       int velTotal=  super.getVelocidad()+ propulsion;//sumamos la velocidad del padre mas la velocidad de propulsion
        System.out.println("el ornitorrinco nada a una velocidad de:" + velTotal);
    }
    
    @Override
    public void tocarGuitarra(){
        int numR = (int) (Math.random()*6)+1;
    System.out.println("Toca cuerda: "+ numR);
    }

}
