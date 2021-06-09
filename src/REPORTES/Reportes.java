package REPORTES;

import java.sql.Connection;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Reportes {
    public static void generarListaAsistencia(Connection conn){
        try{
            String path = "src/REPORTES/Asistencia.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(path);
           
            JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        }catch(JRException ex){
            System.out.println(ex.getMessage());
        }
    }    
}
