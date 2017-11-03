/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_ejbanco;

import java.util.Objects;

/**
 *
 * @author PCCOM
 */
public class Cliente {

    private String nombre;
    private String n_cuenta;
    private double saldo;

    /**
     * Contructor
     *
     * @param nombre
     * @param n_cuenta
     * @param saldo
     */
    public Cliente(String nombre, String n_cuenta, double saldo) {
        this.nombre = nombre;
        this.n_cuenta = n_cuenta;
        this.saldo = saldo;
    }

    // Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // toString
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", n_cuenta=" + n_cuenta + ", saldo=" + saldo + '}';
    }

    /**
     * hashCode es el nombre que tiene un objeto en la memoria heap
     * El método hasCode nos permite diferenciar dos objetos a partir de ciertos atributos
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.n_cuenta);
        return hash;
    }

    /**
     * Equals nos permite diferenciar dos objetos a partir de ciertos atributos
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.n_cuenta, other.n_cuenta)) {
            return false;
        }
        return true;
    }
    
    
        
}
