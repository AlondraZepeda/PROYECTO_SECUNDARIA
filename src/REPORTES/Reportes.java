package REPORTES;

import java.sql.Connection;
import java.util.Map;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Reportes {
    private static void generarReporte(String path, Map parameters, Connection conn){
        try{
            JasperReport reporte = JasperCompileManager.compileReport(path);
           
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parameters, conn);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        }catch(JRException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void generarListaAsistencia(Connection conn){
        Reportes.generarReporte("src/REPORTES/Asistencia.jrxml", null, conn);
    }
    
    public static void generarListaActividades(Connection conn){
        Reportes.generarReporte("src/REPORTES/ListaActividades.jrxml", null, conn);
    }
}
