package universidad1;

import universidad1.Alumno;
import universidad1.Inscripcion;
import universidad1.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fran Gonzalez
 */
public class InscripcionData {

    private Connection con;

    public InscripcionData(Conexion conexion) {
        con = conexion.getConnection();
    }

    public void guardarInscripcion(Inscripcion inscripcion) {

        String sql = "INSERT INTO `inscripcion` (`idAlumno`,`idMateria`,`calificacion`) "
                + "VALUES (?, ?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            ps.setFloat(3, inscripcion.getCalificacion());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                inscripcion.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha cargado la inscripicio correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No puedo obtener id");
            }

            ps.close();
            rs.close();
//con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la inscripcion en DB");
        }

    }

    public void eliminarInscripcion(Inscripcion inscripcion) {

        String sql = "DELETE FROM `inscripcion` WHERE idInscripcion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getIdInscripcion());

            ps.executeUpdate();

            ps.close();
            //con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR DE TIPO: " + e);
        }

    }

    public Inscripcion buscarInscripcion(int idInscripcion) {

        Inscripcion ins = null;
        String sql = "SELECT * FROM inscripcion WHERE idInscripcion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idInscripcion);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ins = new Inscripcion();
                ins.setIdInscripcion(rs.getInt("idInscripcion"));
                ins.setCalificacion(rs.getFloat("calificacion"));
                ins.setAlumno(obtieneAlumno(rs.getInt("idAlumno")));
                ins.setMateria(obtieneMateria(rs.getInt("idMateria")));
            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO LA INSCRIPCION CON DICHO ID");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de tipo:");
        }
        return ins;
    }
    
    public Inscripcion buscarInscripcionXIdForaneos(int idMateria, int idAlumno) {

        Inscripcion ins = null;
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ins = new Inscripcion();
                ins.setIdInscripcion(rs.getInt("idInscripcion"));
                ins.setCalificacion(rs.getFloat("calificacion"));
                ins.setAlumno(obtieneAlumno(rs.getInt("idAlumno")));
                ins.setMateria(obtieneMateria(rs.getInt("idMateria")));
            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO LA INSCRIPCION CON DICHO ID");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de tipo:");
        }
        return ins;
    }

    public void actualizarInscripcion(Inscripcion inscripcion) {
        String sql = "UPDATE inscripcion SET calificacion= ? WHERE inscripcion.idInscripcion = ?";

        try {
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setFloat(1, inscripcion.getCalificacion());
            ps.setInt(2, inscripcion.getIdInscripcion());

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "SE MODIFICO INSCRIPCION");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO MODIFICAR INSCRIPCION");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "" + ex);
        }

    }

    public Alumno obtieneAlumno(int idAlumno) {
        Conexion c = new Conexion();
        AlumnoData ad = new AlumnoData(c);
        return ad.buscarAlumno(idAlumno);
    }

    public Materia obtieneMateria(int idMateria) {
        Conexion c = new Conexion();
        MateriaData md = new MateriaData(c);
        return md.buscarMateria(idMateria);
    }

    public List<Inscripcion> listarAlumnosXMateria(int idMateria) {
        List<Inscripcion> alumnos = new ArrayList<Inscripcion>();
        Inscripcion ins = null;

        String sql = "SELECT * FROM inscripcion WHERE idMateria = ?";

        try {
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery(); // trae un listado con inscripciones

            while (rs.next()) {
                ins = new Inscripcion();
                ins.setIdInscripcion(rs.getInt("idInscripcion"));
                ins.setCalificacion(rs.getFloat("calificacion"));
                ins.setAlumno(obtieneAlumno(rs.getInt("idAlumno")));
                ins.setMateria(obtieneMateria(rs.getInt("idMateria")));
                alumnos.add(ins);
                alumnos.add(ins);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumnos;

    }
    
    public List<Inscripcion> listarMateriasXAlumno(int idAlumno) {
        List<Inscripcion> materias = new ArrayList<Inscripcion>();
        Inscripcion ins = null;

        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";

        try {
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery(); // trae un listado con inscripciones

            while (rs.next()) {
                ins = new Inscripcion();
                ins.setIdInscripcion(rs.getInt("idInscripcion"));
                ins.setCalificacion(rs.getFloat("calificacion"));
                ins.setAlumno(obtieneAlumno(rs.getInt("idAlumno")));
                ins.setMateria(obtieneMateria(rs.getInt("idMateria")));
                materias.add(ins);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materias;

    }
    
    public List<Inscripcion> obtenerInscripciones() {
        Inscripcion ins = null;
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            JOptionPane.showMessageDialog(null, "INSCRIPCIONES ENCONTRADAS");
            while (rs.next()) {
                ins = new Inscripcion();
                ins.setIdInscripcion(rs.getInt("idInscripcion"));
                ins.setCalificacion(rs.getFloat("calificacion"));
                ins.setAlumno(obtieneAlumno(rs.getInt("idAlumno")));
                ins.setMateria(obtieneMateria(rs.getInt("idMateria")));
                
                inscripciones.add(ins);
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE TIPO: " + ex);
        }

        return inscripciones;
    }

}