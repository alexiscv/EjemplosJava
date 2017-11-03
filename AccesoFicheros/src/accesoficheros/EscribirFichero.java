/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoficheros;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PCCOM
 */
public class EscribirFichero {
    
    // Este metodo sirve para escribir un fichero pequeño, con poco contenido
    // Para archivos grandes, es mas eficiente usar buffers.    
    public void escribir(){
        
        String frase = "Esto es una prueba de escritura.";
        
        try {
            // Escribimos en el fichero, que se crea si no existe
            // Añadiendo true, comprueba que exista el fichero y si existe, añade contenido
            FileWriter escritura = new FileWriter("texto.txt", true);
            
            for (int i = 0; i < frase.length(); i++) {
                
                escritura.write(frase.charAt(i)); // imprimimos caracter a caracter
                
            }
            
            escritura.close(); // cerramos el flujo de datos
            
        } catch (IOException ex) {
            System.out.println("No existe el fichero.");
        }
        
    }
    
    public void escribirConBuffer(){
        
        
        
    }    
    
}
