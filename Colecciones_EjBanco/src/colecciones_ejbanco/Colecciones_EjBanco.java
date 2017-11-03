/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_ejbanco;

import java.util.*;

/**
 *
 * @author PCCOM
 */
public class Colecciones_EjBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cl1,cl2,cl3,cl4,cl5;
        
        cl1 = new Cliente("Antonio Banderas", "00001", 200000);
        cl2 = new Cliente("Rafel Nadal", "00002", 250000);
        cl3 = new Cliente("Penelope Cruz", "00003", 5600000);
        cl4 = new Cliente("Julio Iglesias", "00004", 60000000);
        cl5 = new Cliente("Julio Iglesias", "00004", 60000000);
        
        // Creamos la colección
        // Set -> Interface que vamos a usar
        //<Cliente> -> Datos que vamos a manejar
        // HasSet -> clase derivada de SET que vamos a utilizar, indicamos tb el tipo generico
        Set <Cliente> clientesBanco = new HashSet<Cliente>();
        
        // Añadir elementos a la coleccion, con add
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);
        
        // Mostrar los clientes
        for (Cliente cliente : clientesBanco) {
            
            System.out.println(cliente.getNombre());
            
        }      
        
        System.out.println("----");   
        
        // Para borrar solo se puede hacer con iterator
        Iterator <Cliente> it = clientesBanco.iterator();
        
        while (it.hasNext()) {
            
            String nombre_cliente = it.next().getNombre(); // cargamos valor
            
            if( nombre_cliente.equals("Penelope Cruz")){
                System.out.println("-- borramos a penelope --");
                it.remove();
            }
            
            //System.out.println(nombre_cliente); // mostramos valor
            
        } 
        
        // Como recorrer la colección con for
        // for es mejor solo para recorrer y mostrar información
        for(Cliente cliente : clientesBanco){
            
            System.out.println(cliente.toString());
            
        }             
        
        
    }
    
}
