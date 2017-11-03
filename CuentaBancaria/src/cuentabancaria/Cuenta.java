package cuentabancaria;

public class Cuenta {
    
    private Persona cliente;
    private String numCuenta;
    private double saldo;

    public Cuenta(Persona cliente, String numCuenta, double saldo) {
        this.cliente = cliente;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    
    public boolean retirar(double cantidad){
        if(this.saldo > cantidad){
            this.saldo =- cantidad;
            System.out.println("Retidad dinero: Operación realizada con éxito.");
            return true;
        }else{
            System.out.println("Retidad dinero: Operación cancelada, saldo insuficiente.");
            return false;
        }
        
    }
    
    public boolean ingresar(double cantidad){
        this.saldo =+ cantidad;
        System.out.println("Ingresar dinero: Operación realizada con éxito.");
        return true;
    }
    
}
