/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposenumerados;

/**
 *
 * @author angel
 */
public class TiposEnumerados {
    
    public enum Dias{Lunes, Martes, Miercoles, Jueves, Viernes, Sábado, Domingo};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dias diaactual = Dias.Martes;
        Dias diasiguiente = Dias.Miercoles;
        
        System.out.print("Hoy es: ");
        System.out.println(diaactual);
        System.out.println("Mañana\nes\n"+diasiguiente);
        
    }
    
}
