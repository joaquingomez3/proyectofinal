package universidad1;
import  java.sql.Connection ;
import  java.sql.Date ;
import  java.sql.PreparedStatement ;
import  java.sql.ResultSet ;
import  java.sql.SQLException ;
import  java.sql.Statement ;
import  java.util.ArrayList ;
import  java.util.List ;
import  javax.swing.JOptionPane ;

public class AlumnoData { 
    Connection con = null;
    public  AlumnoData (Conexion conexion) {
        con = conexion.getConexion();
    }

    public  void  guardarAlumno ( Alumno  alumno ) {
        String sql =  "INSERT INTO alumno (nombre,apellido,fechaNac,activo) VALUES (?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,alumno.getNombre());
            ps.setString(2,alumno.getApellido());
            ps.setDate(3,Date.valueOf (alumno.getFechaNac()));
            ps.setBoolean(4,alumno.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null , " El alumno ha sido cargado ");
            } else {
                JOptionPane.showMessageDialog(null , " No puedo obtener id ");
            }
            rs.close();
            ps.close();
            // con.close ();

        } catch ( SQLException e) {
            JOptionPane.showMessageDialog ( null , " Error al guardar Alumno en DB " );
        }

    }

    public  void  eliminarAlumno ( Alumno  alumno ) {
        String sql = "DELETE FROM alumno WHERE idAlumno =?;" ;
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS );
            ps.setInt (1,alumno.getIdAlumno());
            ps.executeUpdate();
            ps.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog( null ," Error al eliminar alumno ");
        }
    }

    public Alumno buscarAlumno(int idAlumno){
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE idAlumno =?;" ;
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,idAlumno);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                JOptionPane.showMessageDialog( null , " ALUMNO ENCONTRADO " );
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(rs.getBoolean("activo"));
            }
            else {JOptionPane.showMessageDialog(null ,"NO SE ENCONTRO EL ALUMNO CON DICHO ID");}
            ps.close();
            rs.close();
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null ,"NO SE ENCONTRO EL ALUMNO CON DICHO ID" );
        }
        return alumno;
    }

        public List<Alumno> obtenerAlumnos () {
        Alumno alumno = null;
        List <Alumno> alumnos =  new ArrayList<>();
        String sql = "SELECT * FROM alumno;";

        try {
            PreparedStatement ps = con.prepareStatement (sql);

            ResultSet rs = ps.executeQuery();

            JOptionPane.showMessageDialog( null , "ALUMNOS ENCONTRADOS:" );
            while (rs.next ()) {
                alumno = new Alumno ();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(rs.getBoolean("activo"));
                alumnos.add(alumno);
            }
            ps.close();

        } catch ( SQLException ex) {
            JOptionPane . showMessageDialog ( null , " ERROR DE TIPO: "  + ex);
        }
        return alumnos;
    }
        public void actualizarAlumno ( Alumno  alumno ) {
        String sql = "UPDATE alumno SET nombre =?, Apellido =?, FechaNac =?, Activo =? WHERE idAlumno =?;";    
        try {
            PreparedStatement ps;
            ps = con . prepareStatement (sql);
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setDate(3,Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean (4, alumno.isActivo());
            ps.setInt(5,alumno.getIdAlumno());

            if (ps.executeUpdate()!= 0){
                JOptionPane.showMessageDialog (null ,"SE ACTUALIZO ALUMNO");
            }
            else { JOptionPane.showMessageDialog (null ,"NO SE PUDO ACTUALIZAR ALUMNO");} 
                                    
           }
        catch ( SQLException ex) {
            JOptionPane . showMessageDialog ( null , " "  + ex);
                                    }
       }
}
