package universidad1;
public class Materia {
    private int idMateria;
    private String nombreMateria;

    public Materia(int idMateria, String nombreMateria) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
    }

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Materia() {
    }
    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    
    @Override
    public String toString() {
        return "\nMateria: " + "\n|ID: " + idMateria + "\n|Nombre: " + nombreMateria + "\n";
    }
}
