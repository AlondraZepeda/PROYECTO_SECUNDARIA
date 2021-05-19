/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BD_CONEXION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anahí Zepeda
 */
public class Conexion {
      
    public Conexion(){
    }

    private Connection conectarBD() throws SQLException, Exception{
        Class.forName("org.sqlite.JDBC");
        String url= "jdbc:sqlite:database.db";

        return DriverManager.getConnection(url);
    }

    public void agregar(String tabla, String datos){
        try{
            Connection conexion = this.conectarBD();
            Statement sql = conexion.createStatement();
            sql.executeQuery("INSERT INTO " + tabla + " VALUES (" + datos + ");");
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public ResultSet consultar(String tabla, String campos, String condicion_where){
        try {
            Connection conexion = this.conectarBD();
            Statement sql = conexion.createStatement();
            String statement = "SELECT " + campos + " FROM "+ tabla +(condicion_where == null || condicion_where.length() == 0? "" : " WHERE " + condicion_where);
            System.out.println(statement);
            
            return sql.executeQuery(statement);//'R%'
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public void eliminar(String tabla, String campo, String valor){
        try {
            Connection conexion = this.conectarBD();
            Statement sql = conexion.createStatement();

            sql.execute("DELETE FROM " + tabla + " WHERE " + campo + " = " + valor);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void actualizar(String tabla, String campo_actualizar, String condicion){
        try {
            Connection conexion = this.conectarBD();
            Statement sql = conexion.createStatement();
            String sqlStatement = "UPDATE " + tabla + " SET " + campo_actualizar + " WHERE " + condicion;
            System.out.println(sqlStatement);

            sql.execute(sqlStatement);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }      
}