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

public class VistaListarAlumnos extends javax.swing.JPanel {

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
     // listaCursadas = (ArrayList)inscripcionData.obtieneAlumno(WIDTH);
        materiaData = new MateriaData(conexion);
        listaMaterias = (ArrayList)materiaData.obtenerMaterias();
        alumnoData = new AlumnoData(conexion);
        listaAlumnos = (ArrayList)alumnoData.obtenerAlumnos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jl_TituloListarAlumno = new javax.swing.JLabel();
        jcb_ListadoMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_ListadoAlumnos = new javax.swing.JTable();
        jl_Materia = new javax.swing.JLabel();

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setVisible(true);

        jl_TituloListarAlumno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_TituloListarAlumno.setForeground(new java.awt.Color(0, 0, 225));
        jl_TituloListarAlumno.setText("-Listar Alumnos-");

        jt_ListadoAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
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

        jl_Materia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_Materia.setText("Materias : ");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_Materia)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jl_TituloListarAlumno))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jcb_ListadoMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jl_TituloListarAlumno)
                .addGap(21, 21, 21)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Materia)
                    .addComponent(jcb_ListadoMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox<String> jcb_ListadoMaterias;
    public javax.swing.JLabel jl_Materia;
    public javax.swing.JLabel jl_TituloListarAlumno;
    public javax.swing.JTable jt_ListadoAlumnos;
    // End of variables declaration//GEN-END:variables
}
