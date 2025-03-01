package Model.objects;

public abstract class Electronica extends Productes {
    Integer dies_garantia;
    /**
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Electronica(Float preu, String nom, Integer dies_garantia, String codi_barres) {
        super(preu, nom, codi_barres);
        this.dies_garantia = dies_garantia;
    }
}