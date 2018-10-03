/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JHON.VIVAS
 */
import java.sql.DriverManager;
public class clsConnection {
    private static final String prvUser ="root", prvPass = "", prvDatabase = "peso_ideal";
    private static final String prvServer = "jdbc:mysql://localhost:3306/peso_ideal", driver ="com.mysql.jdbc.Driver";
    private static Connection prvObjConnection;
    public String prvStrMensaje;
    //Constructor
    public clsConnection(){
        prvObjConnection = null;
        try{
            Class.forName(driver);
            prvObjConnection = DriverManager.getConnection(prvServer, prvUser,prvPass);
            if(prvObjConnection != null){
                prvStrMensaje = "Conexion establecida";
            }
        } catch(ClassNotFoundException | SQLException ex){
            prvStrMensaje = "Error en la conexion " + ex;
        }
        /*finally{
            prvStrMensaje = "Error en la conexion ";
        }*/
    }
    
    public Connection conectar(){
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
