/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PCCOM
 */
public class AccesoFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        /*
         Trabajo con datos
        */        
        
        LeerFichero accediendo = new LeerFichero();
        EscribirFichero escribiendo = new EscribirFichero();
        
        //accediendo.lee();
        //escribiendo.escribir();
        
        //escribiendo.escribirConBuffer();
        //accediendo.leeConBuffer();
        
        /*
         Trabajo con archivos byte
        */
        
        LeerEscribirBytes controlador = new LeerEscribirBytes();
        
        controlador.duplicar();
        
    }
    
}
