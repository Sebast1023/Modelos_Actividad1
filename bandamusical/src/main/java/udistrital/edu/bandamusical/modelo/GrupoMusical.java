package udistrital.edu.bandamusical.modelo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * 
 */
public class GrupoMusical {
    private String nombre;
    private String genero;
    private List<Musico> musicos;

    public GrupoMusical(String nombre, String genero) {
        this.nombre = nombre;
        this.nombre = genero;
        this.musicos = new ArrayList<>();
    }

    public void agregarMusico(Musico m) {
        musicos.add(m);
    }

    public void tocar() {
        System.out.println("La banda " + nombre + " está actuando:");
        for (Musico m : musicos) {
            m.actuar();
        }
    }
}
