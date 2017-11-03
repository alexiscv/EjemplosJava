/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoficheros;

import java.io.*;

/**
 *
 * @author PCCOM
 */
public class LeerFichero {
    
    // Este metodo sirve para leer un fichero pequeño, con poco contenido
    // Para archivos grandes, es mas eficiente usar buffers.
    public void lee(){
        
        try {
            // Archivo que vamos a leer
            FileReader entrada = new FileReader("texto.txt");
            
            // Variable donde almacenaremos los valores numericos de los caracteres del archivo
            int c = 0; // iniciamos con valor 0 para poder crear el while
            
            // Mientras no llegue al final (read devuelve -1 cuando llega al final del cihero)
            while( c != -1 ){
                
                c = entrada.read();         // almacenamos en c el codigo del caracter correcpondiente
                char letra = (char) c;      // convertimos a caracter el código de c con un cast.
                System.out.print(letra);    // imprimimos los caracteres legibles
                
            }
            
            entrada.close(); // cerrar flujo de datos

        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo.");
        }
        
    }
    
    public void leeConBuffer(){
        
        try {
            // Archivo que vamos a leer
            FileReader entrada = new FileReader("texto.txt");
            
            // Almacenamos el fichero en nuestro buffer
            BufferedReader mibuffer = new BufferedReader(entrada);
            
            // String donde guardaremos el contenido del archivo
            String linea = "";
            
            // Mientras readline no devuelva null, leemos las lineas del buffer
            while( linea != null ){
                
                linea = mibuffer.readLine();
                System.out.println(linea);
                
            }
            
            entrada.close(); // cerrar flujo de datos

        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo.");
        }
        
    }    
    
}
