package Entidades;

import java.util.Comparator;
import java.util.Scanner;

public class OrniAzul extends Castor {

    private Integer propulsion;
    private String nombre;

    public OrniAzul(int velocidad, int propulsion, String nombre) {
        super(velocidad);
        this.propulsion = propulsion;
        this.nombre = nombre;
    }
    
    public Integer getPropulsion(){
        return propulsion;
    }
    
    //sobreescribimos los metodos del padre nadar() y tocarGuitarra().
    @Override
    public void nadar() {
        int velTotal = super.getVelocidad() + propulsion;//sumamos la velocidad del padre mas la velocidad de propulsion
        System.out.println( nombre+" nada a una velocidad de: " + velTotal);
    }

    @Override
    public void tocarGuitarra() {
        int numR = (int) (Math.random() * 6) + 1;
        System.out.println(nombre +" Toca cuerda: " + numR);
    }
    //Comparator de clase anonima
    public static Comparator<OrniAzul> velocidadAscen= new Comparator<OrniAzul>() {
        @Override
        public int compare(OrniAzul o1, OrniAzul o2) {
        
            return o2.getPropulsion().compareTo(o1.getPropulsion());
        }
    };

    @Override
    public String toString() {
        return "OrniAzul{" + "propulsion de nado=" + propulsion + ", nombre=" + nombre + '}';
    }

}
