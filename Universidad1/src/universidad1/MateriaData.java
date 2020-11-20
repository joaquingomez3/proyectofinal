package universidad1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidad1.Materia;
import java.util.ArrayList;
import java.util.List;




public class MateriaData {

    private Connection con;

    public MateriaData(Conexion conexion) {

        con = conexion.getConnection();
    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia (nombreMateria) "
                + "VALUES(?);";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombreMateria());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se cargo correctamente su materia");
            } else {
                JOptionPane.showMessageDialog(null, "No puedo obtener id");
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al guardar materia");
        }
    }

    public void eliminarMateria(Materia materia) {
        String sql = "DELETE FROM `materia` WHERE idMateria = ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, materia.getIdMateria());

            ps.executeUpdate();

            ps.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR MATERIA");
        }
    }

    public Materia buscarMateria(int idMateria) {
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombreMateria(rs.getString("nombreMateria"));

            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO LA MATERIA CON DICHO ID");
            }

            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }

        return materia;
    }

    public List<Materia> obtenerMaterias() {
        Materia materia = null;
        List<Materia> materias = new ArrayList<Materia>();
        String sql = "SELECT * FROM materia";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            JOptionPane.showMessageDialog(null, "MATERIAS ENCONTRADAS");
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombreMateria(rs.getString("nombreMateria"));

                materias.add(materia);
            }

            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE TIPO: " + ex);
        }

        return materias;
    }

    public void actualizarMateria(Materia materia){
        String sql= "UPDATE materia SET nombreMateria= ? WHERE materia.idMateria = ?";
        
        
        try {
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombreMateria());
            ps.setDouble(2, materia.getIdMateria());
            
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "SE MODIFICO MATERIA");
            }
            else {JOptionPane.showMessageDialog(null, "NO SE PUDO MODIFICAR MATERIA");}
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "" + ex);
        }
        
    }

}
