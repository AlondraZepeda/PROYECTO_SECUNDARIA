/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOCENTES;
import PRINCIPALES.login;
import java.awt.Dimension;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import javax.swing.table.DefaultTableModel;
import BD_CONEXION.Docente;
import java.util.ArrayList;

/**
 *
 * @author Anahí Zepeda
 */
public class REGISTRARSE_DOCENTE extends javax.swing.JFrame {

    /**
     * Creates new form REGISTRARSE_DOCENTE
     */
    
    public Conexion2 Conect;
    public String accion, id_actualizar,sql;
    public String mensaje;
    DefaultTableModel modelo;
    String campoconsulta;
    String regex;
    Pattern patron;
    
    public REGISTRARSE_DOCENTE() {
        initComponents();
        this.setSize(new Dimension(1000, 700));
           setLocationRelativeTo(null);
        accion= "insertar";
        sql="";
        campoconsulta = "";

        
        modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Usuario");
        
        this.jTable1.setModel(modelo);
        primeraCarga(Docente.getAll());
    }
    
 public boolean validacionNombre(String txt){
        regex = "[A-Za-z]+ [\u0020][A-Za-z]+|[A-Za-z]+";
        patron = Pattern.compile(regex);
			Matcher emparejador = patron.matcher(txt);
			boolean esCoincidente = emparejador.matches();
			return esCoincidente;
		}
    
    public boolean validacionApellido(String txt){
        regex = "[A-Za-z]+ [\u0020][A-Za-z]+|[A-Za-z]+";
        patron = Pattern.compile(regex);
			Matcher emparejador = patron.matcher(txt);
			boolean esCoincidente = emparejador.matches();
			return esCoincidente;
    }
    
       public boolean validacionContraseña(String txt){
        regex = "[A-Za-z0-9]+";
        patron = Pattern.compile(regex);
                        Matcher emparejador = patron.matcher(txt);
			boolean esCoincidente = emparejador.matches();
			return esCoincidente;
    }
    
    public boolean validacionUsuario(String txt){
        regex = "[A-Za-z0-9]+";
        patron = Pattern.compile(regex);
                        Matcher emparejador = patron.matcher(txt);
			boolean esCoincidente = emparejador.matches();
			return esCoincidente;
    }
    
    
  private void primeraCarga(ArrayList<Docente> docentes){
        String[] titulos={"Id", "Nombre","Usuario"};
        modelo = new DefaultTableModel(null,titulos);
        
        int index = docentes.size();
        for(int i = 0; i < index; i++){
            String[] newDocenteRow = new String[3];
            newDocenteRow[0] = docentes.get(i).Id+"";
            newDocenteRow[1] = docentes.get(i).Nombre;
            newDocenteRow[2] = docentes.get(i).Usuario;
                
            modelo.addRow(newDocenteRow);
        }
        //Mostrar titulos de la tabla
        jTable1.setModel(modelo);
  }
   
   private void insertar(){
        String nom,apepat, apemat, usu, contra;
        nom = txtNombres.getText();
        apepat = txtApePat.getText();
        apemat = txtApeMat.getText();
        usu = txtUsuario.getText();
        contra = txtContraseña.getText();
        
        Docente newDoc = new Docente(0, nom, apepat, apemat, usu, contra);
        newDoc.save();
        
        DefaultTableModel currentTableModel = (DefaultTableModel)this.jTable1.getModel();
        String [] newDocenteRow = new String[3];
        newDocenteRow[0] = newDoc.Id + "";
        newDocenteRow[1] = nom;
        newDocenteRow[2] = usu;
        currentTableModel.addRow(newDocenteRow);
   }
   
    /*public void cargarTabla(String valor){
        String[] titulos={"Nombre","Usuario"};
        String[] registros= new String[2];
        modelo = new DefaultTableModel(null,titulos);
        try {
            //Mostrar registros en la tabla
            Conect = new Conexion2();
            ResultSet consulta= Conect.Consultar1("Usuarios",campoconsulta ,valor);
            while(consulta.next()){
                registros[0] = consulta.getString("Nombre");
                registros[1] = consulta.getString("Usuario");
               // registros[2] = consulta.getString("Telefono");
                modelo.addRow(registros); 
                System.out.println("Ok7");
            }
            //Mostrar titulos de la tabla
            jTable1.setModel(modelo);
            System.out.println("Ok8");
            
        } catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null,ex);
        }
        System.out.println("Ok9");
    }*/
    
    /*private void cargarDatos(String Nombre){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
      
        try {
            Conect= new Conexion2();
            ResultSet consulta =Conect.Consultar1("Usuarios", "Nombre", Nombre);
            //Recorre registros para mostrarlos
            while(consulta.next()){
                txtNombres.setText(consulta.getString("Nombre"));
                txtUsuario.setText(consulta.getString("Usuario"));
              
                System.out.println("Ok10");
            }
            
        } catch (SQLException ex) {}
        System.out.println("Ok11");
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        propietario = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        atras2 = new javax.swing.JButton();
        adelante = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApePat = new javax.swing.JTextField();
        txtApeMat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRepiteContraseña = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setText("REGISTRATE");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(400, 30, 180, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setText("DOCENTE");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(500, 60, 90, 15);

        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jPanel2.add(jButton12);
        jButton12.setBounds(320, 110, 130, 100);

        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jPanel2.add(jButton14);
        jButton14.setBounds(320, 110, 130, 100);

        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);
        jButton15.setBounds(0, 290, 110, 110);

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jLabel10.setText("ENCICLOPEDIA ");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(620, 30, 120, 17);

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jLabel11.setText("de las");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(660, 50, 50, 17);

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jLabel12.setText("MATEMATICAS");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(630, 70, 100, 20);

        propietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/simbolo chico t.png"))); // NOI18N
        propietario.setBorderPainted(false);
        propietario.setContentAreaFilled(false);
        propietario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(propietario);
        propietario.setBounds(750, 0, 130, 100);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/salir chico.png"))); // NOI18N
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/salir chico.png"))); // NOI18N
        salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/salir mediano.png"))); // NOI18N
        salir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/salir mediano.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel2.add(salir);
        salir.setBounds(0, 0, 100, 100);

        atras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/atras chico.png"))); // NOI18N
        atras2.setBorderPainted(false);
        atras2.setContentAreaFilled(false);
        atras2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/atras chico.png"))); // NOI18N
        atras2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/atras mediano.png"))); // NOI18N
        atras2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/atras mediano.png"))); // NOI18N
        atras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atras2ActionPerformed(evt);
            }
        });
        jPanel2.add(atras2);
        atras2.setBounds(160, 0, 100, 100);

        adelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/derecha chico.png"))); // NOI18N
        adelante.setBorderPainted(false);
        adelante.setContentAreaFilled(false);
        adelante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adelante.setEnabled(false);
        adelante.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/derecha chico.png"))); // NOI18N
        adelante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/derecha mediano.png"))); // NOI18N
        adelante.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/derecha mediano.png"))); // NOI18N
        adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteActionPerformed(evt);
            }
        });
        jPanel2.add(adelante);
        adelante.setBounds(240, 0, 120, 100);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/home chico.png"))); // NOI18N
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/home chico.png"))); // NOI18N
        jButton22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/home mediano.png"))); // NOI18N
        jButton22.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/home mediano.png"))); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22);
        jButton22.setBounds(70, 0, 110, 100);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 990, 100);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/AGREGAR 32.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/AGREGAR 32.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/AGREGAR 48.png"))); // NOI18N
        btnGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/AGREGAR 48.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar);
        btnGuardar.setBounds(20, 40, 150, 62);

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/MODIFICAR 32.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/MODIFICAR 32.png"))); // NOI18N
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/MODIFICAR 48.png"))); // NOI18N
        btnModificar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/MODIFICAR 48.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar);
        btnModificar.setBounds(80, 140, 170, 60);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ELIMINAR 32.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ELIMINAR 32.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ELIMINAR 48.png"))); // NOI18N
        btnEliminar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ELIMINAR 48.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar);
        btnEliminar.setBounds(260, 140, 170, 62);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/CANCELAR 32.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/CANCELAR 32.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/CANCELAR 48.png"))); // NOI18N
        btnCancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/CANCELAR 48.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelar);
        btnCancelar.setBounds(340, 40, 150, 60);

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/BUSCAR 32.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/BUSCAR 32.png"))); // NOI18N
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/BUSCAR 48.png"))); // NOI18N
        btnBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/BUSCAR 48.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscar);
        btnBuscar.setBounds(180, 40, 150, 60);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(440, 140, 515, 240);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL DOCENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setText("NOMBRE:");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("APELLIDO PATERNO:");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setText("APELLIDO MATERNO:");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setText("NUEVA CONTRASEÑA:");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setText("REPITE CONTRASEÑA:");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel6.setText("USUARIO:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombres))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtApePat))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtApeMat))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRepiteContraseña)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsuario)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRepiteContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 120, 417, 310);

        jTable1.setBackground(new java.awt.Color(255, 204, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 440, 940, 100);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/METALICO.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -3, 1000, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void atras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atras2ActionPerformed
        login t = new login();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_atras2ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        login t = new login();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     if(validacionNombre(txtNombres.getText())==false){
            JOptionPane.showMessageDialog(null,"El Nombre no es valido");
            return;
        }
        if(validacionApellido(txtApePat.getText())==false){
            JOptionPane.showMessageDialog(null,"El Apellido no es valido");
            return;
        }
         if(validacionApellido(txtApeMat.getText())==false){
            JOptionPane.showMessageDialog(null,"El Apellido no es valido");
            return;
        }
       
        if(validacionUsuario(txtUsuario.getText()) ==false) {
            JOptionPane.showMessageDialog(null,"El Nombre de Usuario no es valido");
            return;
        }
        
        String contra1,contra2;
        contra1 = txtContraseña.getText();
        contra2 = txtRepiteContraseña.getText();
        if(contra1.equals(contra2)){
            if(validacionContraseña(txtContraseña.getText()) ==false) {
                JOptionPane.showMessageDialog(null,"La contraseña no es válida, intente de nuevo");
                return;
            } else {
                insertar();
                txtNombres.setText("");
                txtApePat.setText("");
                txtApeMat.setText("");
                txtUsuario.setText("");
                txtContraseña.setText("");
                txtRepiteContraseña.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
            txtContraseña.setText("");
            txtRepiteContraseña.setText("");
            return;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int dialogButton =showConfirmDialog(this, "¿DESEA CANCELAR?","CANCELAR", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(dialogButton == YES_OPTION){
            System.out.println("YES OPTION");
            String condicion = "Usuario LIKE '%" + campoconsulta + "%'";
            primeraCarga(Docente.getBy(condicion)); 
            txtNombres.setText("");
            txtApePat.setText("");
            txtApeMat.setText("");
            txtUsuario.setText("");
            txtContraseña.setText("");
            txtRepiteContraseña.setText("");
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = jTable1.getSelectedRowCount();
        int[] selectedRows = jTable1.getSelectedRows();
        DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
        
        if (fila > 0 ){
            if(JOptionPane.YES_NO_OPTION == JOptionPane.showConfirmDialog(null, "¿Desea eliminar un registro?"+"'","Eliminar un registro",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)){
                for(int i = selectedRows.length -1;i >= 0; i--){
                    Docente.deleteBy("Id", tableModel.getValueAt(selectedRows[i], 0) + "");
                    tableModel.removeRow(selectedRows[i]);
                }
            }
        }else{
            if(JOptionPane.YES_NO_OPTION == JOptionPane.showConfirmDialog(null,"Desea eliminar todos los registros ","Eliminar registros",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)){
                for(int i = jTable1.getRowCount() - 1; i >= 0; i--){
                    Docente.deleteBy("Id", tableModel.getValueAt(selectedRows[i], 0) + "");
                }
                jTable1.setModel(new DefaultTableModel());
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adelanteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       /* int filas;
        String Nombre;
        accion="Modificar";
        filas= jTable1.getSelectedRow();
        Nombre=(String)modelo.getValueAt(filas,0);
        System.out.println("Nombre= "+Nombre);
        id_actualizar = Nombre;
        cargarDatos(Nombre);*/
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int rows = jTable1.getRowCount();
        DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
        for(int i = 0; i < rows; i++){
            String campos = String.format("Nombre='%s', Usuario='%s'", tableModel.getValueAt(i, 1), tableModel.getValueAt(i, 2));
            String condicion = String.format("Id=%s", tableModel.getValueAt(i, 0));
            Docente.updateBy(campos, condicion);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        campoconsulta = JOptionPane.showInputDialog("¿Desea buscar un registro? (Coloque Nombre Usuario)");
        String condicion = "Usuario LIKE '%" + campoconsulta + "%'";
        primeraCarga(Docente.getBy(condicion)); 
    }//GEN-LAST:event_btnBuscarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adelante;
    private javax.swing.JButton atras2;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton propietario;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txtApeMat;
    private javax.swing.JTextField txtApePat;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRepiteContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
