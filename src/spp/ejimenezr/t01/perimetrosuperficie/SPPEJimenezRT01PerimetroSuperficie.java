/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejimenezr.t01.perimetrosuperficie;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPPEJimenezRT01PerimetroSuperficie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculemos perimetro y superficie de un rectángulo");
        //Declaración de variables
        int opEntrada;
        double sup, per, base, alt;
        Scanner kb= new Scanner (System.in);
        //Solicitud de datos
        System.out.println("Medida de la base");
        base= kb.nextDouble();
        System.out.println("Medida de la altura");
        alt= kb.nextDouble();
        //Operaciones
        sup=(base*alt);
        per=((base*2)+(alt*2));
        //Resultados
        System.out.println("La superficie del rectangulo es "+sup);
        System.out.println("El perimetro del rectángulo es "+ per);
        System.out.println("Fin del problema");
    }
    
}
