package database;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import modelo.AlumnoData;
import modelo.Conexion;
import modelo.InscripcionData;
import modelo.MateriaData;

/**
 *
 * 
 */
public class DataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 

        Conexion c = new Conexion();
        c.getConnection();
        AlumnoData alumD = new AlumnoData(c);
        MateriaData matD = new MateriaData(c);
        InscripcionData insD = new InscripcionData(c);
        
        
        // Creando alumnos
        Alumno alu01 = new Alumno("Jose", "Jornal", LocalDate.of(1994, Month.APRIL, 1), true);
        Alumno alu02 = new Alumno("Makise", "Kurisu", LocalDate.of(1990, Month.FEBRUARY, 10), false);
        Alumno alu03 = new Alumno("Manuel", "Belgrano", LocalDate.of(1999, Month.FEBRUARY, 7), true);
        Alumno alu04 = new Alumno("Julio", "Roca", LocalDate.of(2000, Month.SEPTEMBER, 16), false);
        Alumno alu05 = new Alumno("Margaret", "Tatcher", LocalDate.of(1999, Month.DECEMBER, 4), true);
        Alumno alu06 = new Alumno("Frida", "Kahlo", LocalDate.of(1995, Month.FEBRUARY, 7), false);
        Alumno alu07 = new Alumno("Janis", "Joplin", LocalDate.of(1996, Month.SEPTEMBER, 3), true);
        Alumno alu08 = new Alumno("Michel", "Obama", LocalDate.of(1998, Month.NOVEMBER, 23), false);
        Alumno alu09 = new Alumno("Charles", "Ray", LocalDate.of(1997, Month.OCTOBER, 30), true);
        
        List<Alumno> alumnos = Arrays.asList(alu01,alu02,alu03,alu04,alu05,alu06,alu07,alu08,alu09);
        /*for(Alumno alumno: alumnos)                   //Guardando alumnos en base
            alumD.guardarAlumno(alumno);*/
        
        //Buscar alumno
        //Alumno prue = alumD.buscarAlumno(6);
        //System.out.println(prue);
        
        //Actualizar alumno
        /*
        Alumno al = alumD.buscarAlumno(6);
        System.out.println(al);
        al.setActivo(false);
        alumD.actualizarAlumno(al);
        System.out.println(al);
        */
        
        //Eliminar alumno
        //alumD.eliminarAlumno(alumD.buscarAlumno(6));
        
        //Listar alumnos
        //List<Alumno> prue = alumD.obtenerAlumnos();
        //System.out.println(prue);
        
        
        
        //Creando materias
        Materia mat01 = new Materia("Pruebas");
        Materia mat02 = new Materia("Psicologia");
        Materia mat03 = new Materia("Metadatos");
        Materia mat04 = new Materia("Informatica");
        Materia mat05 = new Materia("Filosofia");
        Materia mat06 = new Materia("Base de datos");
        Materia mat07 = new Materia("Hardware");
        Materia mat08 = new Materia("Telecomunicaciones");
        Materia mat09 = new Materia("Laboratorio 4");
        
        List<Materia> materias = Arrays.asList(mat01,mat02,mat03,mat04,mat05,mat06,mat07,mat08,mat09);
        /*for(Materia materia : materias)               //Guardando materias en base
            matD.guardarMateria(materia);*/
        
        
        //Buscar materia
        //Materia prue = matD.buscarMateria(6);
        //System.out.println(prue);
        
        //Actualizar materia
        /*
        Materia md = matD.buscarMateria(6);
        System.out.println(md);
        md.setNombreMateria("PSICOLOGIA");
        matD.actualizarMateria(md);
        System.out.println(md);
        */
        
        //Eliminar materia
        //matD.eliminarMateria(matD.buscarMateria(6));
        
        //Listar materias
        //List<Materia> prue = matD.obtenerMaterias();
        //System.out.println(prue);
        
        
        
        //Creando inscripciones
        //Inscripcion in01 = new Inscripcion(alumD.buscarAlumno(0),matD.buscarMateria(0));       // modificar ids para cargar diferentes alumnos y materias
        /*
        Inscripcion in02 = new Inscripcion(alumD.buscarAlumno(5),matD.buscarMateria(6));
        Inscripcion in03 = new Inscripcion(alumD.buscarAlumno(7),matD.buscarMateria(7));
        Inscripcion in04 = new Inscripcion(alumD.buscarAlumno(12),matD.buscarMateria(10));
        Inscripcion in05 = new Inscripcion(alumD.buscarAlumno(12),matD.buscarMateria(10));
        Inscripcion in06 = new Inscripcion(alumD.buscarAlumno(12),matD.buscarMateria(10));
        Inscripcion in07 = new Inscripcion(alumD.buscarAlumno(11),matD.buscarMateria(13));
        Inscripcion in08 = new Inscripcion(alumD.buscarAlumno(9),matD.buscarMateria(12));
        Inscripcion in09 = new Inscripcion(alumD.buscarAlumno(8),matD.buscarMateria(4));
            
        List<Inscripcion> inscripciones = Arrays.asList(in01,in02,in03,in04,in05,in06,in07,in08,in09);
        */
        

        //Guardando inscripcion en base
        //insD.guardarInscripcion(in01);               
                                                    
        //Buscar inscripcion
        //insD.buscarInscripcion(19);
        
        //Actualizar inscripcion
        //insD.actualizarInscripcion(insD.buscarInscripcion(0));
        
        //Eliminar inscripcion
        //insD.eliminarInscripcion(insD.buscarInscripcion(0));
        
        //Listar inscripciones
        //List<Inscripcion> prue = insD.obtenerInscripciones();
        //System.out.println(prue);
        
        //Listar por Alumno
        //List<Materia> prue = insD.listarMateriasXAlumno(19);
        //System.out.println(prue);
        
        //Listar por Materia
        //List<Alumno> prue = insD.listarAlumnosXMateria(6);
        //System.out.println(prue);
        
           
       

    }

}
