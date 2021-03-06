/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import universidad1.Alumno;
import universidad1.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidad1.AlumnoData;
import universidad1.Conexion;
import universidad1.Inscripcion;
import universidad1.InscripcionData;
import universidad1.MateriaData;

/**
 *
 * @author Fran Gonzalez
 */
public class vistaInscripcionCrear extends javax.swing.JInternalFrame {

    private ArrayList<Materia> listaMaterias;
    private ArrayList<Alumno> listaAlumnos;
    private InscripcionData inscripcionData;
    private MateriaData materiaData;
    private AlumnoData alumnoData;
    private Conexion conexion;
    
    public vistaInscripcionCrear() {
        initComponents();
        conexion = new Conexion();
        conexion.getConnection();
        
        inscripcionData = new InscripcionData(conexion);
        materiaData = new MateriaData(conexion);
        listaMaterias = (ArrayList<Materia>) materiaData.obtenerMaterias();
        
        alumnoData = new AlumnoData(conexion);
        listaAlumnos = (ArrayList<Alumno>) alumnoData.obtenerAlumnos();
        
        cbCargarlistadoMaterias();
        cbCargarListadoAlumno();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCreacion = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        txtCalificacion = new javax.swing.JTextField();
        labelCalificacion = new javax.swing.JLabel();
        labelAlumno = new javax.swing.JLabel();
        cbListaMaterias = new javax.swing.JComboBox<>();
        labelMateria = new javax.swing.JLabel();
        cbListaAlumnos = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        panelCreacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Creacion"));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtCalificacion.setText("0");
        txtCalificacion.setToolTipText("Opcional");

        labelCalificacion.setDisplayedMnemonic('s');
        labelCalificacion.setText("Calficacion: (opcional)");

        labelAlumno.setText("Alumno");

        cbListaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaMateriasActionPerformed(evt);
            }
        });

        labelMateria.setText("Materia");

        cbListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCreacionLayout = new javax.swing.GroupLayout(panelCreacion);
        panelCreacion.setLayout(panelCreacionLayout);
        panelCreacionLayout.setHorizontalGroup(
            panelCreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
            .addGroup(panelCreacionLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelCreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCreacionLayout.createSequentialGroup()
                        .addComponent(labelCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(173, Short.MAX_VALUE))
                    .addGroup(panelCreacionLayout.createSequentialGroup()
                        .addGroup(panelCreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMateria)
                            .addComponent(cbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAlumno)
                            .addComponent(cbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );
        panelCreacionLayout.setVerticalGroup(
            panelCreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreacionLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panelCreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlumno)
                    .addComponent(labelMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(panelCreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCalificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCreacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCreacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbListaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbListaMateriasActionPerformed

    private void cbListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbListaAlumnosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarInscripcion();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbCargarlistadoMaterias(){
       for(Materia item:listaMaterias){
            cbListaMaterias.addItem(item);
        }
    }
    
    private void cbCargarListadoAlumno(){
        for(Alumno item: listaAlumnos){
            cbListaAlumnos.addItem(item);
        }
    }
    
    private void guardarInscripcion(){
        Materia materia = (Materia) cbListaMaterias.getSelectedItem();
        Alumno alumno = (Alumno) cbListaAlumnos.getSelectedItem();
        float nota = Float.parseFloat(txtCalificacion.getText());
        
        if(alumno!=null && materia!=null){
            Inscripcion ins = new Inscripcion(alumno,materia,nota);
            inscripcionData.guardarInscripcion(ins);
        }
        else
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR ALUMNO Y MATERIA");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    public javax.swing.JComboBox<Alumno> cbListaAlumnos;
    public javax.swing.JComboBox<Materia> cbListaMaterias;
    public javax.swing.JLabel labelAlumno;
    public javax.swing.JLabel labelCalificacion;
    public javax.swing.JLabel labelMateria;
    public javax.swing.JPanel panelCreacion;
    public javax.swing.JTextField txtCalificacion;
    // End of variables declaration//GEN-END:variables
}
