/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central.controls;

import com.siserp.central.clsSesion;
import com.siserp.central.models.clsUsuarios;
import com.siserp.central.models.clsUsuariosDAO;
import com.siserp.views.central.frmAdminUsers;
import com.siserp.views.central.frmLogin;
import com.siserp.views.central.frmLoginUsers;
import com.siserp.views.central.jdErrorOkCancel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JHON.VIVAS
 */
public class clsLoginUsersControl implements ActionListener{
    final frmLoginUsers prvObjLoginUsers;

    public clsLoginUsersControl() {
        this.prvObjLoginUsers = new frmLoginUsers();
        cargarCampos();
    }
    
    private void cargarCampos(){
        this.prvObjLoginUsers.txtUser.addActionListener(this);
        this.prvObjLoginUsers.txtPass.addActionListener(this);
        this.prvObjLoginUsers.btnEnviar.addActionListener(this);
        this.prvObjLoginUsers.btnVolver.addActionListener(this);
    }
    
    public void showFrmLoginUsers(){
        this.prvObjLoginUsers.setLocationRelativeTo(null);
        this.prvObjLoginUsers.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ObjectEvent) {
        if(ObjectEvent.getSource() == prvObjLoginUsers.btnVolver){
            prvObjLoginUsers.dispose();
            frmLogin vObjFrmLogin = new frmLogin();
            vObjFrmLogin.setVisible(true);
        }
        if(ObjectEvent.getSource() == prvObjLoginUsers.btnEnviar){
            String user = prvObjLoginUsers.txtUser.getText();
            String pass = String.valueOf(prvObjLoginUsers.txtPass.getPassword());
            
            //Valida que los campos no esten vacios
            if(!user.equals("") && !user.equals("")){
                clsUsuarios vObjUsuariosLogin = new clsUsuarios(user);
                vObjUsuariosLogin.setPrvStrUserPass(pass);
                clsUsuarios vObjUsuariosBD = new clsUsuarios();
                clsUsuariosDAO vObjUsuariosDAO = new clsUsuariosDAO(vObjUsuariosBD);
                vObjUsuariosBD = vObjUsuariosDAO.leerPorUsername(user);
                if (autentificarUser(vObjUsuariosLogin, vObjUsuariosBD)){
                    clsSesion objSesionActual = clsSesion.getInstance();
                    objSesionActual.setPrvUserName(vObjUsuariosBD.getPrvStrUserName());
                    clsAdminUserControl vObjAdminUserControl = new clsAdminUserControl();
                    vObjAdminUserControl.showFrmLoginUsers();
                    prvObjLoginUsers.dispose();
                }
                else {
                    jdErrorOkCancel vjdError = new jdErrorOkCancel(prvObjLoginUsers,true,"Usuario o password invalidos.");
                    vjdError.setLocationRelativeTo(prvObjLoginUsers);
                    vjdError.setVisible(true);
                }
            }else{
                jdErrorOkCancel vjdError = new jdErrorOkCancel(prvObjLoginUsers,true,"Error de datos, no ha diligenciado los campos obligatorios.");
                vjdError.setLocationRelativeTo(prvObjLoginUsers);
                vjdError.setVisible(true);
            }
        }
    }
    private Boolean autentificarUser(clsUsuarios pvObjUserLogin, clsUsuarios pvObjUserBD){
        Boolean vBoolResponse;
        vBoolResponse = false;
        if (pvObjUserLogin.getPrvStrUserPass().equals(pvObjUserBD.getPrvStrUserPass())){
            vBoolResponse = true;
        }
        return vBoolResponse;
    }
}
