/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresasignacion;

/**
 *
 * @author angel
 */
public class OperadoresAsignacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y;
        x = 5; // operador asignación
        y = 3; // operador asignación
        
        // operadores de asignación combinados
        System.out.printf("El valor de x es %d y el valod de y es %d\n", x, y);
        x += y;
        // Podemos utilizar indistintamente printf o println
        System.out.println(" Suma combinada: x += y " + " ......... x vale " + x);
        x = 5;
        x -= y;
        System.out.println(" Resta combinada: x -= y " + " ......... x vale " + x);
        x = 5;
        x *= y;
        System.out.println(" Producto combinado: x *= y " + " ......... x vale " + x);
        x = 5;
        x /= y;
        System.out.println(" División combinada: x /= y " + " ......... x vale " + x);        
        x = 5;
        x %= y;
        System.out.println(" Resto combinado: x %= y " + " ......... x vale " + x);        
        
        
    }
    
}
