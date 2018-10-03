/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central;
import java.sql.*;
/**
 *
 * @author JHON.VIVAS
 */
public class clsConection {
    //inicializamos la cadena de conexion
    //jdbc:mysql://[host1]:[port1],[host2]:[port2]/[databaseName]?[property1=value1]&[property2=value2]
    final String url = "jdbc:mysql://localhost:3306/peso_ideal?useSSL=false";
    Connection conexion;
    public ResultSet ejecutarQuery(String query) 
    throws SQLException{
        Statement instruccion = conexion.createStatement();
        ResultSet resultado = instruccion.getResultSet();
        try{
            //Creamos un objeto de sentencia
            
            resultado = instruccion.executeQuery(query);
            return resultado;
        }catch(SQLException e){
        }
        return resultado;
    }

    public clsConection(String user, String pass) {
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(url, user, pass);
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
