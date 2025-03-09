package Model.objects;

public class Electronica extends Productes {
    Integer dies_garantia;
    /**
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Electronica(Float preu, String nom, Integer dies_garantia, String codi_barres) {
        super(preu, nom, codi_barres);
        this.preu = preuFinal(preu);
        this.dies_garantia = dies_garantia;
    }

    public Integer getDies_garantia() {
        return dies_garantia;
    }

    public void setDies_garantia(Integer dies_garantia) {
        this.dies_garantia = dies_garantia;
    }

    @Override
    public String toString() {
        return "Electronica{" +
                "dies_garantia=" + dies_garantia +
                ", preu=" + preu +
                ", nom='" + nom + '\'' +
                ", codi_barres='" + codi_barres + '\'' +
                '}';
    }

    public Float preuFinal(Float preu) {
        return preu + preu*((float) dies_garantia /365)*0.1f;
    }
}