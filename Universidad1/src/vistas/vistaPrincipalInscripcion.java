/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import universidad1.Alumno;
import universidad1.Inscripcion;
import universidad1.Materia;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import universidad1.AlumnoData;
import universidad1.Conexion;
import universidad1.InscripcionData;
import universidad1.MateriaData;

/**
 *
 * @author Fran Gonzalez
 */
public class vistaPrincipalInscripcion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ArrayList<Inscripcion> listaInscripcion;
    private ArrayList<Materia> listaMaterias;
    private ArrayList<Alumno> listaAlumnos;
    private InscripcionData inscripcionData;
    private MateriaData materiaData;
    private AlumnoData alumnoData;
    private Conexion conexion;
    
    public vistaPrincipalInscripcion() {
        initComponents();
        conexion = new Conexion();
        conexion.getConnection();
        modelo = new DefaultTableModel();
        
        inscripcionData = new InscripcionData(conexion);
        listaInscripcion = (ArrayList<Inscripcion>) inscripcionData.obtenerInscripciones();
        
        materiaData = new MateriaData(conexion);
        listaMaterias = (ArrayList<Materia>) materiaData.obtenerMaterias();
        
        alumnoData = new AlumnoData(conexion);
        listaAlumnos = (ArrayList<Alumno>) alumnoData.obtenerAlumnos();
        
        cbCargarlistadoMaterias();
        armarTabla();
        cargarTablaCompleta();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSeleccion = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cbListaMaterias = new javax.swing.JComboBox<>();
        cbListaAlumnos = new javax.swing.JComboBox<>();
        labelAlumno = new javax.swing.JLabel();
        labelMateria = new javax.swing.JLabel();
        btnFiltrar = new javax.swing.JButton();
        txtSeleccion = new javax.swing.JTextField();
        labelInscripcion = new javax.swing.JLabel();
        panelDetalles = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabDetalles = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        panelSeleccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccion Inscripcion"));

        btnCrear.setText("CREAR");

        btnEditar.setText("EDITAR");

        btnEliminar.setText("ELIMINAR");

        cbListaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaMateriasActionPerformed(evt);
            }
        });

        cbListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaAlumnosActionPerformed(evt);
            }
        });

        labelAlumno.setText("Alumno");

        labelMateria.setText("Materia");

        btnFiltrar.setText("Filtrar");
        btnFiltrar.setToolTipText("");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        txtSeleccion.setText("0");
        txtSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeleccionActionPerformed(evt);
            }
        });

        labelInscripcion.setText("Id Inscrip");

        javax.swing.GroupLayout panelSeleccionLayout = new javax.swing.GroupLayout(panelSeleccion);
        panelSeleccion.setLayout(panelSeleccionLayout);
        panelSeleccionLayout.setHorizontalGroup(
            panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btnFiltrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSeleccionLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAlumno)
                    .addComponent(cbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMateria))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSeleccionLayout.createSequentialGroup()
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelInscripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar))
        );
        panelSeleccionLayout.setVerticalGroup(
            panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(txtSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelInscripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlumno)
                    .addComponent(labelMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnFiltrar)
                .addGap(6, 6, 6))
        );

        panelDetalles.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles Inscripcion"));

        tabDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MATERIA", "ALUMNO", "ACTIVO", "CALIFICACION"
            }
        ));
        jScrollPane2.setViewportView(tabDetalles);

        btnListar.setText("Listar Todo");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDetallesLayout = new javax.swing.GroupLayout(panelDetalles);
        panelDetalles.setLayout(panelDetallesLayout);
        panelDetallesLayout.setHorizontalGroup(
            panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetallesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addComponent(btnListar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDetallesLayout.setVerticalGroup(
            panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetallesLayout.createSequentialGroup()
                .addComponent(btnListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cbListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbListaAlumnosActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        cargarTablaCompleta();
    }//GEN-LAST:event_btnListarActionPerformed

    private void cbListaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbListaMateriasActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void txtSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeleccionActionPerformed

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
    
    private void armarTabla(){
        ArrayList<Object> columns = new ArrayList<>();
        columns.add("ID");
        columns.add("MATERIA");
        columns.add("ALUMNO");
        columns.add("ACTIVO");
        columns.add("CALIFICACION");
        
        for(Object iterator:columns){
            modelo.addColumn(iterator);
        }
        tabDetalles.setModel(modelo);
    }
    
    private void borrarFilasTabla(){
        int contadorFilas = modelo.getRowCount() - 1;
        
        for (int i=contadorFilas;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
    public void cargarTablaCompleta(){
        borrarFilasTabla();
        
        for(Inscripcion ins: listaInscripcion){
            modelo.addRow(new Object[]{ins.getIdInscripcion(),ins.getMateria().getNombreMateria(),ins.getAlumno().getApellido()+", "+ins.getAlumno().getNombre(),ins.getAlumno().isActivo(),ins.getCalificacion()});
        }
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCrear;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnFiltrar;
    public javax.swing.JButton btnListar;
    public javax.swing.JComboBox<Alumno> cbListaAlumnos;
    public javax.swing.JComboBox<Materia> cbListaMaterias;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel labelAlumno;
    public javax.swing.JLabel labelInscripcion;
    public javax.swing.JLabel labelMateria;
    private javax.swing.JPanel panelDetalles;
    private javax.swing.JPanel panelSeleccion;
    public javax.swing.JTable tabDetalles;
    public javax.swing.JTextField txtSeleccion;
    // End of variables declaration//GEN-END:variables
}