package Model.objects;

public abstract class Productes {
    public Float preu;
    public String nom;
    public String codi_barres;

    /**
     *
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Productes(Float preu, String nom, String codi_barres) {
        this.preu = preu;
        this.nom = nom;
        this.codi_barres = codi_barres;
    }
}
