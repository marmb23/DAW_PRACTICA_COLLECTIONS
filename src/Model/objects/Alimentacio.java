package Model.objects;
import java.time.LocalDate;

public abstract class Alimentacio extends Productes {
    LocalDate data_caducitat;
    /**
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Alimentacio(Float preu, String nom, LocalDate data_caducitat, String codi_barres) {
        super(preu, nom, codi_barres);
        this.data_caducitat = data_caducitat;
    }
}
