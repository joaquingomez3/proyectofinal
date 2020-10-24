
package database;

import entidades.Alumno;
import entidades.Materia;
import java.sql.Connection;
import modelo.AlumnoData;
import java.time.LocalDate;
import java.time.Month;
import modelo.Conexion;
import modelo.MateriaData;

public class DataBase {

    public static void main(String[] args) {
      Conexion conect =new Conexion();
      conect.getConnection();
     Alumno juan = new Alumno(2,"juan", "perez", LocalDate.of(2001, Month.FEBRUARY, 14), true);
      Alumno martin = new Alumno("martin", "janson", LocalDate.of(1998, Month.FEBRUARY, 24), true);
      Alumno mariano = new Alumno("mariano", "james", LocalDate.of(1999, Month.AUGUST, 12), true);
      Alumno marcelo = new Alumno("marcelo", "sanchez", LocalDate.of(1997, Month.FEBRUARY, 4), true);
      AlumnoData obj = new AlumnoData(conect);
      obj.guardarAlumno(juan);          
      obj.guardarAlumno(martin);            
      obj.guardarAlumno(mariano);     
      obj.guardarAlumno(marcelo);
      obj.eliminarAlumno(juan);
     Materia programacion = new Materia(1,"programacion"); 
     MateriaData obje= new MateriaData(conect);
     obje.guardarMateria(programacion);
     //obje.eliminarMateria(programacion);
     
     obje.actualizarMateria(programacion);
    }
    
}
