package vistas;

import universidad1.Alumno;
import universidad1.AlumnoData;
import universidad1.Materia;
import universidad1.MateriaData;
import universidad1.Inscripcion;
import universidad1.InscripcionData;
import universidad1.Conexion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class VistaListarAlumnos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ArrayList<Inscripcion> listaCursadas;
    private ArrayList<Materia> listaMaterias;
    private ArrayList<Alumno> listaAlumnos;
    private InscripcionData inscripcionData;
    private MateriaData materiaData;
    private AlumnoData alumnoData;
    private Conexion conexion;
    
    public VistaListarAlumnos() {
        initComponents();
        conexion = new Conexion();
        modelo =new DefaultTableModel();
        inscripcionData = new InscripcionData(conexion);
        listaCursadas = (ArrayList)inscripcionData.obtenerInscripciones();
        materiaData = new MateriaData(conexion);
        listaMaterias = (ArrayList)materiaData.obtenerMaterias();
        alumnoData = new AlumnoData(conexion);
        listaAlumnos = (ArrayList)alumnoData.obtenerAlumnos();
        cargarMaterias();
        armarCabeceraTabla();
        cargarDatos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_TituloListarAlumno = new javax.swing.JLabel();
        jcb_ListadoMaterias = new javax.swing.JComboBox<>();
        jl_Materia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_ListadoAlumnos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jl_TituloListarAlumno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_TituloListarAlumno.setForeground(new java.awt.Color(0, 0, 225));
        jl_TituloListarAlumno.setText("-Listar Alumnos-");

        jcb_ListadoMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_ListadoMateriasActionPerformed(evt);
            }
        });

        jl_Materia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_Materia.setText("Materias : ");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jl_Materia)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jl_TituloListarAlumno))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcb_ListadoMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl_Materia)
                        .addComponent(jcb_ListadoMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_TituloListarAlumno)
                        .addGap(38, 38, 38)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_ListadoMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_ListadoMateriasActionPerformed
        cargarDatos();
    }//GEN-LAST:event_jcb_ListadoMateriasActionPerformed
    public void cargarMaterias(){
        for (Materia item:listaMaterias){
            jcb_ListadoMaterias.addItem(item);
        }            
    }
    
    public void armarCabeceraTabla(){
        ArrayList<Object> columns = new ArrayList<Object>();
        columns.add("ID");
        columns.add("Nombre");
        columns.add("Nota");
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
        Materia mat=(Materia)jcb_ListadoMaterias.getSelectedItem();
        for(Inscripcion m:listaCursadas){
            if (m.getMateria().getIdMateria() == mat.getIdMateria())
            {
                modelo.addRow(new Object[]{m.getAlumno().getIdAlumno(), m.getAlumno().getNombre(), m.getCalificacion()});
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox<Object> jcb_ListadoMaterias;
    public javax.swing.JLabel jl_Materia;
    public javax.swing.JLabel jl_TituloListarAlumno;
    public javax.swing.JTable jt_ListadoAlumnos;
    // End of variables declaration//GEN-END:variables
}
