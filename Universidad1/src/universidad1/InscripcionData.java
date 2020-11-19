package universidad1;
import  java.sql.Connection ;
import  java.sql.PreparedStatement ;
import  java.sql.ResultSet ;
import  java.sql.SQLException ;
import  java.sql.Statement ;
import  java.util.ArrayList ;
import  java.util.List ;
import  javax.swing.JOptionPane ;

public class InscripcionData {
    Connection con = null;
    public  InscripcionData (Conexion conexion) {
        con = conexion.getConexion();
    }
    public  void  guardarInscripcion ( Inscripcion  inscripcion ) {
        
        String sql =  "INSERT INTO inscripcion (idAlumno,idMateria,calificacion) VALUES (?,?,?);" ;
        
        try {
            PreparedStatement ps = con . prepareStatement (sql, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1 , inscripcion.getAlumno().getIdAlumno());
            ps.setInt( 2 , inscripcion.getMateria ().getIdMateria());
            ps.setDouble( 3 , inscripcion.getCalificacion());       
            ps.executeUpdate ();            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                inscripcion.setIdInscripcion(rs.getInt( 1 ));
                JOptionPane.showMessageDialog( null ," Se ha cargado la inscripicio correctamente " );
            } else {
                JOptionPane.showMessageDialog( null , " No puedo obtener id " );
            }
       
            ps.close();
            rs.close();
// con.close ();
            
        } catch ( SQLException e) {
            JOptionPane.showMessageDialog( null , " Error al guardar la inscripcion en DB " );
        }       
    }  
    public  void  eliminarInscripcion ( Inscripcion  inscripcion ) {        
    
        String sql =  " BORRAR DE` inscripcion` DONDE idInscripcion =?; " ;
        
        try {
            PreparedStatement ps = con.prepareStatement (sql, Statement . RETURN_GENERATED_KEYS );
            ps . setInt ( 1 , inscripcion . getIdInscripcion ());
            
            ps . executeUpdate ();
            
            ps . close();
            // con.close ();
        } catch ( SQLException e) {
            JOptionPane . showMessageDialog ( null , " ERROR DE TIPO: "  + e);
        }
            
    }
    
    public  void  actualizarInscripcion ( Inscripcion  inscripcion ) {
        String sql =  " ACTUALIZAR inscripcion SET calificacion =? WHERE inscripcion.idInscripcion =?; " ;
        
        
        try {
            PreparedStatement ps;
            ps = con.prepareStatement (sql);
            ps.setDouble ( 1 , inscripcion.getCalificacion());
            ps.setInt ( 2 , inscripcion.getIdInscripcion());
            
            if (ps.executeUpdate() !=  0 ) {
                JOptionPane.showMessageDialog ( null , "SE MODIFICO INSCRIPCION " );
            }
            else { JOptionPane.showMessageDialog ( null , "NO SE PUDO MODIFICAR INSCRIPCION " );}
            
            
        } catch ( SQLException ex) {
            JOptionPane.showMessageDialog ( null, " "  + ex);
        }
        
    }
    public Alumno obtieneAlumno ( int  idAlumno ) {
        Conexion c =  new  Conexion ();
       // Anuncio de AlumnoData =  nuevo  AlumnoData (c);
        //anuncio de retorno . buscarAlumno (idAlumno);
        AlumnoData a = new AlumnoData (c);
        Alumno a2 = a.buscarAlumno(idAlumno);
        return a2;
    }

    public  Materia  obtieneMateria ( int  idMateria ) {
        Conexion c =  new  Conexion ();
        MateriaData md =  new  MateriaData (c);
        return md . buscarMateria (idMateria);
    }

    public  List < Alumno >  listarAlumnosXMateria ( int  idMateria ) {
        List < Alumno > alumnos =  new  ArrayList < Alumno > ();
        Alumno alumno =  null ;

        String sql =  " SELECT * FROM inscripcion WHERE idMateria =?;" ;

        try {
            PreparedStatement ps;
            ps = con . prepareStatement (sql);
            ps . setInt ( 1 , idMateria);
            ResultSet rs = ps.executeQuery(); // trae un listado con inscripciones

            while (rs . next ()) {
                JOptionPane . showMessageDialog ( null , " Cargando alumnos encontrados .... " );
                alumno = obtieneAlumno (rs . getInt ( " idAlumno " ));

                alumnos . add (alumno);
            }

        } catch ( SQLException ex) {
            // Logger.getLogger (InscripcionData.class.getName ()). Log (Level.SEVERE, null, ex);
        }
        return alumnos;

    }
        public List< Materia > MateriaXAlumno ( int  idAlumno ) {
        List < Materia > materias =  new  ArrayList < Materia > ();
        Materia materia =  null ;

        String sql =  " SELECT * FROM inscripcion WHERE idAlumno =?; " ;

        try {
            PreparedStatement ps;
            ps = con . prepareStatement (sql);
            ps . setInt ( 1 , idAlumno);
            ResultSet rs = ps.executeQuery(); // trae un listado con inscripciones

            while (rs . next ()) {
                JOptionPane . showMessageDialog ( null , " Cargando materias encontradas .... " );
                materia = obtieneMateria (rs . getInt ( " idMateria " ));
                materias . add (materia);
            }

        } catch ( SQLException ex) {
            //Logger.getLogger (InscripcionData.class.getName ()). Log (Level.SEVERE, null, ex);
        }
        return materias;

    }
}
