package vistas;
import universidad1.Alumno;
import universidad1.AlumnoData;
import universidad1.Conexion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VistaAlumno extends javax.swing.JInternalFrame {

    private AlumnoData alumnoData;
    private Conexion conexion;
    
    public VistaAlumno() {
        initComponents();
        conexion = new Conexion();
        alumnoData = new AlumnoData(conexion);
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Limpiar = new javax.swing.JButton();
        jb_Borrar = new javax.swing.JButton();
        jb_Guardar = new javax.swing.JButton();
        jb_Buscar = new javax.swing.JButton();
        jcb_Activo = new javax.swing.JCheckBox();
        jtf_FechaNacimiento = new javax.swing.JTextField();
        jtf_Nombre = new javax.swing.JTextField();
        jtf_IdAlumno = new javax.swing.JTextField();
        jtf_Apellido = new javax.swing.JTextField();
        jb_Activo = new javax.swing.JLabel();
        jb_FechaNac = new javax.swing.JLabel();
        jl_Apellido = new javax.swing.JLabel();
        jb_Nombre = new javax.swing.JLabel();
        jb_IdAlumno = new javax.swing.JLabel();
        jb_TituloAlumno = new javax.swing.JLabel();
        jb_Actualizar1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jb_Limpiar.setText("Limpiar");
        jb_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_LimpiarActionPerformed(evt);
            }
        });

        jb_Borrar.setText("Borrar");
        jb_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BorrarActionPerformed(evt);
            }
        });

        jb_Guardar.setText("Guardar");
        jb_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarActionPerformed(evt);
            }
        });

        jb_Buscar.setText("Buscar");
        jb_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarActionPerformed(evt);
            }
        });

        jb_Activo.setText("Activo");

        jb_FechaNac.setText("Fecha Nacimiento");

        jl_Apellido.setText("Apellido");

        jb_Nombre.setText("Nombre");

        jb_IdAlumno.setText("Id Alumno");

        jb_TituloAlumno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_TituloAlumno.setForeground(new java.awt.Color(0, 0, 225));
        jb_TituloAlumno.setText("-Alumno-");

        jb_Actualizar1.setText("Actualizar1");
        jb_Actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Actualizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Nombre)
                    .addComponent(jb_IdAlumno)
                    .addComponent(jb_FechaNac)
                    .addComponent(jb_Activo)
                    .addComponent(jl_Apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_IdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jcb_Activo)
                    .addComponent(jtf_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Limpiar)
                    .addComponent(jb_Buscar)
                    .addComponent(jb_Borrar)
                    .addComponent(jb_Guardar)
                    .addComponent(jb_Actualizar1))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_TituloAlumno)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_TituloAlumno)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcb_Activo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_Borrar)
                        .addGap(9, 9, 9)
                        .addComponent(jb_Actualizar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_Limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_IdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_IdAlumno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_Nombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Apellido))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_FechaNac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_Activo)
                        .addGap(7, 7, 7)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_LimpiarActionPerformed
        jtf_Nombre.setText("");
        jtf_Apellido.setText("");
        jtf_IdAlumno.setText("");
        jtf_FechaNacimiento.setText("");
        jcb_Activo.setEnabled(true);
    }//GEN-LAST:event_jb_LimpiarActionPerformed

    private void jb_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BorrarActionPerformed
        int id = Integer.parseInt(jtf_IdAlumno.getText());
        Alumno a = null;
        a = alumnoData.buscarAlumno(id);
        alumnoData.eliminarAlumno(a);
    }//GEN-LAST:event_jb_BorrarActionPerformed

    private void jb_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarActionPerformed
        String nombre = jtf_Nombre.getText();
        String apellido = jtf_Apellido.getText();
        LocalDate fechaNac = LocalDate.parse(jtf_FechaNacimiento.getText(), DateTimeFormatter.ofPattern("yyyy-mm-dd"));
        boolean activo = jcb_Activo.isSelected();
        Alumno a = new Alumno(-1, apellido ,nombre, fechaNac, activo);
        alumnoData.guardarAlumno(a);
        jtf_IdAlumno.setText(a.getIdAlumno() + "");
    }//GEN-LAST:event_jb_GuardarActionPerformed

    private void jb_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarActionPerformed
        int id = Integer.parseInt(jtf_IdAlumno.getText());
        Alumno a = new Alumno();
        a = alumnoData.buscarAlumno(id);
        if (a != null){
            jtf_IdAlumno.setText(a.getIdAlumno() + "");
            jtf_Nombre.setText(a.getNombre());
            jtf_Apellido.setText(a.getApellido());
            jtf_FechaNacimiento.setText(a.getFechaNac().toString());
            jcb_Activo.setSelected(a.isActivo());

        }
    }//GEN-LAST:event_jb_BuscarActionPerformed

    private void jb_Actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Actualizar1ActionPerformed
        if (jtf_IdAlumno.getText() != null)
        {
            int id = Integer.parseInt(jtf_IdAlumno.getText());
            String nombre = jtf_Nombre.getText();
            String apellido = jtf_Apellido.getText();
            LocalDate fechaNac = LocalDate.parse(jtf_FechaNacimiento.getText(), DateTimeFormatter.ofPattern("yyyy-mm-dd"));
            boolean activo = jcb_Activo.isSelected();
            Alumno a = new Alumno(id, apellido ,nombre, fechaNac, activo);
            alumnoData.actualizarAlumno(a);
        }
    }//GEN-LAST:event_jb_Actualizar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jb_Activo;
    private javax.swing.JButton jb_Actualizar1;
    public javax.swing.JButton jb_Borrar;
    public javax.swing.JButton jb_Buscar;
    public javax.swing.JLabel jb_FechaNac;
    public javax.swing.JButton jb_Guardar;
    public javax.swing.JLabel jb_IdAlumno;
    public javax.swing.JButton jb_Limpiar;
    public javax.swing.JLabel jb_Nombre;
    public javax.swing.JLabel jb_TituloAlumno;
    public javax.swing.JCheckBox jcb_Activo;
    public javax.swing.JLabel jl_Apellido;
    public javax.swing.JTextField jtf_Apellido;
    public javax.swing.JTextField jtf_FechaNacimiento;
    public javax.swing.JTextField jtf_IdAlumno;
    public javax.swing.JTextField jtf_Nombre;
    // End of variables declaration//GEN-END:variables
}
