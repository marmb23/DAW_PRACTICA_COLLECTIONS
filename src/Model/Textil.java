package Model;
import java.util.Comparator;

public class Textil extends Producte implements Comparator<Textil> {
    String composicio_textil;
    /**
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Textil(double preu, String nom, String composicio_textil, String codi_barres) {
        super(preu, nom, codi_barres);
        this.composicio_textil = composicio_textil;
    }

    // Getters
    public String getComposicio_textil() {
        return composicio_textil;
    }

    // Setters
    public void setComposicio_textil(String composicio_textil) {
        this.composicio_textil = composicio_textil;
    }

    public double calcularPreuFinal() {
        return preu;
    }

    public int compare(Textil t1, Textil t2) {
        return t1.getComposicio_textil().compareTo(t2.getComposicio_textil());
    }
}
