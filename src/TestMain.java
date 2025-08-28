
import Entidades.Castor;
import Entidades.OrniAzul;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class TestMain {

    public static void main(String[] args) {
        Scanner leerT = new Scanner(System.in); 
       
        
        System.out.println("Ingrese la velocidad del castor ( desde 1 km/h hasta 8km/h como maximo)");
        int vel = leerT.nextInt();
        while(vel > 8 || vel < 1){ //si el usuario ingresa un valor fuera del rango entra al bucle
            System.out.println("INGRESE Dentro del rango (1 km/h 8 km/h)");
            vel = leerT.nextInt();
        }
        //instanciamos al papa Castor
        Castor c1 = new Castor(vel);
        
        System.out.println("Ingrese la velocidad de propulsion(min 5km/h y  maximo 10km/h)");
        System.out.println("Ornitorrinco AZUL 1");
        int vel2 = leerT.nextInt();
        while(vel2 > 10 || vel2 < 5){ //si el usuario ingresa un valor fuera del rango entra al bucle
            System.out.println("Ingrese dentro del rango");
            vel2 = leerT.nextInt();
        }
        System.out.println("Ornitorrinco AZUL 2");
        int vel3 = leerT.nextInt();
        while(vel3 > 10 || vel3 < 5){ //si el usuario ingresa un valor fuera del rango entra al bucle
            System.out.println("Ingrese dentro del rango");
            vel3 = leerT.nextInt();
        }
        //instanciamos a los dos hermanos Ornitorrincos Azules
        OrniAzul o1 = new OrniAzul(vel, vel2,"Bluey");
        OrniAzul o2 = new OrniAzul(vel, vel3,"Blue");
        //metodo de nadar
        System.out.println("bluey");
        o1.nadar();
        System.out.println("blue");
        o2.nadar();
        //metodo de tocarGuitarra
        System.out.println("bluey");
         o1.tocarGuitarra();
        System.out.println("blue");
         o2.tocarGuitarra();
         //creamos arreglo
        LinkedHashSet<Castor>ornitorrincos = new LinkedHashSet();
        //Agregamos los ornitorrincos
        try{
          Castor[] ornit = new Castor[3];
        //ornit[0] = ornitorrinco verde;
          ornit[1] = o1;
          ornit[2] = o2;
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Se salio del arreglo");
        }finally{
            System.out.println("ornitohermanos juntos al fin");
        }
       
         
    }
    
}
