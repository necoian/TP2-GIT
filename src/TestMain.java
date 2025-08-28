
import Entidades.Castor;
import Entidades.OrniAzul;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {
        
        Scanner leerT = new Scanner(System.in);
        int vel, vel2, vel3;//VARIABLES
        
        
        System.out.println("Ingrese la velocidad del castor ( desde 1 km/h hasta 8km/h como maximo)");
        vel = leerT.nextInt();
        while (vel > 8 || vel < 1) { //si el usuario ingresa un valor fuera del rango entra al bucle
            System.out.println("INGRESE Dentro del rango (1 km/h 8 km/h)");
            vel = leerT.nextInt();
        }
        //instanciamos al papa Castor
        Castor c1 = new Castor(vel);

        System.out.println("Ingrese la velocidad de propulsion(min 5km/h y  maximo 10km/h)");
        System.out.println("Ornitorrinco AZUL 1");
         vel2 = leerT.nextInt();
        while (vel2 > 10 || vel2 < 5) { //si el usuario ingresa un valor fuera del rango entra al bucle
            System.out.println("Ingrese dentro del rango");
            vel2 = leerT.nextInt();
        }
        System.out.println("Ornitorrinco AZUL 2");
       vel3 = leerT.nextInt();
        while (vel3 > 10 || vel3 < 5) { //si el usuario ingresa un valor fuera del rango entra al bucle
            System.out.println("Ingrese dentro del rango");
            vel3 = leerT.nextInt();
        }
        //instanciamos a los dos hermanos Ornitorrincos Azules
        OrniAzul o1 = new OrniAzul(vel, vel2, "Bluey");
        OrniAzul o2 = new OrniAzul(vel, vel3, "Blue");
        System.out.println("...............................................");//separador 
        //metodo de nadar y tocar guitarra de los ornitorrincos azules.
        o1.nadar();
        o2.nadar();
        o1.tocarGuitarra();
        o2.tocarGuitarra();
        try {
        //Ejercicio de Arreglo de [3] con su try, catch y finally.
            Castor[] ornit = new Castor[3];
          //ornit[0] = ornitorrinco verde;
            ornit[1] = o1;
            ornit[2] = o2;
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Se salio del arreglo!!!");
        } finally {
            System.out.println("ornitohermanos juntos al fin");
        }
        System.out.println("...............................................");//separador 
        System.out.println("Ornitorrincos Azules ordenados segun velocidad de propulsion de forma Ascendente");
        //creamos arreglo dinamico, para luego mostrarlo con iterator(OrniAzul!!)
        ArrayList<OrniAzul> ornis = new ArrayList();
        //Agregamos los ornitorrincos
        ornis.add(o1);
        ornis.add(o2);
        //Mostramos a los ornitorrincos segun su velocidad de propulsion con iterador

        Collections.sort(ornis, OrniAzul.velocidadAscen);
        Iterator<OrniAzul> it = ornis.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
