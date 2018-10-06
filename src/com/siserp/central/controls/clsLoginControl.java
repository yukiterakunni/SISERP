/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central.controls;

import com.siserp.central.clsSesion;
import com.siserp.central.models.clsUsuarios;
import com.siserpjava.views.frmLogin;
import com.siserpjava.views.jdErrorOkCancel;
import com.siserp.central.models.clsUsuariosDAO;
import com.siserpjava.views.frmMainMDI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JHON.VIVAS
 */
public class clsLoginControl implements ActionListener{
    final frmLogin prvObjFrmLogin;
    private clsUsuariosDAO prvObjUsuariosDAO;
    private clsUsuarios prvObjUsuarios;
    
    //Constructor
    public clsLoginControl() {
        this.prvObjFrmLogin = new frmLogin();
        cargarCampos();
        inicializarInstancias();
    }
    
    public void showFrmLogin(){
        this.prvObjFrmLogin.setVisible(true);
    }
    
    private void inicializarInstancias(){
        prvObjUsuarios = new clsUsuarios(prvObjFrmLogin.txtUser.getText());
        prvObjUsuariosDAO = new clsUsuariosDAO(prvObjUsuarios);
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
                clsUsuarios vObjUsuariosLogin = new clsUsuarios(user);
                vObjUsuariosLogin.setPrvStrUserPass(pass);
                clsUsuarios vObjUsuariosBD = new clsUsuarios();
                clsUsuariosDAO vObjUsuariosDAO = new clsUsuariosDAO(vObjUsuariosBD);
                vObjUsuariosBD = vObjUsuariosDAO.leerPorUsername(user);
                if (autentificarUser(vObjUsuariosLogin, vObjUsuariosBD)){
                    clsSesion objSesionActual = clsSesion.getInstance();
                    objSesionActual.setPrvUserName(vObjUsuariosBD.getPrvStrUserName());
                    frmMainMDI MDI = new frmMainMDI();
                    this.prvObjFrmLogin.dispose();
                    MDI.setVisible(true);
                }
                else {
                    jdErrorOkCancel vjdError = new jdErrorOkCancel(prvObjFrmLogin,true,"Usuario o password invalidos.");
                    vjdError.setLocationRelativeTo(prvObjFrmLogin);
                    vjdError.setVisible(true);
                }
            }else{
                jdErrorOkCancel vjdError = new jdErrorOkCancel(prvObjFrmLogin,true,"Error de datos, no ha diligenciado los campos obligatorios.");
                vjdError.setLocationRelativeTo(prvObjFrmLogin);
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
