package Model.objects;
import java.time.LocalDate;

public abstract class Textil extends Productes {
    String composicio_textil;
    /**
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Textil(Float preu, String nom, String composicio_textil, String codi_barres) {
        super(preu, nom, codi_barres);
        this.composicio_textil = composicio_textil;
    }
}
