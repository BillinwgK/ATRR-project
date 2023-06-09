/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.ilib.DAOUsersImpl;
import com.mycompany.interfaces.DAOUsers;
import static java.awt.Color.black;
import static java.awt.Color.white;

/**
 *
 * @author billi
 */
public class Lendings extends javax.swing.JPanel {
    
    boolean isEdition = false;
    com.mycompany.models.Users userEdition;

    /**
     * Creates new form Principal
     */
    public Lendings() {
        initComponents();
        InitStyles();
    }
    
    public Lendings(com.mycompany.models.Users user){
        initComponents();
        isEdition = true;
        userEdition = user;
        InitStyles();
    }
            
    private void InitStyles(){
        hola.putClientProperty( "FlatLaf.style", "font: bold $h3.regular.font" );
        hola.setForeground(black);
        nombreText.setForeground(black);
        apellidoText.setForeground(black);
        edadText.setForeground(black);
        enfermedadText.setForeground(black);
        fechaText.setForeground(black);
        
        if (isEdition) {
            hola.putClientProperty( "FlatLaf.style", "font: bold $h3.regular.font" );
            hola.setForeground(black);
            hola.setText("Editar ");
            registrarBoton.setText("Guardar");
            
            if (userEdition != null){
                nombreText.setText(userEdition.getNombre());
                apellidoText.setText(userEdition.getApellido());
                edadText.setText(userEdition.getEdad());
                enfermedadText.setText(userEdition.getEnfermedad());
                fechaText.setText(userEdition.getFecha());
            }
        }
        //else{
        //    hola.setText("REGISTRAR USUARIO");
        // }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        hola = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nombreText = new javax.swing.JLabel();
        apellidoText = new javax.swing.JLabel();
        enfermedadText = new javax.swing.JLabel();
        edadText = new javax.swing.JLabel();
        fechaText = new javax.swing.JLabel();
        edadField = new javax.swing.JTextField();
        nombreField = new javax.swing.JTextField();
        apellidoField = new javax.swing.JTextField();
        enfermedadField = new javax.swing.JTextField();
        fechaField = new javax.swing.JTextField();
        registrarBoton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(754, 416));
        setPreferredSize(new java.awt.Dimension(754, 416));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(754, 416));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\billi\\OneDrive\\Imágenes\\ATRR\\doctor-paciente333.png")); // NOI18N
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        hola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hola.setText("REGISTRAR PACIENTE");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        nombreText.setText("Nombre");

        apellidoText.setText("Apellido");

        enfermedadText.setText("Enfermedad");

        edadText.setText("Edad");

        fechaText.setText("Fecha");

        edadField.setBackground(new java.awt.Color(204, 204, 204));

        nombreField.setBackground(new java.awt.Color(204, 204, 204));
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        apellidoField.setBackground(new java.awt.Color(204, 204, 204));
        apellidoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoFieldActionPerformed(evt);
            }
        });

        enfermedadField.setBackground(new java.awt.Color(204, 204, 204));

        fechaField.setBackground(new java.awt.Color(204, 204, 204));
        fechaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaFieldActionPerformed(evt);
            }
        });

        registrarBoton.setBackground(new java.awt.Color(27, 49, 128));
        registrarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registrarBoton.setForeground(new java.awt.Color(255, 255, 255));
        registrarBoton.setText("REGISTRAR");
        registrarBoton.setBorder(null);
        registrarBoton.setBorderPainted(false);
        registrarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(edadText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(nombreText, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                        .addGap(172, 172, 172))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edadField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(fechaText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(fechaField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(apellidoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(enfermedadText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(53, 53, 53))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(enfermedadField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 17, Short.MAX_VALUE))))
                            .addComponent(hola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(hola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apellidoText, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidoField)
                            .addComponent(nombreField))
                        .addGap(9, 9, 9)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadText, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(enfermedadText, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadField)
                            .addComponent(enfermedadField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaField)
                        .addGap(75, 75, 75)
                        .addComponent(registrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addContainerGap())
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBotonActionPerformed
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String edad = edadField.getText();
        String enfermedad = enfermedadField.getText();
        String fecha = fechaField.getText();
        //Validaciones
        if (nombre.isEmpty() || apellido.isEmpty() || edad.isEmpty() || enfermedad.isEmpty() || fecha.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar los campos \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            nombreText.requestFocus();
            return;
        }
        com.mycompany.models.Users user = isEdition ? userEdition : new com.mycompany.models.Users();
        user.setNombre(nombre);
        user.setApellido(apellido);
        user.setEdad(edad);
        user.setEnfermedad(enfermedad);
        user.setFecha(fecha);
        
        try{
            DAOUsers dao = new DAOUsersImpl();
            if (!isEdition)
                dao.registrar(user);
            else
                dao.modificar(user);
            String successMsg = isEdition ? "modificado" : "registrado";
            
            javax.swing.JOptionPane.showMessageDialog(this, "usuario " +successMsg+ " exitosamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            if(!isEdition){
                nombreText.setText("");
                apellidoText.setText("");
                edadText.setText("");
                enfermedadText.setText("");
                fechaText.setText("");
            }
        } catch(Exception e){
            String errMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " +errMsg+ " al usuario.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_registrarBotonActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void apellidoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoFieldActionPerformed

    private void fechaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoField;
    private javax.swing.JLabel apellidoText;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField edadField;
    private javax.swing.JLabel edadText;
    private javax.swing.JTextField enfermedadField;
    private javax.swing.JLabel enfermedadText;
    private javax.swing.JTextField fechaField;
    private javax.swing.JLabel fechaText;
    private javax.swing.JLabel hola;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreText;
    private javax.swing.JButton registrarBoton;
    // End of variables declaration//GEN-END:variables
}
