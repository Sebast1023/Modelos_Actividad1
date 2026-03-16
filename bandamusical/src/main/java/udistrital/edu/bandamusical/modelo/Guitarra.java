package udistrital.edu.bandamusical.modelo;

/**
 *
 * 
 */
public class Guitarra implements Instrumento, Afinable {
    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra ");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando la guitarra ");
    }
}
