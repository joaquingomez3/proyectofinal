/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad1;

/**
 *
 * @author Fran Gonzalez
 */
public class Inscripcion {

    private int idInscripcion;
    private Alumno alumno;
    private Materia materia;
    private float calificacion;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, float calificacion) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public Inscripcion(Alumno alumno, Materia materia, float calificacion) {
        this.alumno = alumno;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", alumno=" + alumno + ", materia=" + materia + ", calificacion=" + calificacion + '}';
    }
    
    

}