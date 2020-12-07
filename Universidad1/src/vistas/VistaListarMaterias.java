/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import universidad1.Conexion;
import universidad1.Materia;
import universidad1.MateriaData;

/**
 *
 * @author Fran Gonzalez
 */
public class VistaListarMaterias extends javax.swing.JInternalFrame {

    private Conexion conexion;
    private DefaultTableModel modelo;
    private MateriaData materiaData;
    private ArrayList<Materia> listaMaterias;
    
    public VistaListarMaterias() {
        initComponents();
        conexion = new Conexion();
        modelo =new DefaultTableModel();
        
        materiaData = new MateriaData(conexion);
        listaMaterias = (ArrayList<Materia>) materiaData.obtenerMaterias();
       
        
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

        labelListarMaterias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListadoMaterias = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        labelListarMaterias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelListarMaterias.setForeground(new java.awt.Color(0, 0, 225));
        labelListarMaterias.setText("-Listar Materias-");

        jtListadoMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE MATERIA"
            }
        ));
        jScrollPane1.setViewportView(jtListadoMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(labelListarMaterias)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelListarMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void armarTabla(){
        ArrayList<Object> columns = new ArrayList<>();
        columns.add("ID");
        columns.add("NOMBRE");
        
        for(Object iterator:columns){
            modelo.addColumn(iterator);
        }
        jtListadoMaterias.setModel(modelo);
    }
    
    private void borrarFilasTabla(){
        int contadorFilas = modelo.getRowCount() - 1;
        
        for (int i=contadorFilas;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
    public void cargarTablaCompleta(){
        borrarFilasTabla();
        for(Materia m: listaMaterias){
            modelo.addRow(new Object[]{m.getIdMateria(),m.getNombreMateria()});
        }
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtListadoMaterias;
    public javax.swing.JLabel labelListarMaterias;
    // End of variables declaration//GEN-END:variables
}