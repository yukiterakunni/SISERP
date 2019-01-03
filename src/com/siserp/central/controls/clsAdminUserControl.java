/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central.controls;

import com.siserp.views.central.frmAdminUsers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JHON.VIVAS
 */
public class clsAdminUserControl implements ActionListener{
    
    final frmAdminUsers prvObjFrmAdminUsers;

    public clsAdminUserControl() {
        this.prvObjFrmAdminUsers = new frmAdminUsers();
        cargarCampos();
    }

    private void cargarCampos(){
        this.prvObjFrmAdminUsers.btnBuscar.addActionListener(this);
        this.prvObjFrmAdminUsers.btnCrearPerfil.addActionListener(this);
        this.prvObjFrmAdminUsers.btnSalvar.addActionListener(this);
        this.prvObjFrmAdminUsers.btnVolverLogin.addActionListener(this);
        this.prvObjFrmAdminUsers.cboTipo.addActionListener(this);
        this.prvObjFrmAdminUsers.chkEstadoAct.addActionListener(this);
        this.prvObjFrmAdminUsers.txtCodigo.addActionListener(this);
        this.prvObjFrmAdminUsers.txtNumero.addActionListener(this);
        this.prvObjFrmAdminUsers.txtPass.addActionListener(this);
        this.prvObjFrmAdminUsers.txtRepPass.addActionListener(this);
        this.prvObjFrmAdminUsers.txtUserName.addActionListener(this);
    }
    
    public void showFrmLoginUsers(){
        this.prvObjFrmAdminUsers.setLocationRelativeTo(null);
        this.prvObjFrmAdminUsers.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ObjectEvent) {
        if(ObjectEvent.getSource() == prvObjFrmAdminUsers.btnVolverLogin){
            clsLoginControl vObjLoginControl = new clsLoginControl();
            vObjLoginControl.showFrmLogin();
            prvObjFrmAdminUsers.dispose();
        }
    }
    
}
