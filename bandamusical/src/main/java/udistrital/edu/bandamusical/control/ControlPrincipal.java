package udistrital.edu.bandamusical.control;

import udistrital.edu.bandamusical.modelo.Bateria;
import udistrital.edu.bandamusical.modelo.Cantante;
import udistrital.edu.bandamusical.modelo.Fiesta;
import udistrital.edu.bandamusical.modelo.GrupoMusical;
import udistrital.edu.bandamusical.modelo.Guitarra;
import udistrital.edu.bandamusical.modelo.Instrumentista;
import udistrital.edu.bandamusical.modelo.Instrumento;
import udistrital.edu.bandamusical.modelo.Maracas;
import udistrital.edu.bandamusical.modelo.Piano;

/**
 *
 * 
 */
public class ControlPrincipal {
    public static void main(String[] args) {
        // --- Crear músicos ---
        Cantante ana = new Cantante("Ana", 19);

        Instrumentista luis = new Instrumentista("Luis",20);
        Instrumentista carla = new Instrumentista("Carla",23);
        Instrumentista pablo = new Instrumentista("Pablo",28);

        // --- Crear instrumentos ---
        Instrumento piano = new Piano();       // Afinable
        Instrumento guitarra = new Guitarra(); // Afinable
        Instrumento bateria = new Bateria();   // No afinable
        Instrumento maracas = new Maracas();   // No afinable

        // --- Asignar instrumentos a instrumentistas ---
        luis.setInstrumento(guitarra);
        carla.setInstrumento(piano);
        pablo.setInstrumento(bateria);

        // --- Crear banda y agregar músicos ---
        GrupoMusical rockBand = new GrupoMusical("RockStars","rock");
        rockBand.agregarMusico(ana);
        rockBand.agregarMusico(luis);
        rockBand.agregarMusico(carla);

        // --- Crear fiesta y contratar banda ---
        Fiesta fiesta = new Fiesta("Cumpleaños de Pedro","parque central","20/03/2026");
        fiesta.contratarBanda(rockBand);

        // --- Iniciar fiesta ---
        fiesta.iniciar();
    }
}