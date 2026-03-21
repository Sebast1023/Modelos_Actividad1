package udistrital.edu.bandamusical.modelo;

/**
 *
 * 
 */
public class Piano implements Instrumento, Afinable {
    @Override
    public void tocar() {
        System.out.println("Tocando el piano");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando el piano");
    }
}