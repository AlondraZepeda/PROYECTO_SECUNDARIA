package BD_CONEXION;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Docente {
    private static final String TABLE_NAME = "Docente";
    public static int ID_DOCENTE = -1;
    
    
    private int Id;
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
    
    public int getId(){
        return this.Id;
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
        conx.close();
    }
    
    public static boolean login(String usuario, String contra){
        Conexion conx = new Conexion();
        ResultSet result = conx.consultar(TABLE_NAME, "Id", "Usuario=" + "\"" + usuario + "\" AND Contra=\"" + contra + "\";");
        try{
            boolean signUp = result.next();
            Docente.ID_DOCENTE = result.getInt("Id");
            conx.close();
            return signUp;
         }catch(SQLException ex){
             System.out.println(ex.getMessage());
            conx.close();
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
            conx.close();
            return docentes;
         }catch(SQLException ex){
            System.out.println(ex.getMessage());
            conx.close();
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
            conx.close();
            return docentes;
         }catch(SQLException ex){
            System.out.println(ex.getMessage());
            conx.close();
            return new ArrayList<Docente>();
        }  
    }
    
    public static void deleteBy(String campo, String valor){
        Conexion conx = new Conexion();
        conx.eliminar(TABLE_NAME, campo, valor);
        conx.close();
    }
    
    public static void updateBy(String campos, String condicion){
        Conexion conx = new Conexion();
        conx.actualizar(TABLE_NAME, campos, condicion);
        conx.close();
    }
}
