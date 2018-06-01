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
public class Criatura {
    private String raza;
    private int energia;
    private int edadmax;
    private String region;
    private long poblacion;
    private ArrayList objetos = new ArrayList();
    private int peso;

    public Criatura() {
    }

    public Criatura(String raza, int energia, int edadmax, String region, long poblacion, int peso) {
        this.raza = raza;
        this.energia = energia;
        this.edadmax = edadmax;
        this.region = region;
        this.poblacion = poblacion;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getEdadmax() {
        return edadmax;
    }

    public void setEdadmax(int edadmax) {
        this.edadmax = edadmax;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    public ArrayList getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return raza;
    }
    
}
