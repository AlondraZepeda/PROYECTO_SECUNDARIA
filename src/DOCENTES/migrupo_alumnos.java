/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOCENTES;

import PRINCIPALES.temas_principales;
import java.awt.Dimension;

/**
 *
 * @author Anahí Zepeda
 */
public class migrupo_alumnos extends javax.swing.JFrame {

    /**
     * Creates new form migrupo_alumnos
     */
    public migrupo_alumnos() {
        initComponents();
        this.setSize(new Dimension(1000, 700));
           setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        migrupo_alumnos = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        atras2 = new javax.swing.JButton();
        adelante = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        propietario2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        migrupo_alumnos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        migrupo_alumnos.setResizable(true);
        migrupo_alumnos.setVisible(true);
        migrupo_alumnos.getContentPane().setLayout(null);

        jButton1.setText("CANCELAR");
        migrupo_alumnos.getContentPane().add(jButton1);
        jButton1.setBounds(410, 20, 120, 23);

        jButton6.setText("AGREGAR");
        migrupo_alumnos.getContentPane().add(jButton6);
        jButton6.setBounds(20, 20, 120, 23);

        jButton7.setText("ELIMINAR");
        migrupo_alumnos.getContentPane().add(jButton7);
        jButton7.setBounds(150, 20, 120, 23);

        jButton8.setText("MODIFICAR");
        migrupo_alumnos.getContentPane().add(jButton8);
        jButton8.setBounds(280, 20, 120, 23);

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setText("MI GRUPO");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(360, 10, 180, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setText("Secundaria. 1°");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(570, 70, 90, 15);

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

        propietario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/simbolo chico t.png"))); // NOI18N
        propietario2.setBorderPainted(false);
        propietario2.setContentAreaFilled(false);
        propietario2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(propietario2);
        propietario2.setBounds(840, 0, 120, 100);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel10.setText("ALUMNOS");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(460, 40, 180, 29);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1000, 100);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL ALUMNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setText("NOMBRE:");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("APELLIDO PATERNO:");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setText("APELLIDO MATERNO:");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setText("NIVEL:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el nivel", "Requiere apoyo", "En resarrollo", "Esperado" }));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel6.setText("GRADO:");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel7.setText("GRUPO:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"A\"", "\"B\"", "\"C\"", "\"D\"" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 118, 414, 230);

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE", "PATERNO", "MATERNO", "NIVEL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 370, 940, 199);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/AGREGAR 32.png"))); // NOI18N
        jButton2.setText("AGREGAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/AGREGAR 32.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/AGREGAR 48.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/AGREGAR 48.png"))); // NOI18N
        jPanel3.add(jButton2);
        jButton2.setBounds(20, 40, 150, 62);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/MODIFICAR 32.png"))); // NOI18N
        jButton3.setText("MODIFICAR");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/MODIFICAR 32.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/MODIFICAR 48.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/MODIFICAR 48.png"))); // NOI18N
        jPanel3.add(jButton3);
        jButton3.setBounds(80, 120, 170, 60);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ELIMINAR 32.png"))); // NOI18N
        jButton4.setText("ELIMINAR");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ELIMINAR 32.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ELIMINAR 48.png"))); // NOI18N
        jButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ELIMINAR 48.png"))); // NOI18N
        jPanel3.add(jButton4);
        jButton4.setBounds(260, 120, 170, 62);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/CANCELAR 32.png"))); // NOI18N
        jButton5.setText("CANCELAR");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/CANCELAR 32.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/CANCELAR 48.png"))); // NOI18N
        jButton5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/CANCELAR 48.png"))); // NOI18N
        jPanel3.add(jButton5);
        jButton5.setBounds(340, 40, 150, 60);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/BUSCAR 32.png"))); // NOI18N
        jButton9.setText("BUSCAR");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/BUSCAR 32.png"))); // NOI18N
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/BUSCAR 48.png"))); // NOI18N
        jButton9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/BUSCAR 48.png"))); // NOI18N
        jPanel3.add(jButton9);
        jButton9.setBounds(180, 40, 150, 60);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(430, 118, 515, 230);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/FONDO ALUMNOS_2.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1000, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void atras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atras2ActionPerformed
        mi_grupo t = new mi_grupo();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_atras2ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        temas_principales t = new temas_principales();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton22ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adelante;
    private javax.swing.JButton atras2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JInternalFrame migrupo_alumnos;
    private javax.swing.JButton propietario2;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
