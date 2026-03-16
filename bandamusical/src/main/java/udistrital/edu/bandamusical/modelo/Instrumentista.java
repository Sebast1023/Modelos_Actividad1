package udistrital.edu.bandamusical.modelo;
/**
 *
 * 
 */
public class Instrumentista extends Musico{
    private Instrumento instrumento;

    public Instrumentista(String nombre, int edad) {
        super(nombre, edad);
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public void actuar() {       
        if (instrumento != null) {  
            if (instrumento instanceof Afinable afinable) {
                afinable.afinar();
            }
            instrumento.tocar();
        }
    }    
}
