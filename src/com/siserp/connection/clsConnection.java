/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.connection;
import com.siserpjava.views.frmError;
import com.siserpjava.views.jdErrorOkCancel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author JHON.VIVAS
 */
public class clsConnection {
    private static clsConnection prvObjInstanciaConnection;
    private static final String prvUser ="root", prvPass = "", prvDatabase = "siserp";
    private static final String prvServer = "jdbc:mysql://localhost:3306/siserp", driver ="com.mysql.jdbc.Driver";
    private static Connection prvObjConnection;
    public static String prvStrMensaje;
    //Constructor
    private clsConnection(){
        
    }
    
    public static clsConnection getObjConnection(){
        if(prvObjInstanciaConnection == null){
            prvObjInstanciaConnection = new clsConnection();
            initConnection();
        }
        return prvObjInstanciaConnection;
    }
    
    public static void initConnection(){
        //prvObjConnection = null;
        try{
            Class.forName(driver);
            prvObjConnection = DriverManager.getConnection(prvServer, prvUser,prvPass);
            if(prvObjConnection != null){
                prvStrMensaje = "Conexion establecida";
            }else {
                frmError vfrmError = new frmError();
                vfrmError.setLocationRelativeTo(null);
                vfrmError.setVisible(true);
            }
        } catch(ClassNotFoundException | SQLException ex){
            prvStrMensaje = "Error en la conexion " + ex;
            frmError vfrmError = new frmError();
            vfrmError.txtAreaError.setText("No hay conexion con la base de datos");
            vfrmError.setLocationRelativeTo(null);
            vfrmError.setVisible(true);
            vfrmError.setAlwaysOnTop(true);
        }
        /*finally{
            prvStrMensaje = "Error en la conexion ";
        }*/
    }
    
    public Connection conectar(){
        if(prvObjConnection == null){
            try{
                Class.forName(driver);
                prvObjConnection = DriverManager.getConnection(prvServer, prvUser,prvPass);
            }catch(ClassNotFoundException | SQLException ex){
                prvStrMensaje = "Error en la conexion " + ex;
            }
        }
        return prvObjConnection;
    }
    
    public void desconectar (){
        prvObjConnection = null;
        if(prvObjConnection == null){
                prvStrMensaje = "Conexion terminada";
            }
    }
    
    public String getMensaje(){
        return prvStrMensaje;
    }
}
