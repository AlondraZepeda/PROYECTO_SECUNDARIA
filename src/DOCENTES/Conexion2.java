/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOCENTES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anahí Zepeda
 */
public class Conexion2 {
     Connection conexion;

     Statement St;
     ResultSet Datos,Datos1;
     Statement psPrepararSentencia;
    
      
    public Conexion2() throws SQLException{
        try {
            String url= "jdbc:sqlite:database.db";
            conexion = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
        public ResultSet Consultar1(String tabla, String campo,String valor){
        try {
            Datos= St.executeQuery("SELECT * FROM "+ tabla +" WHERE "+campo+" LIKE '"+valor+"%'");//'R%'
        } catch (SQLException ex) {
            Logger.getLogger(Conexion2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Datos;
    }
     public void Eliminar(String tabla, String campo1,String campo2){
        try {            
            St.execute("DELETE FROM "+ tabla +" WHERE "+campo1+ "='"+campo2);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public ResultSet primerCarga() throws SQLException{
        Datos1= St.executeQuery("SELECT * FROM USUARIOS");
        return Datos1;
    }
      public ResultSet primerCarga2() throws SQLException{
        Datos1= St.executeQuery("SELECT * FROM USUARIOS");
        return Datos1;
    }
    
   /* public ResultSet primerCarga3() throws SQLException{
        Datos1= St.executeQuery("SELECT * FROM tramite");
        return Datos1;
    }*
*/
      
}