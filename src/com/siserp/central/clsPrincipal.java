/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central;

import com.siserp.central.controls.clsLoginControl;
import com.siserpjava.views.frmLogin;

/**
 *
 * @author JHON.VIVAS
 * Metodo principal de la app
 */
public class clsPrincipal {
    private boolean prvBoolInitState;
    public String pubStrLang;
    
    private static boolean initApp(){
            return true;
        }
    
    private static void mostrarLogin(){
        clsLoginControl vObjLogin = new clsLoginControl();
        vObjLogin.showFrmLogin();
    }
    
    public static void main(String args[]) {
        if (initApp()) {
            mostrarLogin();
        }
        
    }
    
    
    
}
