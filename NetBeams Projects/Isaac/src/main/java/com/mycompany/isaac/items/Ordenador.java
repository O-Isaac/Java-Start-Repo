/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.isaac.items;

/**
 *
 * @author usumaniana
 */
public class Ordenador {
    private String Marca;
    private String Procesador;
    private String Pantalla;
    
    private boolean Encendido;
    private boolean Presentacion;
    
    public void setMarca(String marca) {
        this.Marca = marca;
    }
    
    public void setProcesador(String procesador) {
        this.Procesador = procesador;
    }
    
    public void setPantalla(String pantalla) {
        this.Pantalla = pantalla;
    }
    
    void setPresentacion(boolean presentacion) {
        this.Presentacion = presentacion;
    }
    
    void setEncendido(boolean encendido) {
        this.Encendido = encendido;
    }
    
    String getMarca () {
        return this.Marca;
    }
    
    String getProcesador () {
        return this.Procesador;
    }
    
    String getPantalla() {
        return this.Pantalla;
    }
    
    boolean getEncendido() {
        return this.Encendido;
    }
    
    boolean getPresentacion() {
        return this.Presentacion;
    }
}