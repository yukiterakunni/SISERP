/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.usuarios;

/**
 *
 * @author JHON.VIVAS
 */
public class clsAtleta {
    private String nombre;
    private String nacionalidad;
    private Double marcaPersonal;

    public clsAtleta(String nombre, String nacionalidad, Double marcaPersonal) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.marcaPersonal = marcaPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Double getMarcaPersonal() {
        return marcaPersonal;
    }

    public void setMarcaPersonal(Double marcaPersonal) {
        this.marcaPersonal = marcaPersonal;
    }
    
    
}
