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
public class clsUsuarios {
    private Long lngCodigo;
    private String strDescripcion;
    private int intIndTipoUsuario;
    private int intIndEstado;
    public String strNombre1;
    public String strNombre2;
    public String strApellido1;
    public String strApellido2;
    public int intCodigoPais;
    public int intCodigoCiudad;
    public String strDireccion;
    public String strTelefono1;
    public String strTelefono2;
    public String strNotas;

    public clsUsuarios(Long lngCodigo, String strDescripcion, int intIndTipoUsuario, int intIndEstado) {
        this.lngCodigo = lngCodigo;
        this.strDescripcion = strDescripcion;
        this.intIndTipoUsuario = intIndTipoUsuario;
        this.intIndEstado = intIndEstado;
    }

    public Long getLngCodigo() {
        return lngCodigo;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }

    public int getIntIndTipoUsuario() {
        return intIndTipoUsuario;
    }

    public int getIntIndEstado() {
        return intIndEstado;
    }
    
    
    
}
