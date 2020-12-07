package vistas;

import universidad1.Alumno;
import universidad1.AlumnoData;
import universidad1.Conexion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class VistaListarAlumnos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ArrayList<Alumno> listaAlumnos;
    private AlumnoData alumnoData;
    private Conexion conexion;
    
    public VistaListarAlumnos() {
        initComponents();
        conexion = new Conexion();
        modelo =new DefaultTableModel();
        alumnoData = new AlumnoData(conexion);
        listaAlumnos = (ArrayList)alumnoData.obtenerAlumnos();
        
        armarCabeceraTabla();
        cargarDatos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_TituloListarAlumno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_ListadoAlumnos = new javax.swing.JTable();
        jbMostrarTodos = new javax.swing.JButton();
        jbFiltrarNoActivo = new javax.swing.JButton();
        jbFiltrarActivo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jl_TituloListarAlumno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_TituloListarAlumno.setForeground(new java.awt.Color(0, 0, 225));
        jl_TituloListarAlumno.setText("-Listar Alumnos-");

        jt_ListadoAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alumno", "Materia", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_ListadoAlumnos);

        jbMostrarTodos.setText("Mostrar Todos");
        jbMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarTodosActionPerformed(evt);
            }
        });

        jbFiltrarNoActivo.setText("No activos");
        jbFiltrarNoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiltrarNoActivoActionPerformed(evt);
            }
        });

        jbFiltrarActivo.setText("Activos");
        jbFiltrarActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiltrarActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jl_TituloListarAlumno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbMostrarTodos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbFiltrarActivo)
                                .addGap(18, 18, 18)
                                .addComponent(jbFiltrarNoActivo)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_TituloListarAlumno)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMostrarTodos)
                    .addComponent(jbFiltrarNoActivo)
                    .addComponent(jbFiltrarActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarTodosActionPerformed
        cargarDatos();
    }//GEN-LAST:event_jbMostrarTodosActionPerformed

    private void jbFiltrarNoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiltrarNoActivoActionPerformed
        filtrar(false);
    }//GEN-LAST:event_jbFiltrarNoActivoActionPerformed

    private void jbFiltrarActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiltrarActivoActionPerformed
        filtrar(true);
    }//GEN-LAST:event_jbFiltrarActivoActionPerformed
    
    
    public void armarCabeceraTabla(){
        ArrayList<Object> columns = new ArrayList<Object>();
        columns.add("ID");
        columns.add("APELLIDO");
        columns.add("NOMBRE");
        columns.add("FECHA NACIMIENTO");
        columns.add("ACTIVO");
        
        for (Object it:columns){
            modelo.addColumn(it);
        }
        jt_ListadoAlumnos.setModel(modelo);
    }
    
    public void borrarFilasTabla(){
        int a = modelo.getRowCount()-1;
        for(int i=a;i>=0;i--){
        modelo.removeRow(i);
      }
    }

    public void cargarDatos(){
        borrarFilasTabla();
        for(Alumno a:listaAlumnos){
            modelo.addRow(new Object[]{a.getIdAlumno(),a.getApellido(), a.getNombre(), a.getFechaNac(), a.isActivo() ? "SI" : "NO"});
        }
    }
    
    public void filtrar(boolean activo){
        borrarFilasTabla();
        for (Alumno a : listaAlumnos){
            if(a.isActivo() == activo){
                modelo.addRow(new Object[]{a.getIdAlumno(),a.getApellido(), a.getNombre(), a.getFechaNac(), a.isActivo() ? "SI" : "NO"});
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbFiltrarActivo;
    public javax.swing.JButton jbFiltrarNoActivo;
    public javax.swing.JButton jbMostrarTodos;
    public javax.swing.JLabel jl_TituloListarAlumno;
    public javax.swing.JTable jt_ListadoAlumnos;
    // End of variables declaration//GEN-END:variables
}
