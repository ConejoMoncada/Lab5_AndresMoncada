/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_andresmoncada;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Mundo {
    private ArrayList<Criatura> criaturas = new ArrayList();
    private String nombre;
    private long peso;

    public Mundo() {
    }

    public Mundo(String nombre, long peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public ArrayList<Criatura> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(ArrayList<Criatura> criaturas) {
        this.criaturas = criaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPeso() {
        return peso;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
