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
    public Connection conexion;
      
    public Conexion(){
        try{
            Class.forName("org.sqlite.JDBC");
            conexion = this.conectarBD();
        }catch(ClassNotFoundException ex){
            System.out.println("ClassNotFoundException");
            System.out.println(ex.getMessage());
        }
        catch(SQLException ex){
            System.out.println("SQLException");
            System.out.println(ex.getMessage());
        }
    }

    private Connection conectarBD() throws SQLException{
        String url= "jdbc:sqlite:database.db";

        return DriverManager.getConnection(url);
    }

    public void agregar(String tabla, String datos){
        try{
            Statement sql = this.conexion.createStatement();
            String query = "INSERT INTO " + tabla + " VALUES (" + datos + ");";
            System.out.println(query);
            sql.executeQuery(query);
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public ResultSet consultar(String tabla, String campos, String condicion_where){
        try {
            Statement sql = this.conexion.createStatement();
            String statement = "SELECT " + campos + " FROM "+ tabla +(condicion_where == null || condicion_where.length() == 0? "" : " WHERE " + condicion_where);
            System.out.println(statement);
            
            return sql.executeQuery(statement);//'R%'
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public void eliminar(String tabla, String campo, String valor){
        try {
            Statement sql = this.conexion.createStatement();

            sql.execute("DELETE FROM " + tabla + " WHERE " + campo + " = " + valor);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void actualizar(String tabla, String campo_actualizar, String condicion){
        try {
            Statement sql = this.conexion.createStatement();
            String sqlStatement = "UPDATE " + tabla + " SET " + campo_actualizar + " WHERE " + condicion;
            System.out.println(sqlStatement);

            sql.execute(sqlStatement);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void close(){
        try{    
            this.conexion.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}