package cuentabancaria;

import java.util.Scanner;

public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Creamos a las personas
        Persona persona1 = new Persona("Eva", "Porada", "11111111F", 18);
        Persona persona2 = new Persona("Jazinto", "Cinete", "22222222A", 25);
        
        // Creamos sus cuentas
        Cuenta cuenta1 = new Cuenta(persona1, "1122334455", 1000);
        Cuenta cuenta2 = new Cuenta(persona2, "6677889910", 0);
        
        // Preguntamos por el dinero a retirar e intentamos retirarlo
        System.out.println("Que cantidad de dinero retirará Eva?");
        double cantidad_retirar = teclado.nextDouble();
        
        cuenta1.retirar(cantidad_retirar);
        
        // Hacemos un ingreso a persona2
        cuenta2.ingresar(300);
        
        // Ahora intentamos sacar 500€ de la cuenta 2
        cuenta2.retirar(500); 
        
    }
    
}
