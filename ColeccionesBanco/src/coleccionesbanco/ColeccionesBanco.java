/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesbanco;

import java.util.*;

/**
 *
 * @author PCCOM
 */
public class ColeccionesBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos los clientes
        Cliente cl1 = new Cliente("Alexis Castaño", "00001", 100000);
        Cliente cl2 = new Cliente("Paco Jones", "00002", 200000);
        Cliente cl3 = new Cliente("Francisco Tabarro", "00003", 30000);
        Cliente cl4 = new Cliente("Isabel Fajardo", "00004", 40000);
        Cliente cl5 = new Cliente("Isabel Fajardo", "00004", 40000);
        
        // Creamos la colección
        // Set: tipo de interface
        // <Cliente> Tipo generico, indicamos el tipo de datos que vamos a almacenar
        // new HashSet: Clase que vamos a utilizar para usar el SET, también indicamos el tipo generico
        Set <Cliente> clientesbanco = new HashSet<Cliente>();
        
        // Como agregar los clientes
        // Esta interface tiene un método add para añadir.
        // El método add es capaz de saber si un elemento está duplicado o no
        // Pero como la clase es propia, debemos de dobreescribir el método equals en mi clase Cliente
        clientesbanco.add(cl1);
        clientesbanco.add(cl2);
        clientesbanco.add(cl3);
        clientesbanco.add(cl4);
        clientesbanco.add(cl5); // No lo añade porque es un resultado repetido.
        
        // Podemos recorrer una colección con un iterator
        // Llamamos a la interface e indicamos el tipo, en este claso Cliente y el nombre de nuestro iterador
        Iterator<Cliente> iterador = clientesbanco.iterator();
        
        // Recorremos el iterador mientras haya elementos
        // con hasNext() detectamos si hay un elemento siguiente.
        // Para eliminar con remove solo se puede hacer con iterator
        // for es mejor solo para mostrar datos.
        while( iterador.hasNext() ){
            
            // Almacenamos el nombre del objeto que estamos viendo en este momento.
            String nombre_cliente = iterador.next().getNombre();
            //System.out.println("Nombre del cliente: "+nombre_cliente);
            
            if( nombre_cliente.equals("Francisco Tabarro") ){
                
                iterador.remove();
                
            }
            
        }
        
        // Como recorrer la colección con for
        // for es mejor solo para recorrer y mostrar información
        for(Cliente cliente : clientesbanco){
            
            System.out.println(cliente.toString());
            
        }       
        
    }
    
}
