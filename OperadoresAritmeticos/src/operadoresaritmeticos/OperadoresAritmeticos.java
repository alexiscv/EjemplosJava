/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author angel
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short x = 7;
        int y = 5;
        float f1 = 13.5f;
        float f2 = 8f;
        System.out.println("El valor de x es "+ x +" y el valor de y es "+y);
        System.out.println("El resultado de x + y es "+(x+y));
        System.out.println("El resultado de x - y es "+ (x-y));
        System.out.printf("%s\n%s%s\n","División entera:","x / y = ",(x/y));
        System.out.println("Resto de la división entera: x%y = "+(x%y));
        System.out.printf("El valor de f1 es %f y el de f2 es %f\n",f1,f2);
        System.out.println("El resultado de f1 / f2 es "+ (f1+f2));
        
    }
    
}
