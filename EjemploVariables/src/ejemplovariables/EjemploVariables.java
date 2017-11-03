/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovariables;

/**
 *
 * @author angel
 */
public class EjemploVariables {
    
    final double PI = 3.1415926536; // PI es una constante
    int x;                          // x es una variable miembro
    double radio = 3.14, importe = 102.95; // Podemos declarar dos variables del mimso tipo
    
    int obtenerX(int x){            // x es un parámetro
        int valorantiguo = this.x;  // valorantiguo es una variable local
        return valorantiguo;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
