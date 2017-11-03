/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorelacionales;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EjemploRelacionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Clase Scanner para petición de datos
        Scanner teclado = new Scanner( System.in );
        int x, y;
        String cadena;
        boolean resultado;
        System.out.print("Introducir primer número: ");
        x = teclado.nextInt(); // Pedimos el primer número al usuario
        System.out.print("Introducir segundo número: ");
        y = teclado.nextInt(); // Pedimos el segundo número al usuario
        
        // Realizamos las comprobaciones
        cadena = (x == y) ? "Iguales" : "distintos";
        System.out.printf("Los números %d y %d son %s\n",x,y,cadena);
        
        resultado = (x != y);
        System.out.println("x != y // es " + resultado);
        
        resultado = (x < y);
        System.out.println("x < y // es " + resultado);
        
        resultado = (x > y);
        System.out.println("x > y // es " + resultado);
        
        resultado = (x <= y);
        System.out.println("x <= y // es " + resultado);
        
        resultado = (x >= y);
        System.out.println("x >= y // es " + resultado);        
        
    }
    
}
