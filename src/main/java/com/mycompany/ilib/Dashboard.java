/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ilib;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mycompany.views.*;
import java.awt.BorderLayout;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author billi
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        InitStyles();
        SetDate();
        InitContent();
    }
    private void InitStyles(){
        mensaje.putClientProperty( "FlatLaf.styleClass", "h1" );
        mensaje.setForeground(black);
        gestion.putClientProperty( "FlatLaf.style", "font: bold $h2.regular.font" );
        gestion.setForeground(white);
        dateText.putClientProperty( "FlatLaf.style", "font: 30 $light.font" );
        dateText.setForeground(white);
        atrrText.putClientProperty( "FlatLaf.style", "font: bold $h1.regular.font" );
        atrrText.setForeground(white);
    }
    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    private void InitContent() {
        ShowJPanel(new Principal());
    }
    
    public static void ShowJPanel(JPanel p) {
        p.setSize(754, 416);
        p.setLocation(0, 0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backround = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        atrrText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        registrarBoton = new javax.swing.JButton();
        listadoBoton = new javax.swing.JButton();
        principalBoton = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        gestion = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 660));

        backround.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(17, 31, 81));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        atrrText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atrrText.setText("ATRR");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        registrarBoton.setBackground(new java.awt.Color(27, 49, 128));
        registrarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registrarBoton.setForeground(new java.awt.Color(255, 255, 255));
        registrarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file-chart.png"))); // NOI18N
        registrarBoton.setText("REGISTRAR PACIENTE");
        registrarBoton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        registrarBoton.setBorderPainted(false);
        registrarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrarBoton.setIconTextGap(7);
        registrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBotonActionPerformed(evt);
            }
        });

        listadoBoton.setBackground(new java.awt.Color(27, 49, 128));
        listadoBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listadoBoton.setForeground(new java.awt.Color(255, 255, 255));
        listadoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account-multiple.png"))); // NOI18N
        listadoBoton.setText("VER LISTADO PACIENTES");
        listadoBoton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        listadoBoton.setBorderPainted(false);
        listadoBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listadoBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        listadoBoton.setIconTextGap(7);
        listadoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoBotonActionPerformed(evt);
            }
        });

        principalBoton.setBackground(new java.awt.Color(27, 49, 128));
        principalBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        principalBoton.setForeground(new java.awt.Color(255, 255, 255));
        principalBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-outline.png"))); // NOI18N
        principalBoton.setText("PRINCIPAL");
        principalBoton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        principalBoton.setBorderPainted(false);
        principalBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        principalBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        principalBoton.setIconTextGap(7);
        principalBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(registrarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listadoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atrrText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(principalBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(atrrText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(principalBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listadoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(25, 206, 218));

        gestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gestion.setText("Gestión de pacientes con enfermedades no transmisibles");

        dateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(gestion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(754, 416));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mensaje.setText("Bienvenido!");

        javax.swing.GroupLayout backroundLayout = new javax.swing.GroupLayout(backround);
        backround.setLayout(backroundLayout);
        backroundLayout.setHorizontalGroup(
            backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 251, Short.MAX_VALUE))
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)))
        );
        backroundLayout.setVerticalGroup(
            backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBotonActionPerformed
        ShowJPanel(new Lendings());
    }//GEN-LAST:event_registrarBotonActionPerformed

    private void listadoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoBotonActionPerformed
        ShowJPanel(new Users());
    }//GEN-LAST:event_listadoBotonActionPerformed

    private void principalBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalBotonActionPerformed
        ShowJPanel(new Principal());
    }//GEN-LAST:event_principalBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        FlatMaterialLighterIJTheme.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atrrText;
    private javax.swing.JPanel backround;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel gestion;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton listadoBoton;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    private javax.swing.JButton principalBoton;
    private javax.swing.JButton registrarBoton;
    // End of variables declaration//GEN-END:variables
}
