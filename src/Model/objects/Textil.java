package Model.objects;
import java.time.LocalDate;

public class Textil extends Productes {
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

    public String getComposicio_textil() {
        return composicio_textil;
    }

    public void setComposicio_textil(String composicio_textil) {
        this.composicio_textil = composicio_textil;
    }

    @Override
    public String toString() {
        return "Textil{" +
                "composicio_textil='" + composicio_textil + '\'' +
                ", preu=" + preu +
                ", nom='" + nom + '\'' +
                ", codi_barres='" + codi_barres + '\'' +
                '}';
    }
}
