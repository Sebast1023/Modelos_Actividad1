package udistrital.edu.bandamusical.modelo;

/**
 *
 */
public abstract class Musico {
    protected String nombre;
    protected int edad;

    public Musico(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método abstracto que cada subclase debe implementar
    public abstract void actuar();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }       

}
