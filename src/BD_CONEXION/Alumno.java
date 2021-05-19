package BD_CONEXION;

public class Alumno {
    public int Id;
    public int IdGrado;
    public String Nombre;
    public String ApPaterno;
    public String ApMaterno;
    public String Nivel;

    public Alumno(int Id, int IdGrado, String Nombre, String ApPaterno, String ApMaterno,String Nivel){
        this.Id = Id;
        this.IdGrado = IdGrado;
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.Nivel = Nivel;
    }
}
