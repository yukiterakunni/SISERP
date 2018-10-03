/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.models;

import com.siserp.connection.clsConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author JHON.VIVAS
 */
public class clsTerceroDAO{
    private clsTercero prvObjTercero;
    private clsConnection prvConeccion;

    public clsTerceroDAO() {
        this.prvConeccion = new clsConnection();
    }
    
    private final String SQL_INSERT =  "insert into t0001_terceros values ()";
    private final String SQL_UPDATE =  "insert into t0001_terceros values ()";
    private final String SQL_DELETE =  "insert into t0001_terceros values ()";
    private final String SQL_SELECT =  "insert into t0001_terceros values ()";

    
    public int insert(clsTercero tercero) throws SQLException {
        Connection vConnection = null;
        PreparedStatement vStmt = null;
        int vRows = 0;
        vConnection = new clsConnection().conectar();
        vStmt = vConnection.prepareStatement(SQL_INSERT);
        int index = 1;
        vStmt.setString(index, SQL_INSERT);
        return vRows;
    }

    
    public int update(clsTercero tercero) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int delete(clsTercero tercero) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<clsTercero> select() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
