/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.controlsComercial;

import com.siserp.models.clsTerceroDAO;
import com.siserp.views.comercial.jpTerceros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author JHON.VIVAS
 */
public class clsTerceroControl implements ActionListener,KeyListener{
    
    private jpTerceros vObjJPTerceros; 
    private clsTerceroDAO clsTerceroDAO;
    private String prvStrId;
    private Short prvShrTipoID;
    private String prvStrNumId;
    private Short prvShrIndPersona;
    private String prvStrNombreEst;
    private String prvStrRazonSocial;
    private String prvStrApellido1;
    private String prvStrApellido2;
    private String prvStrNombre1;
    private String prvStrNombre2;
    private Short prvShrIndActivo;
    private String prvStrNotas; 

    public clsTerceroControl(jpTerceros vObjJPTerceros, clsTerceroDAO clsTerceroDAO) {
        this.vObjJPTerceros = vObjJPTerceros;
        this.clsTerceroDAO = clsTerceroDAO;
    }

    public void LlenarAtributos(){
        prvStrId = vObjJPTerceros.txtCodigo.getText();
        prvShrTipoID = (short) vObjJPTerceros.cboTipo.getSelectedIndex();
        prvStrNumId = vObjJPTerceros.txtNumero.getText();
        prvStrRazonSocial = vObjJPTerceros.txtRazonSocial.getText();
        prvStrNombreEst = vObjJPTerceros.txtNombreEstablecimiento.getText();
        prvStrNombre1 = vObjJPTerceros.txtNombre1.getText();
        prvStrNombre2 = vObjJPTerceros.txtNombre2.getText();
        prvStrApellido1 = vObjJPTerceros.txtApellido1.getText();
        prvStrApellido2 = vObjJPTerceros.txtApellido2.getText();
        prvStrNotas = vObjJPTerceros.txtAreaNotas.getText();
        if(vObjJPTerceros.chkEstado.isSelected()){
            prvShrIndActivo = 1;
        }else{
            prvShrIndActivo = 0;
        }
        if(vObjJPTerceros.rbtPersonaJuridica.isSelected()){
            prvShrIndPersona = 1;
        }else if (vObjJPTerceros.rbtPersonaNatural.isSelected()){
            prvShrIndPersona = 2;
        }else if (vObjJPTerceros.rbtSinIdentificar.isSelected()){
            prvShrIndPersona = 3;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*if(e.getSource() == vObjJPTerceros.btnGuardar){
            LlenarAtributos();
        }*/
        /*if(e.getSource()==vObjJPTerceros.btnElimnar){
            
        }*/
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
