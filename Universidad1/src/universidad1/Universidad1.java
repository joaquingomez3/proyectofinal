/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Universidad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Conexion con=new Conexion();
        Alumno a1 = new Alumno(-1,"Pepe", "Perez",LocalDate.of(2010, 8, 25),true);
        AlumnoData ad1 = new AlumnoData(con);
        ad1.guardarAlumno(a1);
        a1.setIdAlumno(7);
        ad1.eliminarAlumno(a1);
        a1 = ad1.buscarAlumno(6);
        List <Alumno> la1 = new ArrayList <Alumno> ();
        la1 = ad1.obtenerAlumnos();
        Alumno a2 = null;
        a2 = ad1.buscarAlumno(4);
        a2.setNombre("Juarez");
        ad1.actualizarAlumno(a2);   
        
        
       
    }    
}
