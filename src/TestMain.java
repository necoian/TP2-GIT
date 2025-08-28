
import Entidades.Castor;
import Entidades.OrniAzul;
import java.util.Scanner;


public class TestMain {

    public static void main(String[] args) {
        Scanner leerT = new Scanner(System.in); 
       
        
        System.out.println("Ingrese la velocidad del castor (hasta 8km/h como maximo)");
        int vel = leerT.nextInt();
        //instanciamos al papa Castor
        Castor c1 = new Castor(vel);
        System.out.println("Ingrese la velocidad de propulsion(min 5km/h y  maximo 10km/h)");
        System.out.println("Ornitorrinco AZUL 1");
        int vel2 = leerT.nextInt();
        System.out.println("Ornitorrinco AZUL 2");
        int vel3 = leerT.nextInt();
        //instanciamos a los dos hermanos Ornitorrincos Azules
        OrniAzul o1 = new OrniAzul(vel, vel2,"Bluey");
        OrniAzul o2 = new OrniAzul(vel, vel3,"Blue");
    }
    
}
