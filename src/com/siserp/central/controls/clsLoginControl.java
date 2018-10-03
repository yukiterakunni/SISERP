/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central.controls;

import com.siserpjava.views.frmLogin;
import com.siserpjava.views.jdErrorOkCancel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JHON.VIVAS
 */
public class clsLoginControl implements ActionListener{
    final frmLogin prvObjFrmLogin;

    public clsLoginControl() {
        this.prvObjFrmLogin = new frmLogin();
        cargarCampos();
    }
    
    public void showFrmLogin(){
        this.prvObjFrmLogin.setVisible(true);
    }
    
    private void cargarCampos(){
        this.prvObjFrmLogin.txtUser.addActionListener(this);
        this.prvObjFrmLogin.txtPass.addActionListener(this);
        this.prvObjFrmLogin.btnEnviar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ObjectEvent) {
        if (ObjectEvent.getSource() == prvObjFrmLogin.btnEnviar) {
            
            String user = prvObjFrmLogin.txtUser.getText();
            String pass = String.valueOf(prvObjFrmLogin.txtPass.getPassword());
            
            //Valida que los campos no esten vacios
            if(!user.equals("") && !user.equals("")){
                
            }else{
                jdErrorOkCancel vjdError = new jdErrorOkCancel(prvObjFrmLogin,true,"Error de datos, no ha diligenciado los campos obligatorios.");
                vjdError.setVisible(true);
            }
        }
    }
    
    
}
