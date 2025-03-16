package Model.Objectes;
import Model.Excepcions.LimitCaractersException;
import Model.Excepcions.NegatiuException;

/**
 * Classe que defineix un producte d'electrònica
 */
public class Electronica extends Producte {

    Integer dies_garantia;

    /** Constructor de la classe Electronica
     * @param preu preu del producte extes de la classe Producte
     * @param nom nom del producte extes de la classe Producte
     * @param codi_barres codi de barres del producte extes de la classe Producte
     * @param dies_garantia dies de garantia del producte propi de la classe Electronica
     */
    public Electronica(String nom, double preu, String codi_barres, Integer dies_garantia) throws NegatiuException, LimitCaractersException {
        super(nom, preu, codi_barres);
        this.dies_garantia = dies_garantia;
    }

    // Getter
    public Integer getDies_garantia() {
        return dies_garantia;
    }

    // Setter
    public void setDies_garantia(Integer dies_garantia) {
        this.dies_garantia = dies_garantia;
    }

    /** Mètode per calcular el preu final del producte
     *
     * @return preu final del producte
     */
    public double calcularPreuFinal() {
        return preu + preu * ((double) dies_garantia / 365) * 0.1;
    }

    /**
     * Mètode per mostrar la informació del producte
     * @return informació del producte
     */
    @Override
    public String toString() {
        return "Electronica{" +
                "dies_garantia=" + dies_garantia +
                ", nom='" + nom + '\'' +
                ", preu=" + calcularPreuFinal() +
                ", codi_barres='" + codi_barres + '\'' +
                '}';
    }
}