/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central;

import com.siserp.central.controls.clsLoginControl;
import com.siserp.connection.clsConnection;
import com.siserpjava.views.frmLogin;

/*
 * @author JHON.VIVAS
 * Metodo principal de la app
 */
public class clsPrincipal {
    private boolean prvBoolInitState;
    public String pubStrLang;
    
    private static boolean initApp(){
            setLookFeel();
            return true;
        }
    
    private static void mostrarLogin(){
        clsLoginControl vObjLogin = new clsLoginControl();
        vObjLogin.showFrmLogin();
    }
    
    private static void setLookFeel(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        //COLOCAR LOOK AND FEEL PREDETERMINADO DE WINDOWS
        if (initApp()) {
            mostrarLogin();
        }
    }
    
    
    
}
