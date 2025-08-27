package Entidades;
import Entidades.Interfaces.Pata;
import java.util.Scanner;
public class OrniAzul extends Castor implements Pata {
    private int propulsion;
    public OrniAzul(int velocidad, int propulsion) {
        super(velocidad);
        this.propulsion = propulsion;
    }
    //sobreescribimos el metodo del padre 
    @Override
    public void nadar(){
       int velTotal=  super.getVelocidad()+ propulsion;//sumamos la velocidad del padre mas la velocidad de propulsion
        System.out.println("el ornitorrinco nada a una velocidad de:" + velTotal);
    }
    
    @Override
    public void tocarGuitarra(){
        int numR = (int) (Math.random()*6)+0;
    System.out.println("Toca cuerda: "+ numR);
}

    @Override
    public void tocarOrgano() {
        Scanner oprimir = new Scanner(System.in);
        System.out.println("Do - Re - Mi");
        oprimir.nextLine();//se espera a que presiona enter para mostrar el siguiente sout
        System.out.println("Fa - Sol - La - Si");
    }
  
}
