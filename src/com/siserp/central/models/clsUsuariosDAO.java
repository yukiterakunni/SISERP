/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central.models;

import com.siserp.central.clsPrincipal;
import com.siserp.connection.clsConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JHON.VIVAS
 */
public class clsUsuariosDAO {
    private clsConnection prvObjClsConnection;
    private Connection prvObjConnection;
    private PreparedStatement vStatment;
    private clsUsuarios prvObjUsuarios;

    public clsUsuariosDAO(clsUsuarios pvObjUsuarios) {
        inicializarInstancias();
        this.prvObjUsuarios = pvObjUsuarios;
    }
    
    private void inicializarInstancias(){
        prvObjClsConnection = clsConnection.getObjConnection();
        this.prvObjConnection = prvObjClsConnection.conectar();
        this.prvObjUsuarios = null;
    }
    /* CREATE */
    public Boolean createUser(String userName,String password){
        
        Boolean vBoolResp = false;
        
        try{
            vStatment = prvObjConnection.prepareStatement("insert into t0000_users (f0000_user_name, f0000_pass) values (?,?)");
            vStatment.setString(1, userName);
            vStatment.setString(2, password);
            
            int numFA = vStatment.executeUpdate();
            if(numFA > 0){
               vBoolResp = true;
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error SQL" +ex);
        }
        return vBoolResp;
    }
    /* READ ALL */
    public ArrayList<clsUsuarios> listaUsuarios(clsUsuarios pvObjUsuarios){
        
        ArrayList listaUsuarios = new ArrayList();
        clsUsuarios vObjUsuarios;
        try{
           // Connection accesoBD = con.getconectar();
            
            vStatment = prvObjConnection.prepareStatement("select * from t0000_users");
            ResultSet vResultado = vStatment.executeQuery();
            
            while(vResultado.next()){
                vObjUsuarios = new clsUsuarios();
                vObjUsuarios.setPrvStrUserName(vResultado.getString(1));
                vObjUsuarios.setPrvStrUserPass(vResultado.getString(4));
                listaUsuarios.add(vObjUsuarios);  
                vObjUsuarios = null;
            }
                                  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error SQL "+ex);
        }
               
        return listaUsuarios;
    }
    /* READ FOR USER NAME */
    public clsUsuarios leerPorUsername(String pvUserName){
        try{            
            vStatment = prvObjConnection.prepareStatement("select * from t0000_users where f0000_user_name = ?");
            vStatment.setString(1, pvUserName);
            ResultSet vResultado = vStatment.executeQuery();
            
            while(vResultado.next()){
                prvObjUsuarios.setPrvStrUserName(vResultado.getString(1));
                prvObjUsuarios.setPrvStrUserPass(vResultado.getString(4));
            }                   
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error SQL "+ex);
        }  
        return prvObjUsuarios;
    }
}
