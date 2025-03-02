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

    public Float getPreu() {
        return preu;
    }

    public void setPreu(Float preu) {
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodi_barres() {
        return codi_barres;
    }

    public void setCodi_barres(String codi_barres) {
        this.codi_barres = codi_barres;
    }

    @Override
    public String toString() {
        return "Productes{" +
                "preu=" + preu +
                ", nom='" + nom + '\'' +
                ", codi_barres='" + codi_barres + '\'' +
                '}';
    }
}
