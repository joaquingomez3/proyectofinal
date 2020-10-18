package modelo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import entidades.Alumno;
import entidades.Materia;
public class MateriaData {
        private Connection con;
    
    public MateriaData(Conexion conexion){
    
        con=conexion.getConnection();
    }
    
    public void guardarMateria(Materia materia){
    
        String sql="INSERT into materia (nombreMateria) "
                + "VALUES(?);";
        
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1,materia.getNombreMateria() );
        
        
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se cargo correctamente su materia");
            } else {
                JOptionPane.showMessageDialog(null,"No puedo obtener id");
            }
       
        con.close();
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar materia");
        }
    }
    public void eliminarMateria(Materia materia){
        String sql="DELETE FROM `materia` WHERE idMateria = ?";
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, materia.getIdMateria());
        
        ps.executeUpdate();
        
        //ResultSet rs = ps.getGeneratedKeys();

            //if (rs.next()) {
                
           // } else {
              //  JOptionPane.showMessageDialog(null,"No puedo obtener id");
        //    }
       
        con.close();
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al eliminar Materia");
        } 
    }
}