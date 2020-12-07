/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmi_Salir = new javax.swing.JMenu();
        jm_internoSalir = new javax.swing.JMenuItem();
        jmi_Materias = new javax.swing.JMenu();
        jm_internoMaterias = new javax.swing.JMenuItem();
        jm_internoListar = new javax.swing.JMenuItem();
        jmi_alumno = new javax.swing.JMenu();
        jmi_interno = new javax.swing.JMenuItem();
        jm_ListarAlumnos = new javax.swing.JMenuItem();
        jmi_Inscripciones = new javax.swing.JMenu();
        menuCrearInscripcion = new javax.swing.JMenuItem();
        jm_interno = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        jmi_Salir.setText("Archivo");

        jm_internoSalir.setText("Salir");
        jm_internoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_internoSalirActionPerformed(evt);
            }
        });
        jmi_Salir.add(jm_internoSalir);

        jMenuBar1.add(jmi_Salir);

        jmi_Materias.setText("Materias");

        jm_internoMaterias.setText("Materia");
        jm_internoMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_internoMateriasActionPerformed(evt);
            }
        });
        jmi_Materias.add(jm_internoMaterias);

        jm_internoListar.setText("listarMaterias");
        jm_internoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_internoListarActionPerformed(evt);
            }
        });
        jmi_Materias.add(jm_internoListar);

        jMenuBar1.add(jmi_Materias);

        jmi_alumno.setText("Alumnos");

        jmi_interno.setText("Alumno");
        jmi_interno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_internoActionPerformed(evt);
            }
        });
        jmi_alumno.add(jmi_interno);

        jm_ListarAlumnos.setText("listarAlumnos");
        jm_ListarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_ListarAlumnosActionPerformed(evt);
            }
        });
        jmi_alumno.add(jm_ListarAlumnos);

        jMenuBar1.add(jmi_alumno);

        jmi_Inscripciones.setText("Inscripciones");

        menuCrearInscripcion.setText("Crear Inscripcion");
        menuCrearInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrearInscripcionActionPerformed(evt);
            }
        });
        jmi_Inscripciones.add(menuCrearInscripcion);

        jm_interno.setText("Administrar inscripciones");
        jm_interno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_internoActionPerformed(evt);
            }
        });
        jmi_Inscripciones.add(jm_interno);

        jMenuBar1.add(jmi_Inscripciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm_internoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_internoListarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaListarMaterias vLMaterias = new VistaListarMaterias();
        vLMaterias.setVisible(true);
        escritorio.add(vLMaterias);
        escritorio.moveToFront(vLMaterias);
    }//GEN-LAST:event_jm_internoListarActionPerformed

    private void jm_internoMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_internoMateriasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaMateria vMateria = new VistaMateria();
        vMateria.setVisible(true);
        escritorio.add(vMateria);
        escritorio.moveToFront(vMateria);
    }//GEN-LAST:event_jm_internoMateriasActionPerformed

    private void jmi_internoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_internoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumno vAlumno = new VistaAlumno();
        vAlumno.setVisible(true);
        escritorio.add(vAlumno);
        escritorio.moveToFront(vAlumno);
    }//GEN-LAST:event_jmi_internoActionPerformed

    private void jm_internoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_internoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        vistaPrincipalInscripcion vpi = new vistaPrincipalInscripcion();
        vpi.setVisible(true);
        escritorio.add(vpi);
        escritorio.moveToFront(vpi);
    }//GEN-LAST:event_jm_internoActionPerformed

    private void menuCrearInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrearInscripcionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        vistaInscripcionCrear vic = new vistaInscripcionCrear();
        vic.setVisible(true);
        escritorio.add(vic);
        escritorio.moveToFront(vic);
    }//GEN-LAST:event_menuCrearInscripcionActionPerformed

    private void jm_ListarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_ListarAlumnosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaListarAlumnos vla = new VistaListarAlumnos();
        vla.setVisible(true);
        escritorio.add(vla);
        escritorio.moveToFront(vla);
    }//GEN-LAST:event_jm_ListarAlumnosActionPerformed

    private void jm_internoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_internoSalirActionPerformed
        if(JOptionPane.showConfirmDialog(null, "ESTA SEGURO QUE DESEA SALIR DEL PROGRAMA?") == 0)
                System.exit(0);
    }//GEN-LAST:event_jm_internoSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jm_ListarAlumnos;
    public javax.swing.JMenuItem jm_interno;
    public javax.swing.JMenuItem jm_internoListar;
    public javax.swing.JMenuItem jm_internoMaterias;
    public javax.swing.JMenuItem jm_internoSalir;
    public javax.swing.JMenu jmi_Inscripciones;
    public javax.swing.JMenu jmi_Materias;
    public javax.swing.JMenu jmi_Salir;
    public javax.swing.JMenu jmi_alumno;
    public javax.swing.JMenuItem jmi_interno;
    public javax.swing.JMenuItem menuCrearInscripcion;
    // End of variables declaration//GEN-END:variables
}
