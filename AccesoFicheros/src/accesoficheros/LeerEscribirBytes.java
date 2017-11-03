/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoficheros;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author PCCOM
 */
public class LeerEscribirBytes {
    
    public void leer(){

        int contador = 0;
        
        // Leer un archivo
        try {
            // Archivo que vamos a leer
            FileInputStream archivoLectura = new FileInputStream("img.jpg");
            
            // Variable para controlar cuando terminamos de leer el archivo
            boolean finalArchivo = false;
        
            // Mientras la variable sea false...
            while( !finalArchivo ){
                
                // Almacenamos byte a byte
                int byteEntrada = archivoLectura.read();
                
                // Si recogemos -1, final de archivo, salimos dle bucle
                if (byteEntrada == -1) {
                    finalArchivo = true;
                    
                }
                
                System.out.println(byteEntrada);
                
                contador++;

            }
            
            archivoLectura.close();
            
        } catch (IOException ex) {
            System.out.println("Error al abrir el archivo.");
        }    
        
        System.out.println("Bytes: "+contador);
        
    }
    
    public int totalBytes(){

        int contador = 0;
        
        // Leer un archivo
        try {
            // Archivo que vamos a leer
            FileInputStream archivoLectura = new FileInputStream("img.jpg");
            
            // Variable para controlar cuando terminamos de leer el archivo
            boolean finalArchivo = false;
        
            // Mientras la variable sea false...
            while( !finalArchivo ){
                
                // Almacenamos byte a byte
                int byteEntrada = archivoLectura.read();
                
                // Si recogemos -1, final de archivo, salimos dle bucle
                if (byteEntrada == -1) {
                    finalArchivo = true;
                    
                }
                
                contador++;

            }
            
            archivoLectura.close();
            
        } catch (IOException ex) {
            System.out.println("Error al abrir el archivo.");
        }    
        
        // quitamos la ultima posición, q es "-1"
        return contador-1;
        
    }    
    
    public void duplicar(){

        // Contador para recorrer todos los bytes del archivo origen
        int contador = 0;
        
        // Creamos un array para almanecar los bytes del fichero origen
        int datos_entrada[] = new int[this.totalBytes()];
        
        // Leer un archivo
        try {
            // Archivo que vamos a leer
            FileInputStream archivoLectura = new FileInputStream("img.jpg");
            
            // Variable para controlar cuando terminamos de leer el archivo
            boolean finalArchivo = false;
        
            // Mientras la variable sea false...
            while( !finalArchivo ){
                // Almacenamos byte a byte
                int byteEntrada = archivoLectura.read();
                
                // Si no estamos en el final del fichero, guardamos el byte actual en el array
                if (byteEntrada != -1) {
                    // Almacenamos el dato en la posición del array
                    datos_entrada[contador] = byteEntrada;
                    
                    // Imprimimos las posiciones del array
                    System.out.println(datos_entrada[contador]);                    
                    
                }else{                
                    // Si recogemos -1, final de archivo, salimos dle bucle                
                    finalArchivo = true;
                    
                }
                
                contador++;

            }
            
            archivoLectura.close();
            
        } catch (IOException ex) {
            System.out.println("Error al abrir el archivo.");
        }
        
    }    
    
}
