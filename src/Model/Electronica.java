package Model;

public class Electronica extends Productes {

    Integer dies_garantia;

    /**
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Electronica(double preu, String nom, Integer dies_garantia, String codi_barres) {
        super(preu, nom, codi_barres);
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

    // toString
    @Override
    public String toString() {
        return "Electronica{" +
                "dies_garantia=" + dies_garantia +
                ", preu=" + preu +
                ", nom='" + nom + '\'' +
                ", codi_barres='" + codi_barres + '\'' +
                '}';
    }

    public double calcularPreuFinal() {
        return preu + preu * (dies_garantia / 365) * 0.1;
    }
}