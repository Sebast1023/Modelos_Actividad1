package udistrital.edu.bandamusical.modelo;

/**
 *
 * 
 */
public class Fiesta {
    private String nombre;
    private String ubicacion;
    private String fecha;
    private GrupoMusical grupoMusical;

    public Fiesta(String nombre, String ubicacion, String fecha) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
    }

    public void contratarBanda(GrupoMusical b) {
        this.grupoMusical = b;
    }

    public void iniciar() {
        System.out.println("¡Bienvenidos hoy "+fecha+" en "+ubicacion +" a la fiesta " + nombre + "!");
        if (grupoMusical != null) {
            grupoMusical.tocar();
        } else {
            System.out.println("No hay banda contratada.");
        }
    }
}
