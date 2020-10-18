package modelo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import entidades.Alumno;
public class AlumnoData {
        private Connection con;
    
    public AlumnoData(Conexion conexion){
    
        con=conexion.getConnection();
    }
    
    public void guardarAlumno(Alumno alumno){
    
        String sql="INSERT into alumno (nombre, apellido, fechaNac ,activo) "
                + "VALUES(?, ?, ?, ?);";
        
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1,alumno.getNombre() );
        ps.setString(2,alumno.getApellido());
        ps.setDate(3, Date.valueOf(alumno.getFechaNac()));
        ps.setBoolean(4, alumno.isActivo());
        
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se cargo correctamente su alumno");
            } else {
                JOptionPane.showMessageDialog(null,"No puedo obtener id");
            }
       
        con.close();
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar Alumno");
        }
    }
    public void eliminarAlumno(Alumno alumno){
        String sql="DELETE FROM `alumno` WHERE idAlumno = ?";
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, alumno.getIdAlumno());
        
        ps.executeUpdate();
        
        //ResultSet rs = ps.getGeneratedKeys();

            //if (rs.next()) {
                
           // } else {
              //  JOptionPane.showMessageDialog(null,"No puedo obtener id");
        //    }
       
        con.close();
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al eliminar Alumno");
        } 
    }
}
