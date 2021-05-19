package BD_CONEXION;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Docente {
    public static String TABLE_NAME = "Docente";
    public int Id;
    public String Nombre;
    public String ApPaterno;
    public String ApMaterno;
    public String Usuario;
    public String Contra;

    public Docente(int Id, String Nombre, String ApPaterno, String ApMaterno, String Usuario, String Contra){
        this.Id = Id;
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.Usuario = Usuario;
        this.Contra = Contra;
    }
    
    public void save(){
        Conexion conx = new Conexion();
        if(Id <= 0){
            conx.agregar(TABLE_NAME,
                     String.format("NULL, \"%s\", \"%s\", \"%s\", \"%s\", \"%s\"",
                                   this.Nombre,
                                   this.ApPaterno,
                                   this.ApMaterno,
                                   this.Usuario,
                                   this.Contra)
            );
            try{
                ResultSet consulta = conx.consultar(TABLE_NAME, "MAX(ID) AS ID", null);
                consulta.next();
                this.Id = consulta.getInt("ID");
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
                this.Id = -1;
            }            
        }else{
            conx.actualizar(TABLE_NAME,
                            String.format("Nombre='%s', ApPaterno='%s', ApMaterno='%s', Usuario='%s'",
                                          this.Nombre,
                                          this.ApPaterno,
                                          this.ApMaterno,
                                          this.Usuario,
                                          this.Contra),
                            "Id = " + Id);
        }    
    }
    
    public static boolean login(String usuario, String contra){
        Conexion conx = new Conexion();
         ResultSet result = conx.consultar(TABLE_NAME, "Usuario", "Usuario=" + "\"" + usuario + "\" AND Contra=\"" + contra + "\";");
         try{
            return result.next();
         }catch(SQLException ex){
             return false;
         }
    }
    
    public static ArrayList<Docente> getAll(){
        Conexion conx = new Conexion();
        ResultSet result = conx.consultar(TABLE_NAME, "*", null);
        ArrayList<Docente> docentes = new ArrayList<>();
         try{
            while(result.next()){
                docentes.add(new Docente(result.getInt("Id"),
                                         result.getString("Nombre"),
                                         result.getString("ApPaterno"),
                                         result.getString("ApMaterno"),
                                         result.getString("Usuario"),
                                         result.getString("Contra")));
            }
            return docentes;
         }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return new ArrayList<Docente>();
        }  
    }
    
    public static ArrayList<Docente> getBy(String condicion){
        Conexion conx = new Conexion();
        ResultSet result = conx.consultar(TABLE_NAME, "*", condicion);
        ArrayList<Docente> docentes = new ArrayList<>();
         try{
            while(result.next()){
                docentes.add(new Docente(result.getInt("Id"),
                                         result.getString("Nombre"),
                                         result.getString("ApPaterno"),
                                         result.getString("ApMaterno"),
                                         result.getString("Usuario"),
                                         result.getString("Contra")));
            }
            return docentes;
         }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return new ArrayList<Docente>();
        }  
    }
    
    public static void deleteBy(String campo, String valor){
        Conexion conx = new Conexion();
        conx.eliminar(TABLE_NAME, campo, valor);
    }
    
    public static void updateBy(String campos, String condicion){
        Conexion conx = new Conexion();
        conx.actualizar(TABLE_NAME, campos, condicion);
    }
}
