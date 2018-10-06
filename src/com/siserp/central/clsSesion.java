/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central;

/**
 *
 * @author JHON.VIVAS
 */
public class clsSesion {
    //DECLARACION
    private static clsSesion objInstanciaSesion;
    private String prvUserName;
    private String prvLangApp;
    //private static clsSesion ObjInstanciaSesion = new clsSesion();

    public clsSesion() {
        
    }

    public String getPrvUserName() {
        return prvUserName;
    }

    public void setPrvUserName(String prvUserName) {
        this.prvUserName = prvUserName;
    }

    public String getPrvLangApp() {
        return prvLangApp;
    }

    public void setPrvLangApp(String prvLangApp) {
        this.prvLangApp = prvLangApp;
    }
    
    //PARA OBTENER LA INSTANCIA UNICAMENTE POR ESTE METODO
    public static clsSesion getInstance(){
        if(objInstanciaSesion == null){
            objInstanciaSesion = new clsSesion();
        }
        return objInstanciaSesion;
    }
    
}
