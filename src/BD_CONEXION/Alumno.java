package BD_CONEXION;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Alumno {
    private static final String TABLE_NAME = "Alumno";
    
    private int Id;
    private int IdDocente;
    public int Grado;
    public String Grupo;
    public String Nombre;
    public String ApPaterno;
    public String ApMaterno;
    public String Nivel;

    public Alumno(int Id, int IdDocente, int Grado, String Grupo, String Nombre, String ApPaterno, String ApMaterno,String Nivel){
        this.Id = Id;
        this.IdDocente = IdDocente;
        this.Grado = Grado;
        this.Grupo = Grupo;
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.Nivel = Nivel;
    }
    
    public int getId(){
        return this.Id;
    }
    
    public void save(){
        Conexion conx = new Conexion();
        if(Id <= 0){
            conx.agregar(TABLE_NAME,
                     String.format("NULL, %s, %s, %s, '%s', '%s', '%s', '%s'",
                                   this.IdDocente,
                                   this.Grado,
                                   this.Grupo,
                                   this.Nombre,
                                   this.ApPaterno,
                                   this.ApMaterno,
                                   this.Nivel)
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
                            String.format("Grado='%s', Grupo='%s', Nombre='%s', ApPaterno='%s', ApMaterno='%s', Nivel='%s'",
                                          this.Grado,
                                          this.Grupo,
                                          this.Nombre,
                                          this.ApPaterno,
                                          this.ApMaterno,
                                          this.Nivel),
                            "Id = " + this.Id);
        }
        conx.close();
    }
    
    public static ArrayList<Alumno> getAll(){
        Conexion conx = new Conexion();
        ResultSet result = conx.consultar(TABLE_NAME, "*", null);
        ArrayList<Alumno> alumnos = new ArrayList<>();
         try{
            while(result.next()){
                alumnos.add(new Alumno(result.getInt("Id"),
                                       result.getInt("IdDocente"),
                                       result.getInt("Grado"),
                                       result.getString("Grupo"),
                                       result.getString("Nombre"),
                                       result.getString("ApPaterno"),
                                       result.getString("ApMaterno"),
                                       result.getString("Nivel")));
            }
            conx.close();
            return alumnos;
         }catch(SQLException ex){
            System.out.println(ex.getMessage());
            conx.close();
            return new ArrayList<Alumno>();
        }  
    }
    
    public static ArrayList<Alumno> getBy(String condicion){
        Conexion conx = new Conexion();
        ResultSet result = conx.consultar(TABLE_NAME, "*", condicion);
        ArrayList<Alumno> alumnos = new ArrayList<>();
         try{
            while(result.next()){
                alumnos.add(new Alumno(result.getInt("Id"),
                                       result.getInt("IdDocente"),
                                       result.getInt("Grado"),
                                       result.getString("Grupo"),
                                       result.getString("Nombre"),
                                       result.getString("ApPaterno"),
                                       result.getString("ApMaterno"),
                                       result.getString("Nivel")));
            }
            conx.close();
            return alumnos;
         }catch(SQLException ex){
            System.out.println(ex.getMessage());
            conx.close();
            return new ArrayList<Alumno>();
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
