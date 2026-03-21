package udistrital.edu.bandamusical.modelo;

/**
 *
 * 
 */
public class Cantante extends Musico {

    public Cantante(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void actuar() {
        System.out.println(nombre + " está cantando");
    }
}
