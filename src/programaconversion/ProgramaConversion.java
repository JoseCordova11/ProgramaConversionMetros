                                                                                          /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaconversion;
import java.util.Scanner;
/**
 *
 * @author ASUS GAMER
 */
public class ProgramaConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables
        
        double m, cm, km, ft, in;
        m = 0; cm = 0; km = 0; ft = 0; in = 0;
        
        System.out.println("Programa que convierte cantidades en metros a cm,km,ft,in");
        
        //Lectura de datos
        
        System.out.println("Ingrese la cantidad en metros");
        m = leer.nextDouble();
        
        //Proceso
        cm = (m * 100);
        km = (m * 0.001);
        ft = (m * 3.28);
        in = (m* 39.37);
        
        //Salida de datos
        System.out.println("El cantidad en metros es:" +m+ 
                "la conversion en centimetros es:" +cm+
                "la conversion en kilometros es:" +km+
                "la conversion en pies es:" +ft+
                "la conversion en pulgadas es:" +in);
                                    
    }
    
}
