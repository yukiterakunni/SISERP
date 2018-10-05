/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central.models;

/**
 *
 * @author JHON.VIVAS
 */
public class clsUsuarios {
    private String prvStrUserName;
    private String prvStrUserPass;

    public clsUsuarios(String prvStrUserName) {
        this.prvStrUserName = prvStrUserName;
    }
    
    public clsUsuarios() {
        //CONSTRUCTOR VACIO
    }
    
    public String getPrvStrUserName() {
        return prvStrUserName;
    }

    public void setPrvStrUserName(String prvStrUserName) {
        this.prvStrUserName = prvStrUserName;
    }

    public String getPrvStrUserPass() {
        return prvStrUserPass;
    }

    public void setPrvStrUserPass(String prvStrUserPass) {
        this.prvStrUserPass = prvStrUserPass;
    }
}
