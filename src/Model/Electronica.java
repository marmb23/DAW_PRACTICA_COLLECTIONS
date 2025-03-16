package Model;
import Model.Model.*;

public class Electronica extends Producte {

    Integer dies_garantia;

    /**
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Electronica(String nom, double preu, Integer dies_garantia, String codi_barres) throws NegatiuException, LimitCaractersException {
        super(nom, preu, codi_barres);
        this.dies_garantia = dies_garantia;
    }

    // Getters
    public Integer getDies_garantia() {
        return dies_garantia;
    }

    // Setters
    public void setDies_garantia(Integer dies_garantia) {
        this.dies_garantia = dies_garantia;
    }

    public double calcularPreuFinal() {
        return preu + preu * (dies_garantia / 365) * 0.1;
    }
}