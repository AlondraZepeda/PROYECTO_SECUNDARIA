package PRINCIPALES;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
    
    public static boolean validacionNombre(String txt){
        String regex;
        Pattern patron;
        regex = "[A-Za-z]+ [ A-Za-z]+|[A-Za-z]+";
        patron = Pattern.compile(regex);
        Matcher emparejador = patron.matcher(txt);
        boolean esCoincidente = emparejador.matches();
        return esCoincidente;
    }
    
    public static boolean validacionApellido(String txt){
        String regex;
        Pattern patron;
        regex = "[A-Za-z]+ [ A-Za-z]+|[A-Za-z]+";
        patron = Pattern.compile(regex);
        Matcher emparejador = patron.matcher(txt);
        boolean esCoincidente = emparejador.matches();
        return esCoincidente;
    }
    
    public static boolean validacionContraseña(String txt){
        String regex;
        Pattern patron;
        regex = "[A-Za-z0-9]+";
        patron = Pattern.compile(regex);
        Matcher emparejador = patron.matcher(txt);
        boolean esCoincidente = emparejador.matches();
        return esCoincidente;
    }
    
    public static boolean validacionUsuario(String txt){
        String regex;
        Pattern patron;
        regex = "[A-Za-z0-9]+";
        patron = Pattern.compile(regex);
        Matcher emparejador = patron.matcher(txt);
        boolean esCoincidente = emparejador.matches();
        return esCoincidente;
    }
}
